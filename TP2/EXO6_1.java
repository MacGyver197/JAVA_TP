import java.util.Scanner;

public class EXO6_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie du nombre à tester
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();

        // Vérifier si le nombre est premier
        if (estPremier(nombre)) {
            System.out.println(nombre + " est un nombre premier.");
        } else {
            System.out.println(nombre + " n'est pas un nombre premier.");
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
