package lista003;
import java.util.Scanner;

public class FiveFiveMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[5][5]; 
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Digite um número:");
                mat[i][j] = sc.nextInt();
            }
        }

        int cl = 0;
        int ln = 0;
        int maiorValor = mat[0][0];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > maiorValor) {
                    maiorValor = mat[i][j];
                    ln = i;
                    cl = j;
                }
            }
        }

        System.out.printf("O maior valor da matriz é %d na linha %d e coluna %d%n", maiorValor, ln, cl);
            
        sc.close();
    }
}
