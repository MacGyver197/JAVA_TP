import java.util.Scanner;

public class EXO6 {

    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);
        double x;

        System.out.print("Entrez un entier a : ");

        double a = scanner.nextDouble();

        System.out.print("Entrez un entier b : ");

        double b = scanner.nextDouble();

        // Fermer le scanner après utilisation
        scanner.close();

        if( a!= 0 )
        {
            x = b/a;
            System.out.println("La solution de l'équation est donc X = " + x);
        }
        else {
            System.out.println("Equation invalide !");
        }
    }
}