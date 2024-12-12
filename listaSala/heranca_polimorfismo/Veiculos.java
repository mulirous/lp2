package heranca_polimorfismo;

public class Veiculos {
    public static void main(String[] args) {
        Carro c = new Carro("Ford", "Ka");
        Moto m = new Moto("Honda", "CB500"); 

        c.exibirInforomacoes();
        c.acelerar();
        System.out.println();
        m.exibirInforomacoes();
        m.acelerar();
    }
}

abstract class Veiculo {
    public String marca;
    public String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void exibirInforomacoes();
}

class Carro extends Veiculo {
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void exibirInforomacoes() {
        System.out.println("Carro");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }

    public void acelerar() {
        System.out.println("VRUMMMMM!");
    }
}

class Moto extends Veiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void exibirInforomacoes() {
        System.out.println("Moto");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }

    public void acelerar() {
        System.out.println("TUTUTUTUUTUTUTUTUUT!");
    }
}