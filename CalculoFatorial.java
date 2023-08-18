import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double x;
        
        System.out.print("Digite o valor para calcular o fatorial: ");
        x = sc.nextDouble();
        
        sc.close();
        
        double fatorial = calcularFatorial(x);
        
        System.out.println("O fatorial de " + x + " é: " + fatorial);
    }
    
    public static double calcularFatorial(double n) {
        if (n < 0) {
            System.out.println("O fatorial não está definido para números negativos.");
            return Double.NaN;
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            double f = n;
            while (n > 1) {
                n--;
                f *= n;
            }
            return f;
        }
    }
}
