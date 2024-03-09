import java.util.Scanner;

public class EXO8 {

    // Fonction pour calculer le PGCD en utilisant l'algorithme d'Euclide
    public static int calculerPGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier entier : ");
        int nombre1 = scanner.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int nombre2 = scanner.nextInt();

        // Calculer le PGCD en utilisant la fonction calculerPGCD
        int pgcd = calculerPGCD(nombre1, nombre2);

        System.out.println("Le PGCD de " + nombre1 + " et " + nombre2 + " est : " + pgcd);

        scanner.close();
    }
}