public class Livre {
    protected String titre;
    protected String auteur;
    protected String anneePublication;
    protected String categorie;
    protected boolean disponibilite;


    public Livre(String titre, String auteur, String anneePublication, String categorie, boolean disponibilite) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.categorie = categorie;
        this.disponibilite = disponibilite;
    }


    public boolean estEmpreinter() {
        return !disponibilite;
    }

    public boolean estDisponible() {
        return disponibilite;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    // Getter and setter methods
    public String getTitre() { return titre; }
    public String getAuteur() { return auteur; }
    public String getAnneePublication() { return anneePublication; }
    public String getCategorie() { return categorie; }

    public String getAnnee() {
        return anneePublication;
    }
}
