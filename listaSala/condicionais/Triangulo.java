import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um lado do triangulo:\n");
        int a = scanner.nextInt();
        System.out.print("Digite o outro lado do triangulo:\n");
        int b = scanner.nextInt();
        System.out.print("Digite o ultimo lado do triangulo:\n");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.print("Triangulo Equilatero\n");
        }
        else if ((a == b && a != c) || (b == c && b != a) || (a == c && a !=b)) {
            System.out.print("Triangulo Isoceles\n");
        }
        else {
            System.out.print("Triangulo Escaleno\n");
        }

        scanner.close();
    }
}