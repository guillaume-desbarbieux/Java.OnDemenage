import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalCartons = lireEntierPositifClavier("Quel est le nombre total de cartons ?");
        int capaciteCamion = lireEntierPositifClavier("Quelle est la capacité de chargement du camion ?");
        int nbVoyagesPleins = totalCartons / capaciteCamion;
        int cartonsRestants = totalCartons % capaciteCamion;
        int dernierVoyage = (cartonsRestants > 0) ? 1 : 0;
        afficherMessage(("Un voyage de " + capaciteCamion + " cartons.\n").repeat(nbVoyagesPleins));
        afficherMessage(("Un dernier voyage de " + cartonsRestants + " cartons.").repeat(dernierVoyage));
    }

    /**
     * Lis une entrée clavier
     * N'accepte que les entiers strictement positif
     * @param message Le message affiché à l'utilisateur pour le guider dans sa saisie
     * @return l'entier strictement positif saisi par l'utilisateur
     */
    public static int lireEntierPositifClavier(String message){
        Scanner clavier = new Scanner(System.in);
        int valeur;
        do {
            afficherMessage(message);
            valeur = clavier.nextInt();
            clavier.nextLine();
        } while (valeur < 1);
        return valeur;
    }

    /**
     * Affiche un message dans le terminal
     * @param message Le message à afficher
     */
    public static void afficherMessage(String message){
        System.out.println(message);
    }
}