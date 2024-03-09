import java.util.Scanner;

public class EXO6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le poids (en kg) : ");
        double poids = scanner.nextDouble();

        System.out.print("Entrez la taille (en m) : ");
        double taille = scanner.nextDouble();

        System.out.print("Entrez le sexe (F pour Femme, H pour Homme) : ");
        char sexe = scanner.next().charAt(0);

        // Calculer l'IMC
        double imc = calculerIMC(poids, taille);

        System.out.println("L'IMC est : " + imc);

        // Déterminer l'état de poids en fonction de l'IMC et du sexe
        determinerEtatPoids(imc, sexe);

        scanner.close();
    }

    // Fonction pour calculer l'IMC
    public static double calculerIMC(double poids, double taille) {
        return poids / (taille * taille);
    }

    // Fonction pour déterminer l'état de poids en fonction de l'IMC et du sexe
    public static void determinerEtatPoids(double imc, char sexe) {
        System.out.print("État de poids : ");

        if (sexe == 'F' || sexe == 'f') {
            if (imc < 19) {
                System.out.println("Maigreur");
            } else if (imc >= 19 && imc <= 24) {
                System.out.println("Poids normal");
            } else if (imc >= 24 && imc <= 30) {
                System.out.println("Surcharge pondérale");
            } else if (imc >= 30 && imc <= 40) {
                System.out.println("Adiposité");
            } else {
                System.out.println("Obésité");
            }
        } else if (sexe == 'H' || sexe == 'h') {
            if (imc < 20) {
                System.out.println("Maigreur");
            } else if (imc >= 20 && imc <= 25) {
                System.out.println("Poids normal");
            } else if (imc >= 25 && imc <= 30) {
                System.out.println("Surcharge pondérale");
            } else if (imc >= 30 && imc <= 40) {
                System.out.println("Adiposité");
            } else {
                System.out.println("Obésité");
            }
        } else {
            System.out.println("Sexe non reconnu.");
        }
    }
}
