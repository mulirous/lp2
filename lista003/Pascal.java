package lista003;
import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de linhas do Triângulo de Pascal: ");
        int n = sc.nextInt();
        int[][] triangPascal = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangPascal[i][j] = 1;
                }
                else {
                    triangPascal[i][j] = triangPascal[i - 1][j - 1] + triangPascal[i - 1][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangPascal[i][j] + "  ");
            }
            System.out.println();
        }

        sc.close();
    }
}
