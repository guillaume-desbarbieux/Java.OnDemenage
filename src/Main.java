import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

    public static void afficherMessage(String message){
        System.out.println(message);
    }
}