import java.util.Scanner;

public class Matematica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero A:");
        float a = scanner.nextFloat();

        System.out.print("Digite o numero B:");
        float b = scanner.nextFloat();
        
        System.out.print("Numero A: " + a + " e numero B: " + b + "\nEscolha uma opcao para fazer com os dois numeros\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Elevar A a B\n\n");

        int op = scanner.nextInt();

        float c = 0;

        switch (op) {
            case 1 -> c = a + b;
            case 2 -> c = a - b;
            case 3 -> c = a * b;
            case 4 -> c = a / b;
            case 5 -> c = a;
            default -> System.out.print("Opcao invalida\n");
        }

        if (c == a && b != 0){
            for (int i = 0; i < b; i++) {
                c = c * a;
            }
        }

        System.out.print(c);
        scanner.close();
    }
}

// REFAZER