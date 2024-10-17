package lista002;
import java.util.Scanner;

public class Euler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de serie do número de Euler: ");
        int n = sc.nextInt();

        double e = calcularEuler(n);

        System.out.printf("O número de Euler ára n = %d è: %.6f%n", n, e);

        sc.close();
    }

    public static double calcularEuler(int n) {
        double e = 0.0;

        for (int i = 0; i < n; i++) {
            e += 1.0 / fatorial(i);
        }

        return e;
    }

    public static long fatorial(int n) {
        long fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}
