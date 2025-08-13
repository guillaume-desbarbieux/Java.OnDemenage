import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int totalCartons = lireEntierPositifClavier("Quel est le nombre total de cartons ?");
        int capaciteCamion = lireEntierPositifClavier("Quelle est la capacité de chargement du camion ?");
        int nbVoyagesPleins = totalCartons / capaciteCamion;
        int cartonsRestants = totalCartons % capaciteCamion;
        int dernierVoyage = (cartonsRestants > 0) ? 1 : 0;
        writeToFile(("Un voyage de " + capaciteCamion + " cartons.\n").repeat(nbVoyagesPleins));
        writeToFile(("Un dernier voyage de " + cartonsRestants + " cartons.").repeat(dernierVoyage));
    }

    /**
     * Lis une entrée clavier
     * N'accepte que les entiers strictement positifs
     * @param message Le message affiché à l'utilisateur pour le guider dans sa saisie
     * @return l'entier strictement positif saisi par l'utilisateur
     */
    public static int lireEntierPositifClavier(String message){
        Scanner clavier = new Scanner(System.in);
        int valeur;
        try {
            do {
                afficherMessage(message);
                valeur = clavier.nextInt();
                clavier.nextLine();
            } while (valeur < 1);
            return valeur;
        } catch (Exception e) {
            afficherMessage("Erreur de saisie. \n" + e.getMessage());
        }
        return 0;
    }

    /**
     * Affiche un message dans le terminal
     * @param message Le message à afficher
     */
    public static void afficherMessage(String message){
        System.out.println(message);
    }

    public static void writeToFile(String message) {
        try {
            FileWriter writer = new FileWriter("output.txt", true);
            writer.write(message);
            writer.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}