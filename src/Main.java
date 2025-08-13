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

        FileWriter writer = openFileWriter("output.txt", false);
        if (writer != null) {
            writeToFile(writer, ("Un voyage de " + capaciteCamion + " cartons.\n").repeat(nbVoyagesPleins));
            writeToFile(writer, ("Un dernier voyage de " + cartonsRestants + " cartons.").repeat(dernierVoyage));
            closeFileWriter(writer);
        } else {
            System.out.println("Erreur !");
        }


    }

    /**
     * Lis une entrée clavier
     * N'accepte que les entiers strictement positifs
     *
     * @param message Le message affiché à l'utilisateur pour le guider dans sa saisie
     * @return l'entier strictement positif saisi par l'utilisateur
     */
    public static int lireEntierPositifClavier(String message) {
        Scanner clavier = new Scanner(System.in);
        int valeur;
        try {
            do {
                displayMessage(message);
                valeur = clavier.nextInt();
                clavier.nextLine();
            } while (valeur < 1);
            return valeur;
        } catch (Exception e) {
            displayMessage("Erreur de saisie. \n" + e.getMessage());
        }
        return 0;
    }

    /**
     * Affiche un message dans le terminal
     *
     *
     * @param message Le message à afficher
     */
    public static void displayMessage(String message) {
        System.out.println(message);
    }

    /**
     * Ouvre un FileWriter
     * @param filename Nom du fichier de destination
     * @param append Booléen (Vrai pour écrire à la suite, Faux pour écraser le fichier)
     * @return le FileWriter
     */
    public static FileWriter openFileWriter(String filename, Boolean append){
        try {
            return new FileWriter(filename, append);
        } catch (IOException e) {
            System.out.println("An opening error occurred.");
        }
        return null;
    }

    /**
     * Ecris un message dans un fichier
     * @param writer Writer à utiliser
     * @param message Message à écrire
     */
    public static void writeToFile(FileWriter writer, String message) {
        try {
            writer.write(message);
        } catch (IOException e) {
            System.out.println("A writing error occurred.");
        }
    }

    /**
     * Ferme un FileWriter
     * @param writer writer à fermer
     */
    public static void closeFileWriter(FileWriter writer) {
        try {
            writer.close();
        } catch (IOException e) {
            System.out.println("A closing error occurred.");
        }
    }
}