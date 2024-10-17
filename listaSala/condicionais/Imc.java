import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua altura em cm\n");
        int alturaCm = scanner.nextInt();
        System.out.print("Digite seu peso em kg:\n");
        int pesoKg = scanner.nextInt();

        float imc = pesoKg / (alturaCm *alturaCm);

        if (imc < 18.5) {
            System.out.print("Baixo Peso\n");
        }
        else if (imc > 18.6 && imc < 24.9) {
            System.out.print("Peso Normal\n");
        }
        else if (imc > 25 && imc < 29.9) {
            System.out.print("Sobrepeso\n");
        }
        else if (imc > 30 && imc < 34.9) {
            System.out.print("Obesidade 1\n");
        }
        else if (imc > 35 && imc < 39.9) {
            System.out.print("Obesidade 2\n");
        }
        else {
            System.out.print("Obesidade 3\n");
        }

        scanner.close();
    }
}
