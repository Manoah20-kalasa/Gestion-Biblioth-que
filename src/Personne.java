public abstract class Personne {
    protected String nom;
    protected String adresse;
    protected int age;

    public Personne() {}

    public Personne(String nom, String adresse, int age) {
        this.nom = nom;
        this.adresse = adresse;
        this.age = age;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return nom + " (" + age + " ans) - " + adresse;
    }
}
