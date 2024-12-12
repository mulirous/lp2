import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<Integer>();

        System.out.println("Insira agora 10 números inteiros quaisquer: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "° número: ");
            lista.add(sc.nextInt());
        }

        BuscaBinaria busca = new BuscaBinaria(lista);

        Collections.sort(lista);

        System.out.println();
        System.out.println("Aqui está a sua lista ordenada:");
        System.out.println(lista);
        System.out.println();

        Boolean lock = true;
        Boolean found;
        int op;

        while (lock) {
            System.out.print("Deseja buscar algum número específico? [0 - Não | 1 - Sim] ");
            op = sc.nextInt();
            System.out.println();
            int x;

            if (op == 1) {
                do {
                    System.out.print("Insira o número que deseja encontrar na lista: ");
                    x = sc.nextInt();
                    System.out.println();

                    long start = System.nanoTime();
                    found = busca.buscar(x);
                    long end = System.nanoTime();

                    if (found) {
                        double searchingTime = (end - start) / 1_000_000_000.0;
                        System.out.println();
                        System.out.println("O tempo de busca foi de " + searchingTime + "s");
                        System.out.println();
                    }
                } while (!found);
            } else {
                lock = false;
            }
        }

        sc.close();
    }
}

class BuscaBinaria {
    private List<Integer> lista;

    public BuscaBinaria(List<Integer> lista) {
        this.lista = lista;
    }

    public Boolean buscar(int x) {
        Collections.sort(lista);

        int esquerda = 0;
        int direita = lista.size() - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (lista.get(meio) == x) {
                System.out.println("Número " + x + " encontrado na posição: " + (meio + 1));
                System.out.println();
                return true;
            }

            if (lista.get(meio) < x) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        System.out.println("Número " + x + " não encontrado na lista.");
        System.out.println();
        return false;
    }
}
