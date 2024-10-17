package lista003;
import java.util.Arrays;
import java.util.Scanner;

public class Invertido {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tamanho = 5;
    int[] original = new int[5];
    int[] invertido = new int[5];
    
    for (int i = 0; i < tamanho; i++) {
        System.out.println("Digite um número:");
        original[i] = sc.nextInt();
    }

    System.out.println("Este é o seu Array invertido:\n");

    for (int i = 0; i < tamanho; i++) {
        invertido[i] = original[tamanho - i - 1];
    }

    System.out.printf(Arrays.toString(invertido), "\n");
    
    sc.close();
    }
}
