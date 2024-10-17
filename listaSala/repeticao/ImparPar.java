package listaSala.repeticao;
import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número e verifique se ele é impar ou par\n(Digite 0 para sair)\n");
        int valor = sc.nextInt();

        while (valor != 0) {
            int imparPar = valor % 2;

            if (imparPar == 0) {
                System.out.print("Par\n");
            }
            else {
                System.out.print("Impar\n");
            }

            valor = sc.nextInt();
        }
        
        sc.close();
    }
}
