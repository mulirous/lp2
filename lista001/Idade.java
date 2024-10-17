package lista001;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();

        int anos = dias / 365;
        int meses = (dias % 365) / 30;
        int diasRestantes = (dias % 365) % 30;
        
        System.out.println(anos + " anos, " + meses + " meses e " + diasRestantes + " dias");
    
        scanner.close();
    }
}

