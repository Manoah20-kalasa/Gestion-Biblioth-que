public class Roman extends Livre {
    private String genre;

    public Roman(String titre, String auteur, String anneePublication, String categorie, boolean disponibilite, String genre) {
        super(titre, auteur, anneePublication, categorie, disponibilite);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Roman{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", anneePublication='" + anneePublication + '\'' +
                ", categorie='" + categorie + '\'' +
                ", disponibilite=" + disponibilite +
                ", genre='" + genre + '\'' +
                '}';
    }
}
