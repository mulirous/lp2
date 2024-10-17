package lista002;
import java.util.Scanner;

public class Notas {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota da primeira Unidade: ");
        float n1 = sc.nextFloat();
        System.out.println("Digite sua nota da segunda Unidade: ");
        float n2 = sc.nextFloat();
        System.out.println("Digite sua nota da terceira Unidade: ");
        float n3 = sc.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        System.out.println("Sua nota final é: " + media);
        if (media >= 6.0) System.out.println("Você está aprovado!\n");
        else if (media < 6.0 && media >= 4.0) System.out.println("Você está de recuperação...\n");
        else System.out.println("Você reprovou, boa sorte da próxima vez...\n");

        sc.close();
    }
}
