package lista002;
import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um caractere: ");
        String input = sc.next();
        char caractere = input.charAt(0);

        if (Character.isDigit(caractere)) {
            System.out.println(caractere + " é um número.");
        } else if ("aeiouAEIOU".indexOf(caractere) != -1) {
            System.out.println(caractere + " é uma vogal.");
        } else if (Character.isLetter(caractere)) {
            System.out.println(caractere + " é uma consoante.");
        } else {
            System.out.println(caractere + " é um símbolo.");
        }

        sc.close();
    }
}
