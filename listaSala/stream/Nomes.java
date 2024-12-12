import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Nomes {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Carlos", "Francisco", "Chagas", "Eduardo", "Fábio", "Baltazar", "Gaspar", "Fred", "Bela");

        List<String> nomesFiltrados = nomes.stream()    
                                        .filter(s -> (s.length() > 5))
                                        .sorted()
                                        .collect(Collectors.toList());

        System.out.println("Nomes restantes: " + nomesFiltrados);
    }
}
