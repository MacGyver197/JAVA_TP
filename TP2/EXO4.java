import java.util.Scanner;

public class EXO4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir le nombre de lignes N
        System.out.print("Entrez le nombre de lignes N : ");
        int N = scanner.nextInt();

        // Afficher le triangle d'étoiles
        afficherTriangleEtoiles(N);

        scanner.close();
    }

    // Fonction pour afficher le triangle d'étoiles
    public static void afficherTriangleEtoiles(int N) {
        System.out.println("Triangle d'étoiles :");

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
