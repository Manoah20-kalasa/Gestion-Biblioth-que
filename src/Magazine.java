public class Magazine extends Livre
{
    private String numEdition;



    public Magazine(String titre, String auteur, String anneePublication, String categorie, boolean disponibilite, String numEdition) {
        super(titre, auteur, anneePublication, categorie, disponibilite);
        this.numEdition = numEdition;
    }

    public String getNumEdition() {
        return numEdition;
    }

    public void setNumEdition(String numEdition) {
        this.numEdition = numEdition;
    }
    public void afficherEdition()
    {
        System.out.println(numEdition);
    }
    @Override
    public String toString() {
        return "Livre{" +
                " titre ='" + super.titre + '\'' +
                ", auteur ='" + super.auteur + '\'' +
                ", anneePublication ='" +  super.anneePublication + '\'' +
                ", categorie ='" +  super.categorie + '\'' +
                ", disponibilite =" + super. disponibilite +'\''+
                ", numeroEdition = "+ this.numEdition+

                '}';
    }
}
