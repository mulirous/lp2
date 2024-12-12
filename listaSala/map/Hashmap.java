import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        //criação do hashmap
        Map<Integer, String> lista = new HashMap<>();


        //adicionar nomes a minha lista
        lista.put(101, "Maria");
        lista.put(102, "Mariana");
        lista.put(103, "Marina");
        lista.put(104, "Marcela");
        lista.put(105, "Marize");
        lista.put(106, "Marilia");

        //imprime o map
        for (Map.Entry<Integer, String> entry : lista.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " - Nome: " + entry.getValue());
        }

        //procurando valores a partir da chave
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ID do aluno para a consulta: ");
        int id = sc.nextInt();

        String nome = lista.get(id);

        if(nome != null) {
            System.out.println("Aluno encontrado: " + nome);
        } else {
            System.out.println("Aluno não encontrado.");
        }

        sc.close();
    }
}

class Aluno {
    private String name;
    private Boolean presenca = false;

    Aluno (String nome) {
        this.name = nome;
    }

    public String getName() {
        return this.name;
    }

    public String getPresenca() {
        if (presenca) return "Presente";
        else return "Ausente";
    }
    
    public void changePresenca() {
        this.presenca = !this.presenca;
    }
}

