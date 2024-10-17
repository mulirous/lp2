package lista001;
import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = scanner.nextDouble();
        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        double velocidade = scanner.nextDouble();

        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12;
        System.out.println("Litros de combustível gastos: " + litrosUsados);

        scanner.close();
    }
}
