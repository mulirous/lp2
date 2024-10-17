package lista003;
import java.util.Scanner;

public class MovimentoTorre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tab = new char[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tab[i][j] = ' ';
            }
        }

        for (int i = 2; i <= 9; i++) {
            tab[0][i] = (char) ('0' + i - 1);
            tab[i][0] = (char) ('0' + i - 1);
        }

        tab[1][1] = '+';
        for (int i = 2; i < 10; i++) {
            tab[1][i] = '_';
            tab[i][1] = '|';
        }

        System.out.print("Em qual Linha a Torre está localizada (1-8)? ");
        int ln = sc.nextInt();
        ln += 1;

        System.out.print("Em qual Coluna a Torre está localizada (1-8)? ");
        int col = sc.nextInt();
        col += 1;

        if (ln < 2 || ln > 9 || col < 2 || col > 9) {
            System.out.println("Posição inválida. As linhas e colunas devem estar entre 1 e 8.");
            sc.close();
            return;
        }

        tab[ln][col] = 'T';

        for (int i = 2; i < 10; i++) {
            if (i != ln) {
                tab[i][col] = 'X';
            }
            if (i != col) {
                tab[ln][i] = 'X';
            }
        }

        tab[0][0] = '-';
        tab[1][0] = '-';
        tab[0][1] = '-';

        System.out.println("Tabuleiro de Xadrez:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i > 1 && j > 1) System.out.print("[" + tab[i][j] + "]");
                else System.out.print("|" + tab[i][j] + "|");
            }
            System.out.println();
        }

        sc.close();
    }
}
