public class Administrateur extends Personne implements Connexion {
    public Administrateur(String nom, String adresse, int age) {
        super(nom, adresse, age);
    }

    public void ajouterLivre(Livre livre) {
        GestionnaireLivre gestionnaire = GestionnaireLivre.getInstance();
        gestionnaire.livresExistants.add(livre);
        System.out.println("Livre ajouté : " + livre.getTitre());
    }

    public void supprimerLivre(String titre) {
        GestionnaireLivre gestionnaire = GestionnaireLivre.getInstance();
        for (Livre livre : gestionnaire.livresExistants) {
            if (livre.getTitre().equals(titre)) {
                gestionnaire.livresExistants.remove(livre);
                System.out.println("Livre supprimé : " + titre);
                return;
            }
        }
        System.out.println("Livre introuvable.");
    }

    @Override
    public void seConnecter() {
        System.out.println("Administrateur connecté.");
    }

    @Override
    public void sInscrire() {
        System.out.println("Administrateur inscrit.");
    }
}
