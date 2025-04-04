import java.util.ArrayList;

public class GestionnaireLivre {
    private static GestionnaireLivre instance;
    public ArrayList<Livre> livresExistants;

    private GestionnaireLivre() {
        livresExistants = new ArrayList<>();
    }

    public static GestionnaireLivre getInstance() {
        if (instance == null) instance = new GestionnaireLivre();
        return instance;
    }

    public Livre rechercherParTitre(String titre) {
        for (Livre l : livresExistants) {
            if (l.getTitre().equalsIgnoreCase(titre)) {
                return l;
            }
        }
        return null;
    }

    public void afficherTousLesLivres() {
        for (Livre l : livresExistants) {
            System.out.println(l);
        }
    }
}
