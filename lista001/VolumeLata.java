package lista001;

public class VolumeLata {
    public static void main(String[] args) {
        double raio = 2.6;
        double altura = 22.1;
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        
        System.out.println("Volume da lata de óleo: " + volume + " cm³");
    }
}

