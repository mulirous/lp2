package lista001;

public class Circunferencia {
    public static void main(String[] args) {
        double raio = 2.8;
        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;
        
        System.out.println("Área da Circunferência: " + area + " cm²");
        System.out.println("Perímetro da Circunferência: " + perimetro + " cm");
    }
}
