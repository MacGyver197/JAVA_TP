import java.util.Scanner;

public class EXO2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'heure (0-23) : ");
        int heure = scanner.nextInt();

        System.out.print("Entrez les minutes (0-59) : ");
        int minutes = scanner.nextInt();

        // Vérifier si les valeurs entrées par l'utilisateur sont correctes
        if (heure < 0 || heure > 23 || minutes < 0 || minutes > 59) {
            System.out.println("Les valeurs entrées ne sont pas correctes.");
            return;
        }

        // Calculer l'heure suivante
        calculerHeure(heure, minutes);

        scanner.close();
    }
0
    // Fonction pour calculer l'heure suivante et l'afficher
    public static void calculerHeure(int heure, int minutes) {
        minutes += 1;

        // Vérifier si les minutes dépassent 59
        if (minutes == 60) {
            minutes = 0;  // Réinitialiser les minutes à 0
            heure += 1;   // Ajouter une heure

            // Vérifier si l'heure dépasse 23
            if (heure == 24) {
                heure = 0;  // Réinitialiser l'heure à 0
            }
        }

        System.out.println("L'heure suivante sera : " + String.format("%02d", heure) + " heure(s) " + String.format("%02d", minutes));
    }
}
