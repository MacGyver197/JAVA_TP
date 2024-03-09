import java.util.Scanner;

public class EXO1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander le nombre N
        System.out.print("Entrez le nombre N : ");
        int N = scanner.nextInt();

        // Utiliser while pour calculer la somme, le produit et la moyenne
        calculerEtAfficherWhile(N);

        // Utiliser do-while pour calculer la somme, le produit et la moyenne
        calculerEtAfficherDoWhile(N);

        // Utiliser for pour calculer la somme, le produit et la moyenne
        calculerEtAfficherFor(N);

        scanner.close();
    }

    // Fonction pour calculer et afficher la somme, le produit et la moyenne en utilisant while
    public static void calculerEtAfficherWhile(int N) {
        int somme = 0;
        int produit = 1;
        int nombre;
        int compteur = 0;

        System.out.println("\nUtilisation de while :");

        while (compteur < N) {
            System.out.print("Entrez un nombre : ");
            nombre = scanner.nextInt();

            somme += nombre;
            produit *= nombre;

            compteur++;
        }

        double moyenne = (double) somme / N;

        afficherResultats(somme, produit, moyenne);
    }

    // Fonction pour calculer et afficher la somme, le produit et la moyenne en utilisant do-while
    public static void calculerEtAfficherDoWhile(int N) {
        int somme = 0;
        int produit = 1;
        int nombre;
        int compteur = 0;

        System.out.println("\nUtilisation de do-while :");

        do {
            System.out.print("Entrez un nombre : ");
            nombre = scanner.nextInt();

            somme += nombre;
            produit *= nombre;

            compteur++;
        } while (compteur < N);

        double moyenne = (double) somme / N;

        afficherResultats(somme, produit, moyenne);
    }

    // Fonction pour calculer et afficher la somme, le produit et la moyenne en utilisant for
    public static void calculerEtAfficherFor(int N) {
        int somme = 0;
        int produit = 1;

        System.out.println("\nUtilisation de for :");

        for (int i = 0; i < N; i++) {
            System.out.print("Entrez un nombre : ");
            int nombre = scanner.nextInt();

            somme += nombre;
            produit *= nombre;
        }

        double moyenne = (double) somme / N;

        afficherResultats(somme, produit, moyenne);
    }

    // Fonction pour afficher la somme, le produit et la moyenne
    public static void afficherResultats(int somme, int produit, double moyenne) {
        System.out.println("Somme : " + somme);
        System.out.println("Produit : " + produit);
        System.out.println("Moyenne : " + moyenne);
    }

    // Scanner utilisé pour la saisie au clavier
    static Scanner scanner = new Scanner(System.in);
}
