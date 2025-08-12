import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int totalCartons = 0;
        int capaciteCamion = 0;

        do {
            if (totalCartons < 1) {
                System.out.println("Quel est le nombre total de cartons ?");
                totalCartons = clavier.nextInt();
                clavier.nextLine();
            }

            if (capaciteCamion < 1) {
                System.out.println("Quel est la capacité de chargement du camion ?");
                capaciteCamion = clavier.nextInt();
                clavier.nextLine();
            }
        } while (totalCartons < 1 || capaciteCamion < 1);

        clavier.close();

        int nbVoyagesPleins = totalCartons / capaciteCamion;
        int cartonsRestants = totalCartons % capaciteCamion;
        int dernierVoyage = 1;
        if (cartonsRestants == 0) {
            dernierVoyage = 0;
        }

        System.out.println(
                 ("Un voyage de " + capaciteCamion + " cartons.\n").repeat(nbVoyagesPleins)
                +("Un dernier voyage de " + cartonsRestants + " cartons.").repeat(dernierVoyage));
    }
}