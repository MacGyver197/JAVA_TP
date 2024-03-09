import java.util.Scanner;

public class EXO3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier positif : ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Veuillez entrer un entier positif.");
            return;
        }

        if (estNombreParfait(n)) {
            System.out.println(n + " est un nombre parfait.");
        } else {
            System.out.println(n + " n'est pas un nombre parfait.");
        }

        scanner.close();
    }

    // Fonction pour vérifier si un nombre est parfait
    public static boolean estNombreParfait(int nombre) {
        int sommeDiviseurs = 0;

        // Parcourir les diviseurs potentiels jusqu'à la moitié du nombre
        for (int i = 1; i <= nombre / 2; i++) {
            if (nombre % i == 0) {
                // i est un diviseur de nombre
                sommeDiviseurs += i;
            }
        }

        // Vérifier si la somme des diviseurs est égale au nombre
        return sommeDiviseurs == nombre;
    }
}
