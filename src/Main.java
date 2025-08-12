import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Quel est le nombre total de cartons ?");
        int totalCartons = clavier.nextInt();

        System.out.println("Quel est la capacité de chargement du camion ?");
        int capaciteCamion = clavier.nextInt();

        clavier.close();

        int cartonsRestants = totalCartons;

        while (cartonsRestants > capaciteCamion) {
            System.out.println("Un voyage de " + capaciteCamion + " cartons.");
            cartonsRestants -= capaciteCamion;
        }
        if (cartonsRestants > 0) {
            System.out.println("Un dernier voyage de " + cartonsRestants + " cartons.");
        }
    }
}