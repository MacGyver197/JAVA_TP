import java.util.Scanner;

public class EXO5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Déclaration d'un tableau de 22 éléments pour les buts inscrits par les joueurs
        int[] butsJoueurs = new int[22];

        // Entrer le nombre de buts inscrits par chacun des joueurs
        for (int i = 0; i < butsJoueurs.length; i++) {
            System.out.print("Entrez le nombre de buts inscrits par le joueur n°" + (i + 1) + " : ");
            butsJoueurs[i] = scanner.nextInt();
        }

        // Afficher le numéro du buteur de l'équipe
        int numeroButeur = trouverNumeroButeur(butsJoueurs);
        System.out.println("Le numéro du buteur de l'équipe est : " + (numeroButeur + 1));

        // Afficher le nombre total des buts inscrits par cette équipe
        int totalButs = calculerTotalButs(butsJoueurs);
        System.out.println("Le nombre total des buts inscrits par cette équipe est : " + totalButs);

        // Afficher le nombre des joueurs qui n'ont pas marqué de buts
        int joueursSansButs = compterJoueursSansButs(butsJoueurs);
        System.out.println("Le nombre de joueurs qui n'ont pas marqué de buts est : " + joueursSansButs);

        // Mettre à jour le tableau pour le joueur n° 9 qui vient d'inscrire 2 buts
        mettreAJourButsJoueur(butsJoueurs, 9, 2);

        // Afficher le tableau mis à jour
        System.out.println("Tableau mis à jour après le but du joueur n°9 :");
        afficherTableau(butsJoueurs);

        // Fermer le scanner
        scanner.close();
    }

    // Fonction pour trouver le numéro du buteur de l'équipe
    public static int trouverNumeroButeur(int[] butsJoueurs) {
        int numeroButeur = 0;
        int maxButs = butsJoueurs[0];

        for (int i = 1; i < butsJoueurs.length; i++) {
            if (butsJoueurs[i] > maxButs) {
                maxButs = butsJoueurs[i];
                numeroButeur = i;
            }
        }

        return numeroButeur;
    }

    // Fonction pour calculer le nombre total des buts inscrits par l'équipe
    public static int calculerTotalButs(int[] butsJoueurs) {
        int totalButs = 0;

        for (int buts : butsJoueurs) {
            totalButs += buts;
        }

        return totalButs;
    }

    // Fonction pour compter le nombre de joueurs qui n'ont pas marqué de buts
    public static int compterJoueursSansButs(int[] butsJoueurs) {
        int joueursSansButs = 0;

        for (int buts : butsJoueurs) {
            if (buts == 0) {
                joueursSansButs++;
            }
        }

        return joueursSansButs;
    }

    // Fonction pour mettre à jour le nombre de buts d'un joueur
    public static void mettreAJourButsJoueur(int[] butsJoueurs, int numeroJoueur, int nouveauxButs) {
        // Vérifier si le numéro de joueur est valide
        if (numeroJoueur >= 1 && numeroJoueur <= butsJoueurs.length) {
            butsJoueurs[numeroJoueur - 1] += nouveauxButs;
        } else {
            System.out.println("Numéro de joueur invalide.");
        }
    }

    // Fonction pour afficher le tableau
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Joueur n°" + (i + 1) + " : " + tableau[i] + " but(s)");
        }
    }
}

