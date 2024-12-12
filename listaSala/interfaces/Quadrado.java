public class Quadrado {
    public static void main(String[] args) {
        Square quadrado = (x) -> x * x;
        
        System.out.println(quadrado.calculate(10));
    }
}

@FunctionalInterface
interface Square {
    public double calculate(double x);
}
