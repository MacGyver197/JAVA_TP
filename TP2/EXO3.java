import java.util.Scanner;

public class EXO3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisir le nombre N
        System.out.print("Entrez le nombre N : ");
        int N = scanner.nextInt();

        // Calculer la somme des N premiers termes de la série harmonique
        double somme = calculerSommeHarmonique(N);

        // Afficher le résultat
        System.out.println("La somme des " + N + " premiers termes de la série harmonique est : " + somme);

        scanner.close();
    }

    // Fonction pour calculer la somme des N premiers termes de la série harmonique
    public static double calculerSommeHarmonique(int N) {
        double somme = 0.0;

        for (int i = 1; i <= N; i++) {
            somme += 1.0 / i;
        }

        return somme;
    }
}
