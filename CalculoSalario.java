import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        
        double horasTrabalhadas, valorHora, salarioBruto, salarioLiquido;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = sc.nextDouble();

        System.out.print("Digite o valor da hora trabalhada: ");
        valorHora = sc.nextDouble();

        sc.close();

        salarioBruto = horasTrabalhadas * valorHora;

        double desconto = salarioBruto * 0.3;
        salarioLiquido = salarioBruto - desconto;

        // Exibe os resultados
        System.out.println("=== Resultados ===");
        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
}