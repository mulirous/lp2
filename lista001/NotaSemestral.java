package lista001;
import java.util.Scanner;

public class NotaSemestral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da primeira prova do 1º bimestre: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota da segunda prova do 1º bimestre: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a nota da primeira prova do 2º bimestre: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite a nota da segunda prova do 2º bimestre: ");
        double nota4 = scanner.nextDouble();

        double mediaBimestre1 = (nota1 + nota2) / 2;
        double mediaBimestre2 = (nota3 + nota4) / 2;
        double notaSemestral = (mediaBimestre1 + mediaBimestre2) / 2;
        
        System.out.println("Nota semestral: " + notaSemestral);

        scanner.close();
    }
}
