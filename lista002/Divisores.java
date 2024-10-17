package lista002;
import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga um número para obter seus divisores: ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) System.out.printf("%d é divisor de %d\n", i, x);
        }

        sc.close();
    }
}
