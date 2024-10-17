package lista002;
import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Boolean Verifica = false;

        while (!Verifica) {
            System.out.println("Senha: ");
            String pass = sc.next();

            if (pass == "1234") {
                System.out.print("ACESSO PERMITIDO\n");
                Verifica = true;
            }
            else {
                System.out.print("ACESSO NEGADO\n");
            }
        }

        sc.close();
    }
}
