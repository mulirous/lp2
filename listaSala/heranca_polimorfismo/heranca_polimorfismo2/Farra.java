package heranca_polimorfismo.heranca_polimorfismo2;

public class Farra {
    public static void main(String[] args) {
        Normal n = new Normal();
        CamaroteInferior ci = new CamaroteInferior(150.90);
        CamaroteSuperior cs = new CamaroteSuperior(200.99);

        n.showNormal();
        System.out.println();
        ci.showCamaroteInferior();
        System.out.println();
        cs.showCamaroteSuperior();
        System.out.println();
    }
}

class Ingresso {
    private double valor = 200.0;

    public void imprimeValor() {
        System.out.println("O valor do ingresso é " + this.valor);
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}


class Vip extends Ingresso {
    private double addValor;

    public Vip(double addValor){
        this.addValor = addValor;
    }

    public void showVip() {
        setValor(getValor() + addValor);
        System.out.println("Este ingresso é VIP");
        imprimeValor();
    }
}

class Normal extends Ingresso {
    public void showNormal() {
        System.out.println("Este ingresso é Normal");
        imprimeValor();
    }
}

class CamaroteInferior extends Vip {
    public CamaroteInferior(double addValor) {
        super(addValor);
    }

    public void showCamaroteInferior() {
        System.out.println("Este é um ingresso para o Camarote Inferior!");
        showVip();
    }
}
class CamaroteSuperior extends Vip {
    public CamaroteSuperior(double addValor) {
        super(addValor);
    }

    public void showCamaroteSuperior() {
        System.out.println("Este é um ingresso para o Camarote Superior!");
        showVip();
    }
}