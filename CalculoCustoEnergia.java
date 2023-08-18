import java.util.Scanner;

public class CalculoCustoEnergia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioMinimo, consumoQuilowatt, valorTotal;

        System.out.print("Digite o valor do salário mínimo: ");
        salarioMinimo = sc.nextDouble();

        System.out.print("Digite a quantidade de quilowatts consumida no mês: ");
        consumoQuilowatt = sc.nextDouble();

        sc.close();

        double valorPorQuilowatt = salarioMinimo / 500;

        valorTotal = consumoQuilowatt * valorPorQuilowatt;

        System.out.printf("O valor a ser pago é: R$%.2f%n", valorTotal);
    }
}
