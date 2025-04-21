import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionnaireLivre gestionnaire = GestionnaireLivre.getInstance();

        // Création de l'admin
        Administrateur admin = new Administrateur("Admin", "Bibliothèque Centrale", 40);
        admin.ajouterLivre(new Roman("Naruto", "Masashi Kishimoto", "1998", "Manga", true, "Shonen"));
        admin.ajouterLivre(new Roman("DBZ", "Akira Toriyama", "1984", "Manga", true, "Action"));
        LivreDAO dao=new LivreDAO();
        dao.ajouterLivre(new Roman("Nanatsu no taizen","suzuki","2010","Manga",true,"shonen"));
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();
        Lecteur lecteur = new Lecteur(nom, "adresse inconnue", 20);
        lecteur.sInscrire();

        boolean quitter = false;
        while (!quitter) {
            System.out.println("\n=== MENU BIBLIOTHÈQUE ===");
            System.out.println("1. Voir tous les livres");
            System.out.println("2. Emprunter un livre");
            System.out.println("3. Retourner un livre");
            System.out.println("4. Mes livres empruntés");
            System.out.println("5. Quitter");

            System.out.print("Choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // vider le buffer

            switch (choix) {
                case 1:
                    lecteur.consulterLivresDisponibles();
                    break;
                case 2:
                    System.out.print("Titre du livre à emprunter : ");
                    String emprunt = scanner.nextLine();
                    lecteur.emprunterLivre(emprunt);
                    break;
                case 3:
                    System.out.print("Titre du livre à retourner : ");
                    String retour = scanner.nextLine();
                    lecteur.retournerLivre(retour);
                    break;
                case 4:
                    System.out.println("Vos livres empruntés :");
                    for (Livre l : lecteur.livresEmpruntes) {
                        System.out.println(l);
                    }
                    break;
                case 5:
                    quitter = true;
                    System.out.println("Merci et à bientôt !");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }

        scanner.close();
    }
}
