import java.util.Scanner;

public class ClassificacaoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ladoA, ladoB, ladoC, anguloA, anguloB, anguloC;

        System.out.print("Digite o lado A: ");
        ladoA = sc.nextDouble();
        System.out.print("Digite o lado B: ");
        ladoB = sc.nextDouble();
        System.out.print("Digite o lado C: ");
        ladoC = sc.nextDouble();
        System.out.print("Digite o ângulo A: ");
        anguloA = sc.nextDouble();
        System.out.print("Digite o ângulo B: ");
        anguloB = sc.nextDouble();
        System.out.print("Digite o ângulo C: ");
        anguloC = sc.nextDouble();

        sc.close();

        double somaAngulos = anguloA + anguloB + anguloC;
        if (somaAngulos == 180) {
            System.out.println("O triângulo é retângulo");
        } else if (anguloA > 90 || anguloB > 90 || anguloC > 90) {
            System.out.println("O triângulo é obtusângulo");
        } else {
            System.out.println("O triângulo é acutângulo");
        }

        if (ladoA == ladoB && ladoA == ladoC) {
            System.out.println("O triângulo é equilátero");
        } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
            System.out.println("O triângulo é isósceles");
        } else {
            System.out.println("O triângulo é escaleno");
        }
    }
}
