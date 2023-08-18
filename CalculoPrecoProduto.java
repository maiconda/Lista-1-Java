import java.util.Scanner;

public class CalculoPrecoProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, qntProduto;
        double precoFinal = 0;

        System.out.print("Digite o código do produto: ");
        codigo = sc.nextInt();
        
        System.out.print("Digite a quantidade do produto: ");
        qntProduto = sc.nextInt();

        sc.close();

        if (codigo >= 1 && codigo <= 10) {
            precoFinal = 10 * qntProduto;
        } else if (codigo >= 11 && codigo <= 20) {
            precoFinal = 15 * qntProduto;
        } else if (codigo >= 21 && codigo <= 30) {
            precoFinal = 20 * qntProduto;
        } else if (codigo >= 31 && codigo <= 40) {
            precoFinal = 40 * qntProduto;
        }

        if (precoFinal <= 250) {
            precoFinal -= precoFinal * 0.05;
        } else if (precoFinal > 250 && precoFinal <= 500) {
            precoFinal -= precoFinal * 0.10;
        } else if (precoFinal > 500) {
            precoFinal -= precoFinal * 0.15;
        }

        System.out.printf("O preço final foi: R$%.2f%n", precoFinal);
    }
}
