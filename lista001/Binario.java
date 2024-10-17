package lista001;
import java.util.Scanner;

public class Binario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro menor que 32: ");
        int numero = scanner.nextInt();
        String binario = "";

        while (numero > 0) {
            binario = (numero % 2) + binario;
            numero = numero / 2;
        }
        
        System.out.println("Número em binário: " + binario);

        scanner.close();
    }
}
