import java.util.Scanner;

public class EXO4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer deux entiers positifs
        System.out.print("Entrez le premier entier positif (n) : ");
        int n = scanner.nextInt();

        System.out.print("Entrez le deuxième entier positif (m) : ");
        int m = scanner.nextInt();

        // Vérifier si les entiers sont positifs
        if (n <= 0 || m <= 0) {
            System.out.println("Veuillez entrer deux entiers positifs.");
            return;
        }

        // Vérifier si les entiers sont amis et afficher le résultat
        if (sontNombresAmis(n, m)) {
            System.out.println(n + " et " + m + " sont des nombres amis.");
        } else {
            System.out.println(n + " et " + m + " ne sont pas des nombres amis.");
        }

        // Fermer le scanner
        scanner.close();
    }

    // Fonction pour vérifier si deux nombres sont amis
    public static boolean sontNombresAmis(int n, int m) {
        // Calculer la somme des diviseurs de n et m
        int sommeDiviseursN = calculerSommeDiviseurs(n);
        int sommeDiviseursM = calculerSommeDiviseurs(m);

        // Vérifier si les sommes des diviseurs sont égales aux nombres
        return sommeDiviseursN == m && sommeDiviseursM == n;
    }

    // Fonction pour calculer la somme des diviseurs d'un nombre
    public static int calculerSommeDiviseurs(int nombre) {
        int sommeDiviseurs = 0; // Initialiser à 0 pour ne pas prendre en compte le diviseur 1

        // Parcourir les diviseurs potentiels jusqu'à la moitié du nombre
        for (int i = 2; i < nombre; i++) {
            if (nombre % i == 0) {
                // i est un diviseur de nombre
                sommeDiviseurs += i;
            }
        }

        return sommeDiviseurs;
    }
}
