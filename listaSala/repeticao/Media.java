package repeticao;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        float b = 0;

        System.out.print("Digite 5 numeros e veja sua média:\n");
        do {
            float a = sc.nextInt();

            b += a;

            c += 1;
        } while (c != 5);

        float media = b / 5;

        System.out.print("Valor da média: " + media + "\n");

        sc.close();
    }
}
