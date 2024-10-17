package lista001;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int quociente = num1 / num2;
        int resto = num1 % num2;
        
        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);

        scanner.close();
    }
}

