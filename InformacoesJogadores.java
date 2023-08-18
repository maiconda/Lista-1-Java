import java.util.Scanner;

public class InformacoesJogadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int times = 2; // Você pode modificar o número de times aqui
        int jogadores = 2; // Você pode modificar o número de jogadores por time aqui
        int[][] idade = new int[times][jogadores];
        double[][] peso = new double[times][jogadores];
        double[][] altura = new double[times][jogadores];

        for (int t = 0; t < times; t++) {
            System.out.println("=== Time " + (t + 1) + " ===");
            for (int j = 0; j < jogadores; j++) {
                System.out.println("Digite a idade do jogador " + (j + 1) + " do Time " + (t + 1) + ":");
                idade[t][j] = sc.nextInt();

                System.out.println("Digite o peso do jogador " + (j + 1) + " do Time " + (t + 1) + ":");
                peso[t][j] = sc.nextDouble();

                System.out.println("Digite a altura do jogador " + (j + 1) + " do Time " + (t + 1) + ":");
                altura[t][j] = sc.nextDouble();
            }
        }

        sc.close();
    }
}
