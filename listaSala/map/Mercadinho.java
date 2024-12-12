import java.util.*;

public class Mercadinho {
    public static void main(String[] args) {
        // Criando hashmap de catálogo dos itens
        Map<Integer, String> catalogo = new HashMap<>();

        // Criando hashmap do estoque
        Map<Integer, Integer> estoque = new HashMap<>();

        // Adicionando itens ao catálogo
        catalogo.put(100, "Arroz");
        catalogo.put(101, "Macarrão");
        catalogo.put(102, "Feijão");
        catalogo.put(103, "Sabonete");

        // Adicionando itens ao estoque com suas respectivas quantidades
        estoque.put(100, 33);
        estoque.put(101, 20);
        estoque.put(102, 10);
        estoque.put(103, 47);

        // Exibindo o catálogo e o estoque
        exibirCatalogo(catalogo);
        exibirEstoque(estoque, catalogo);
    }

    public static void exibirCatalogo(Map<Integer, String> itens) {
        System.out.println("Catálogo de Itens:");
        for (Map.Entry<Integer, String> entry : itens.entrySet()) {
            System.out.println("Código: " + entry.getKey() + ", Item: " + entry.getValue());
        }
    }

    public static void exibirEstoque(Map<Integer, Integer> estoque, Map<Integer, String> itens) {
        System.out.println("\nEstoque Disponível:");
        for (Map.Entry<Integer, Integer> entry : estoque.entrySet()) {
            int codigo = entry.getKey();
            int quantidade = entry.getValue();
            String nomeItem = itens.get(codigo);
            System.out.println("Item: " + nomeItem + "||  Quantidade: " + quantidade);
        }
    }
}
