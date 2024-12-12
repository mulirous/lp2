import java.util.*;
import java.util.stream.Collectors;

public class Exemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = numeros.stream()
                                .filter(n -> n % 2 == 0) // Filtra apenas os números pares
                                .map(n -> n * 2) // Mutiplica esses números por 2
                                .collect(Collectors.toList()); // Coleta e insere os números na Lista  
        
        System.out.println(result); // Imprime os números resultantes
    }
}