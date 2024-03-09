import java.util.Scanner;

public class EXO2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la base X : ");
        int X = scanner.nextInt();

        System.out.print("Entrez l'exposant N : ");
        int N = scanner.nextInt();

        // Calculer X^N
        long resultat = calculerPuissance(X, N);

        // Afficher le résultat
        System.out.println(X + "^" + N + " = " + resultat);

        scanner.close();
    }

    // Fonction pour calculer X^N par multiplications successives
    public static long calculerPuissance(int X, int N) {
        long resultat = 1;

        for (int i = 1; i <= N; i++) {
            resultat *= X;
        }

        return resultat;
    }
}
