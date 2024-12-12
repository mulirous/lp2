import java.util.*;

public class OrdenarString {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("A");
        lista.add("Tres");
        lista.add("Duzentos");

        Comparator<String> comparator = (s1, s2) -> s2.length() - s1.length();

        lista.sort(comparator);

        System.out.println(lista);
    }
}