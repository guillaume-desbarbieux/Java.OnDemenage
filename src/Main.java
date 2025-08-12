import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int totalCartons = 0;
        while(totalCartons<1) {
            System.out.println("Quel est le nombre total de cartons ?");
            totalCartons = clavier.nextInt();
            clavier.nextLine();
        }

        int capaciteCamion = 0;
        while(capaciteCamion<1) {
            System.out.println("Quel est la capacité de chargement du camion ?");
            capaciteCamion = clavier.nextInt();
            clavier.nextLine();
        }

        clavier.close();

        int cartonsRestants = totalCartons;
        int nombreDeVoyages = 0;

        while (cartonsRestants >= capaciteCamion) {
            nombreDeVoyages++;
            System.out.println("Un voyage de " + capaciteCamion + " cartons.");
            cartonsRestants -= capaciteCamion;
        }
        System.out.println("Nous avons fait " + nombreDeVoyages + " voyages de " + capaciteCamion + " cartons.");
        if (cartonsRestants > 0) {
            System.out.println("Faisons un dernier voyage de " + cartonsRestants + " cartons.");
        }
    }
}