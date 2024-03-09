import java.util.Scanner;

public class EXO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tableau = new int[10];

        System.out.println("Entrez 10 éléments pour le tableau :");
        for (int i = 0; i < 10; i++) {
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
