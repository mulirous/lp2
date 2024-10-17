package lista002;
import java.util.Scanner;

public class Bissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano:\n");
        int ano = sc.nextInt();

        if (isBissexto(ano)) {
            System.out.println(ano + " é um ano bissexto.\n");
        } else {
            System.out.println(ano + " não é um ano bissexto.\n");
        }
        
        sc.close();
    }

    public static boolean isBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
