import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha um numero entre 1 e 15\n");
        int a = sc.nextInt();

        int valor = (int)(Math.random() * 16);

        if (valor == a) {
            System.out.print("Voce ganhou o sorteio :0\n");
        }
        else {
            System.out.print("Voce não ganhou o sorteio ;(\n");
        }

        sc.close();
    }
}
