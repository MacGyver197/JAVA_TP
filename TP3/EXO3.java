import java.util.Scanner;

public class EXO3 {
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

        System.out.println("Les éléments du tableau sont :");
        for (int element : tableau) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
}
