import java.util.Scanner;

public class EXO5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de n : ");
        int n = scanner.nextInt();

        // Calculer n! avec une boucle while
        long factorielWhile = calculerFactorielWhile(n);
        System.out.println("n! avec boucle while : " + factorielWhile);

        // Calculer n! avec une boucle for
        long factorielFor = calculerFactorielFor(n);
        System.out.println("n! avec boucle for : " + factorielFor);

        scanner.close();
    }

    // Fonction pour calculer n! avec une boucle while
    public static long calculerFactorielWhile(int n) {
        long resultat = 1;
        int i = 1;

        while (i <= n) {
            resultat *= i;
            i++;
        }

        return resultat;
    }

    // Fonction pour calculer n! avec une boucle for
    public static long calculerFactorielFor(int n) {
        long resultat = 1;

        for (int i = 1; i <= n; i++) {
            resultat *= i;
        }

        return resultat;
    }
}
