package listaSala.encapsulamento.encapsulamento2;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class ListaSala {
    public static void main(String[] args) {
        Retangulo rec = new Retangulo();
        rec.setLargura();
        rec.setAltura();

        System.out.printf("Altura: %.2f\nLargura: %.2f\n", rec.getAltura(), rec.getLargura());

        TrianguloRetangulo triang = new TrianguloRetangulo();
        triang.setCatetoAltura();
        triang.setCatetoBase();

        triang.setHipotenusa();

        System.out.printf("A hipotenusa do triângulo é %.2f", triang.getHipotenusa());
    }
}

class Retangulo {
    private double largura;
    private double altura;
    private Scanner sc = new Scanner(System.in);

    public void setAltura() {
        System.out.println("Digite um valor para a altura: ");
        this.altura = sc.nextDouble();
    }

    public double getAltura() {
        return this.altura;
    }

    public void setLargura() {
        System.out.println("Digite um valor para a largura: ");
        this.largura = sc.nextDouble();
    }

    public double getLargura() {
        return this.largura;
    }

    public double getArea() {
        return this.altura * this.largura;
    }

    public double getPerimetro() {
        return (this.altura * 2) + (this.largura * 2);
    }
}

class TrianguloRetangulo {
    private double catetoBase;
    private double catetoAltura;
    private double hipotenusa;

    private Scanner sc = new Scanner(System.in);

    public void setCatetoAltura() {
        System.out.println("Digite um valor para o cateto altura: ");
        this.catetoAltura = sc.nextDouble();
    }

    public double getCatetoAltura() {
        return this.catetoAltura;
    }

    public void setCatetoBase() {
        System.out.println("Digite um valor para o cateto base: ");
        this.catetoBase = sc.nextDouble();
    }

    public double getCatetoBase() {
        return this.catetoBase;
    }

    public void setHipotenusa() {
        this.hipotenusa = sqrt((this.catetoAltura * this.catetoAltura) + (this.catetoBase * this.catetoBase));
    }

    public double getHipotenusa() {
        return this.hipotenusa;
    }
}
