import java.util.Scanner;

public class VerificadorPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        boolean primo;

        for (int j = 0; j < 5; j++) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            primo = true;

            if (numero <= 1) {
                primo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.println("O número digitado é primo!");
            } else {
                System.out.println("O número não é primo!");
            }
        }

        sc.close();
    }
}
