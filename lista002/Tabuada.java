package lista002;

public class Tabuada {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.printf("%d * %d = %d%n", i, j, i * j);
            }
            System.out.println("\n\n\n");
        }
    }
}
