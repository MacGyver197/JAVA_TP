import java.util.Scanner;

public class EXO1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer les deux entiers
        System.out.print("Entrez un entier a : ");
        int a = scanner.nextInt();

        System.out.print("Entrez un entier b : ");
        int b = scanner.nextInt();

        // Calculer et afficher la somme
        int somme = a + b;
        System.out.println("La somme est : " + somme);

        // Calculer et afficher la différence
        int difference = a - b;
        System.out.println("La différence est : " + difference);

        // Calculer et afficher le produit
        int produit = a * b;
        System.out.println("Le produit est : " + produit);

        // Vérifier si le deuxième nombre est non nul avant de calculer le quotient
        if (b != 0) {
            // Calculer et afficher le quotient
            double quotient = (double) a / b;
            System.out.println("Le quotient est : " + quotient);
        } else {
            System.out.println("Le quotient n'est pas défini car b vaut 0.");
        }

        // Fermer le scanner
        scanner.close();
    }
}