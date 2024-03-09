import java.util.Scanner;

public class EXO6_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de N : ");
        int N = scanner.nextInt();

        // Tester tous les nombres entre 1 et N
        System.out.println("Nombres premiers entre 1 et " + N + " :");
        for (int i = 1; i <= N; i++) {
            if (estPremier(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    // Fonction pour vérifier si un nombre est premier
    public static boolean estPremier(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

