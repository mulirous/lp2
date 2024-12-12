import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        //criação do hashmap
        Hashtable<Integer, String> alunos = new Hashtable<>();

        //adicionar nomes a minha lista
        alunos.put(101, "Maria");
        alunos.put(102, "Mariana");
        alunos.put(103, "Marina");
        alunos.put(104, "Marcela");
        alunos.put(105, "Marize");
        alunos.put(106, "Marilia");

        //imprime o map
        for (Integer id : alunos.keySet()) {
            System.out.println("ID: " + id + ", Nome: " + alunos.get(id));
        }
    }
}