import java.util.*;
import java.util.stream.Collectors;

public class Agrupar {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 15, 22, 37, 56, 87, 92, 98, 99, 101, 110); 

        Map<Boolean, List<Integer>> numeroAgrupados = numeros.stream()
                                         .collect(Collectors.partitioningBy(n -> n % 2 != 0));

        List<Integer> numerosAgrupadosResultado = new ArrayList<>();
        numerosAgrupadosResultado.addAll(numeroAgrupados.get(true));
        numerosAgrupadosResultado.addAll(numeroAgrupados.get(false));

        System.out.println("Ímpares na frente, pares atrás: " + numerosAgrupadosResultado);
    }
}
