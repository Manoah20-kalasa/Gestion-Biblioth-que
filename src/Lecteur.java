import java.util.ArrayList;

public class Lecteur extends Personne implements Connexion {
    ArrayList<Livre> livresEmpruntes = new ArrayList<>();
    private GestionnaireLivre gestionnaire = GestionnaireLivre.getInstance();

    public Lecteur() {}

    public Lecteur(String nom, String adresse, int age) {
        super(nom, adresse, age);
    }

    public boolean emprunterLivre(String titre) {
        Livre livre = gestionnaire.rechercherParTitre(titre);
        if (livre != null && livre.estDisponible()) {
            livresEmpruntes.add(livre);
            livre.setDisponibilite(false);
            System.out.println("Vous avez emprunté : " + livre.getTitre());
            return true;
        }
        System.out.println("Livre indisponible.");
        return false;
    }

    public boolean retournerLivre(String titre) {
        for (Livre l : livresEmpruntes) {
            if (l.getTitre().equalsIgnoreCase(titre)) {
                l.setDisponibilite(true);
                livresEmpruntes.remove(l);
                System.out.println("Livre retourné : " + titre);
                return true;
            }
        }
        System.out.println("Livre non trouvé dans vos emprunts.");
        return false;
    }

    public void consulterLivresDisponibles() {
        System.out.println("Livres disponibles :");
        for (Livre l : gestionnaire.livresExistants) {
            if (l.estDisponible()) {
                System.out.println(l);
            }
        }
    }

    @Override
    public void seConnecter() {
        System.out.println("Connexion réussie : " + this.nom);
    }

    @Override
    public void sInscrire() {
        System.out.println("Inscription réussie : " + this.nom);
    }
}
