import java.util.*;

public class Pipenline {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int pipeline = numeros.stream()
                                    .filter(n -> n % 2 == 1) // Filtra para apenas números ímpares
                                    .map(n -> n * n) // Transforma cada número em seu quadrado
                                    .reduce(0, (n, m) -> n + m); // Faz um somatório de todos os números e retorna o valor desse somatório

        System.out.println(pipeline); // Imprime o número resultado
    }
}
