public class Biographie extends Livre
{
    private String personnageBiographique;



    public Biographie(String titre, String auteur, String anneePublication, String categorie, boolean disponibilite, String personnageBiographique) {
        super(titre, auteur, anneePublication, categorie, disponibilite);
        this.personnageBiographique = personnageBiographique;
    }

    public String getPersonnageBiographique() {
        return personnageBiographique;
    }

    public void setPersonnageBiographique(String personnageBiographique) {
        this.personnageBiographique = personnageBiographique;
    }

    @Override
    public String toString() {
        return "Livre{" +
                " titre ='" + super.titre + '\'' +
                ", auteur ='" + super.auteur + '\'' +
                ", anneePublication ='" +  super.anneePublication + '\'' +
                ", categorie ='" +  super.categorie + '\'' +
                ", disponibilite =" + super. disponibilite +'\''+
                ", genre = "+ this.personnageBiographique+

                '}';
    }
}
