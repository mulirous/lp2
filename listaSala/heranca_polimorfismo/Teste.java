package heranca_polimorfismo;

public class Teste {
    public static void main(String[] args) {
        Aluno a = new Aluno();
    }
}

class Pessoa {
    public Pessoa() {
        System.out.println("Nasci\n");
    }
}

class Aluno extends Pessoa {
    public Aluno () {
        System.out.println("Me matriculei\n");
    }
    
}