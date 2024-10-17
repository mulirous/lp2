package lista001;
import java.util.Scanner;

public class CircuitoResistencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de R1: ");
        double R1 = scanner.nextDouble();
        System.out.print("Digite o valor de R2: ");
        double R2 = scanner.nextDouble();
        System.out.print("Digite o valor de R3: ");
        double R3 = scanner.nextDouble();

        double resistenciaParalela = (R1 * R2) / (R1 + R2);
        double resistenciaEquivalente = resistenciaParalela + R3;

        System.out.println("Resistência equivalente: " + resistenciaEquivalente);
    
        scanner.close();
    }
}
