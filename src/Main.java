import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int totalCartons;
        int capaciteCamion;

        do {
            System.out.println("Quel est le nombre total de cartons ?");
            totalCartons = clavier.nextInt();
            clavier.nextLine();

            System.out.println("Quel est la capacité de chargement du camion ?");
            capaciteCamion = clavier.nextInt();
            clavier.nextLine();

        } while (totalCartons<1 || capaciteCamion<1);

        clavier.close();

        int nbVoyagesPleins = totalCartons/capaciteCamion;
        int cartonsRestants = totalCartons%capaciteCamion;

        System.out.println(("Un voyage de " + capaciteCamion + " cartons.\n").repeat(nbVoyagesPleins));

        System.out.println("Nous avons fait " + nbVoyagesPleins + " voyages de " + capaciteCamion + " cartons.");

        if (cartonsRestants > 0) {
            System.out.println("Faisons un dernier voyage de " + cartonsRestants + " cartons.");
        }
    }
}