
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        Desconto desconto = (p) -> {
            if (p.getIdade() >= 60) {
                return p.getSalario() * 0.95;
            } 
            else if (p.getIdade() < 60 && p.getIdade() >= 40){
                return p.getSalario() * 0.85;
            } 
            else if (p.getIdade() < 40 && p.getIdade() >= 30) {
                return p.getSalario() * 0.75;
            } 
            else {
                return p.getSalario() * 0.5;
            } 
        };

        pessoas.add(new Pessoa("Murilo", 19, 2000));
        pessoas.add(new Pessoa("Rodrigo", 26, 3800));
        pessoas.add(new Pessoa("Susane", 45, 770));
        pessoas.add(new Pessoa("Mario", 70, 29000));
        pessoas.add(new Pessoa("Sinomar", 39, 8000));
        pessoas.add(new Pessoa("Marilia", 23, 5000));


        Collections.sort(pessoas, Comparator.comparing(Pessoa::getNome)); 
        System.out.println("Aqui estão os nomes ordenados em ordem alfabética:"); 
        pessoas.forEach(p -> System.out.println(p.getNome()));
        
        System.out.println("Lista de pessoas filtradas pela idade: ");

        System.out.println("Abaixo de trinta anos");

        pessoas.forEach((p) -> {
            if (p.getIdade() < 30) {
                System.out.println(p.getNome());
            }
        });

        System.out.println("Entre 30 e quarenta");
        pessoas.forEach((p) -> {
            if (p.getIdade() < 40 && p.getIdade() >= 30) {
                System.out.println(p.getNome());
            }
        });

        System.out.println("Entre 40 e 60");
        pessoas.forEach((p) -> {
            if (p.getIdade() < 60 && p.getIdade() >= 40) {
                System.out.println(p.getNome());
            }
        });

        System.out.println("Maiores que 60");
        pessoas.forEach((p) -> {
            if (p.getIdade() > 60) {
                System.out.println(p.getNome());
            }
        });
    

    }
}

@FunctionalInterface
interface Desconto {
    double descontar(Pessoa p);
}

class Pessoa {
    private String nome;
    private int idade;
    private double salario;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
    


}