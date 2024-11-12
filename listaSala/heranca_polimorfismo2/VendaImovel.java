
public class VendaImovel {
    public static void main(String[] args) {
        Novo n = new Novo("Amintas Barros, 345", 1220000, 1.1);
        Velho v = new Velho("Amintas Barros, 365", 1220000, 0.8);

        n.getInfo();
        v.getInfo();
    }
}


class Imovel {
    private double preco;
    public String endereco;

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public double getPrice() {
        return this.preco;
    }

    public String getEnd() {
        return this.endereco;
    }
}

class Novo extends Imovel {
    public Novo(String endereco, double preco, double addPrice) {
        super(endereco, preco * addPrice);
    }

    public void getInfo() {
        System.out.println("O imovel Novo localizado em " + getEnd() + " tem o preço de " + getPrice() + "R$");
    }

}

class Velho extends Imovel {
    public Velho(String endereco, double preco, double addPrice) {
        super(endereco, preco * addPrice);
    }

    public void getInfo() {
        System.out.println("O imovel Velho localizado em " + getEnd() + " tem o preço de " + getPrice() + "R$");
    }

}