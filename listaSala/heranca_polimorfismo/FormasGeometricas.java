package heranca_polimorfismo;

public class FormasGeometricas {
    public static void main(String[] args) {
        Circulo c = new Circulo(10);
        Retangulo r = new Retangulo(5, 2);

        c.calcularArea();
        r.calcularArea();
    }
}

abstract class Forma {
    public abstract void calcularArea();
}

class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        System.out.println("A área do circulo é " + (3.14 * this.raio * this.raio) + " de raio " + this.raio);
    }
}

class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("A área do retangulo é " + (this.altura * this.largura) + " com altura " + this.altura + " e largura " + this.largura);
    }
}
