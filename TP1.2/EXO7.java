import java.util.Scanner;

public class EXO7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander l'âge
        System.out.print("Entrez l'âge : ");
        int age = scanner.nextInt();

        // Demander le sexe (H pour Homme, F pour Femme)
        System.out.print("Entrez le sexe (H pour Homme, F pour Femme) : ");
        char sexe = scanner.next().charAt(0);

        // Vérifier si la personne est imposable
        if (estImposable(age, sexe)) {
            System.out.println("La personne est imposable.");
        } else {
            System.out.println("La personne n'est pas imposable.");
        }

        scanner.close();
    }

    // Fonction pour vérifier si une personne est imposable
    public static boolean estImposable(int age, char sexe) {
        if ((sexe == 'H' || sexe == 'h') && age > 20) {
            return true;  // Hommes de plus de 20 ans
        } else if ((sexe == 'F' || sexe == 'f') && age >= 18 && age <= 35) {
            return true;  // Femmes entre 18 et 35 ans
        } else {
            return false; // Autres ne paient pas d'impôt
        }
    }
}
