package lista003;
import java.util.Scanner;

public class SumUnderDiagonalPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira os elementos de uma matriz a seguir:\n");
        int[][] mat = new int [3][3];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("Digite um número para o elemento [%d][%d]: ", i + 1, j + 1);
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("A matriz é seguinte:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("A soma dos elementos acima da sua diagonal principal é: " + SomaAcimaDiagonalPrincipal(mat));
    
        sc.close();
    }

    public static int SomaAcimaDiagonalPrincipal(int mat[][]){
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i > j) {
                    sum += mat[i][j];
                }
            }
        }

        return sum;
    };
}
