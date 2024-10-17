package lista003;
import java.util.Scanner;

public class MultiMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[3][2];
        int[][] C = new int[2][2];
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.println("Digite um número para a matriz A:");
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.println("Digite um número para a matriz B:");
                B[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                C[i][j] = 0;
                for (int k = 0; k < A[i].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matriz Resultante da Multiplicação de A x B:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + "  ");
            }
            System.out.println();
        }

        sc.close();
    }
}
