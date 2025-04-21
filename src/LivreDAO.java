

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class LivreDAO {

    public void ajouterLivre(Livre livre) {
        String sql = "INSERT INTO Livre (titre, auteur, anneePublication,categorie,disponibilite) VALUES (?, ?, ?,?,?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, livre.getTitre());
            stmt.setString(2, livre.getAuteur());
            stmt.setString(3, livre.getAnnee());
            stmt.setString(4,livre.getCategorie());
            stmt.setBoolean(5,livre.disponibilite);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout du livre : " + e.getMessage());
        }
    }

    public List<Livre> listerLivres() {
        List<Livre> livres = new ArrayList<>();
        String sql = "SELECT * FROM livres";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Livre livre = new Livre(
                        rs.getString("titre"),

                        rs.getString("auteur"),
                        rs.getString("anneePublication"),
                        rs.getString("categorie"),
                        rs.getBoolean("disponibilite")
                );
                livres.add(livre);
            }

        } catch (SQLException e) {
            System.out.println("Erreur lors de la récupération des livres : " + e.getMessage());
        }
        return livres;
    }

    public void supprimerLivre(String titre) {
        String sql = "DELETE FROM livres WHERE titre = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, titre);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erreur lors de la suppression du livre : " + e.getMessage());
        }
    }

    public Livre chercherLivreParTitre(String titre) {
        String sql = "SELECT * FROM livres WHERE titre = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, titre);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Livre(rs.getString("titre"),

                        rs.getString("auteur"),
                            rs.getString("anneePublication"),
                            rs.getString("categorie"),
                            rs.getBoolean("disponibilite")
                    );
                }
            }

        } catch (SQLException e) {
            System.out.println("Erreur lors de la recherche du livre : " + e.getMessage());
        }
        return null;
    }
}