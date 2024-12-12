package heranca_polimorfismo;

public class FormasGeometricas2 {
    public static void main(String[] args) {
        Circulo c = new Circulo(10, "Roxo", true);
        Retangulo r = new Retangulo(5, 2, "Amarelo", false);
        Quadrado q = new Quadrado(5, "Azul", true);

        c.showInfo();
        r.showInfo();
        q.showInfo();
    }
}

abstract class Forma {
    protected String cor;
    protected boolean filled;

    public Forma(String cor, boolean filled) {
        this.cor = cor;
        this.filled = filled;
    }

    public abstract void calcularArea();
    public abstract void calcularPerimetro();
    public abstract void showInfo();
}

class Circulo extends Forma {
    private double raio;

    public Circulo(double raio, String cor, boolean filled) {
        super(cor, filled);
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        System.out.println("A área do circulo é " + (3.14 * this.raio * this.raio) + " de raio " + this.raio);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("O perimetro do circulo é " + (2 * 3.14 * this.raio));
    }

    @Override
    public void showInfo() {
        System.out.println("O ciruclo é " + this.cor + " e ele é " + (this.filled ? "vazado" : "preenchido"));
        calcularArea();
        calcularPerimetro();

        System.out.println();
        System.out.println();
    }
}

class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura, String cor, boolean filled) {
        super(cor, filled);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("A área do retangulo é " + (this.altura * this.largura) + " com altura " + this.altura + " e largura " + this.largura);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("O perimetro do retangulo é " + (2 * this.altura + 2 * this.largura));
    }

    @Override
    public void showInfo() {
        System.out.println("O retangulo é " + this.cor + " e ele é " + (this.filled ? "vazado" : "preenchido"));
        calcularArea();
        calcularPerimetro();

        System.out.println();
        System.out.println();
    }
}

class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado, String cor, boolean filled) {
        super(cor, filled);
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        System.out.println("A área do retangulo é " + (this.lado * this.lado) + " com lado " + this.lado);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("O perimetro do retangulo é " + (4 * this.lado));
    }

    @Override
    public void showInfo() {
        System.out.println("O quadrado é " + this.cor + " e ele é " + (this.filled ? "vazado" : "preenchido"));
        calcularArea();
        calcularPerimetro();

        System.out.println();
        System.out.println();
    }
}
