import java.util.Scanner;

public class CalculoFatorialIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.print("Digite o início do intervalo: ");
        n1 = sc.nextInt();
        System.out.print("Digite o fim do intervalo: ");
        n2 = sc.nextInt();

        sc.close();

        for (int i = n1; i <= n2; i++) {
            int fatorial = calcularFatorial(i);
            System.out.println("O fatorial de " + i + " é: " + fatorial);
        }
    }

    public static int calcularFatorial(int n) {
        if (n < 0) {
            System.out.println("O fatorial não está definido para números negativos.");
            return -1;
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            int f = n;
            while (n > 1) {
                n--;
                f *= n;
            }
            return f;
        }
    }
}
