import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Controlador c = new Controlador();
        c.loop(pessoas);

        obterMemoriaUsada();
        antes();
        depois();
    }

    public static long obterMemoriaUsada() {
        int MB = 1024 * 1024;
        Runtime runtime = Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory()) / MB;
    }

    public static void antes() {
        System.out.println("Memória utilizada durante o programa: " + obterMemoriaUsada() + " MB");
    }

    public static void depois() {
        System.gc();
        System.out.println("Garbage Collector chamado.");
        System.out.println("Memória atual após a coleta feita: " + obterMemoriaUsada() + " MB");
    }
}

class Controlador {
    private Scanner sc = new Scanner(System.in);

    public void loop(List<Pessoa> pessoas) {
        int op = 1000;
        while (op != 0) {
            System.out.println("Escolha uma opção abaixo");
            System.out.printf(" 1 - Adicionar Pessoa\n 2 - Remover Pessoa\n 0 - Sair\n");
            System.out.print("Opção: ");
            op = sc.nextInt();
            sc.nextLine();
            System.out.println();
            switch (op) {
                case 1:
                    adicionarContato(pessoas);
                    break;
                case 2:
                    removerContato(pessoas);
                    break;
                default:
                    break;
            }
        }

    }

    public void adicionarContato(List<Pessoa> pessoas) {
        System.out.print("nome da pessoa a ser adicionada: ");
        String pessoa = sc.nextLine();
        pessoas.add(new Pessoa(pessoa));
    }


    public void removerContato(List<Pessoa> pessoas) {
        System.out.print("Digite o nome do contato para remove-lo: ");
        String nomeRemove = sc.nextLine();

        for (Pessoa p : pessoas) {
            if (nomeRemove.equalsIgnoreCase(p.nome)) {
                pessoas.remove(p);
                System.out.println("Pessoa removida!");
                System.out.println();
                return;
            }
        }
    }

    public void antes() {
        
    }
    
}

class Pessoa {
    public String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
}