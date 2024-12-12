    import java.util.*;
import java.util.stream.Collectors;

    public class Frase {
        public static void main(String[] args) {
            String frase = "programacao em java"; // Frase a ser utilizada

            List<Character> letras = new ArrayList<>(); // Lista que vai conter todas as letras inicialmente

            for (int i = 0; i < frase.length(); i++) {
                letras.add(frase.charAt(i)); // get das letras da frase, individualmente
            }
            
            System.out.println(letras); // Log da lista para conferir

            List<Character> letrasNaoRepetidasOrdenadas = letras.stream() // Inicio da stream
                                                            .filter(n -> n != ' ') // Filtrar para não conter espaços vazios
                                                            .distinct() // Remoção de duplicatas
                                                            .sorted() // Ordenação
                                                            .collect(Collectors.toList()); // Retorna a lista com as letras sem duplicadas e ordenadas em ordem alfabetica

            
            System.out.println(letrasNaoRepetidasOrdenadas); // Log da lista desejada
        }
    }
