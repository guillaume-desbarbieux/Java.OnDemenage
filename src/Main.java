//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int totalCartons = 34;
        int capaciteCamion = 9;

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