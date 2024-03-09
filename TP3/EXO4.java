import java.util.Scanner;

public class EXO4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taille;

        do {
            System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
            taille = scanner.nextInt();
        } while (taille < 10 || taille > 50);

        int[] tableau = new int[taille];

        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < taille; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        System.out.println("Les éléments du tableau avant suppression des occurrences de 5 :");
        for (int element : tableau) {
            System.out.print(element + " ");
        }

        supprimerOccurrencesEtTasser(tableau, 5);

        System.out.println("\nLes éléments du tableau après suppression des occurrences de 5 :");
        for (int element : tableau) {
            System.out.print(element + " ");
        }

        scanner.close();
    }

    public static void supprimerOccurrencesEtTasser(int[] tableau, int valeur) {
        int newSize = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] != valeur) {
                tableau[newSize] = tableau[i];
                newSize++;
            }
        }
        for (int i = newSize; i < tableau.length; i++) {
            tableau[i] = 0; // Tassez les éléments restants
        }
    }
}
