package heranca_polimorfismo;

public class Teste2 {
    public static void main(String[] args) {
        Gato g = new Gato();
    }
}

class Animal {
    public Animal() {
        System.out.println("Sou um animal");
    }
}

class Felino extends Animal {
    public Felino() {
        System.out.println("Sou um felino");
    }
}

class Gato extends Felino {
    public Gato() {
        System.out.println("Sou um gato");
    }
}