import java.util.Scanner;

public class CalculoTroco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor total da compra?");
        double compra = sc.nextDouble();

        System.out.println("Qual o valor do valor dado?");
        double valor = sc.nextDouble();

        double troco = valor - compra;

        if (troco < 1) {
            System.out.println("O troco devera ser: " + String.format("%.2f centavos", troco));
        } else {
            System.out.println("O troco devera ser: " + troco + " reais");
        }
    }
}
