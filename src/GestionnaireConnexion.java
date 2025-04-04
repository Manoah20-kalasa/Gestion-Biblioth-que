import java.util.ArrayList;

public class GestionnaireConnexion {
    private static GestionnaireConnexion instance;
    public ArrayList<Personne> personnes;

    private GestionnaireConnexion() {
        personnes = new ArrayList<>();
    }

    public static GestionnaireConnexion getInstance() {
        if (instance == null) {
            instance = new GestionnaireConnexion();
        }
        return instance;
    }

    public void ajouterPersonne(Personne p) {
        personnes.add(p);
    }
}
