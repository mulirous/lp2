package listaSala.encapsulamento;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Cliente Murilo = new Cliente(50, "Murilo");

        Murilo.seApresentar();

        Murilo.irAoBanco();
    }
}

class ContaBanco {
    private double saldo = 0;

    public ContaBanco(double saldo) {
        this.saldo = saldo;
    } 

    public double getSaldo() {
        return this.saldo;
    }

    public void depositarSaldo(double valor) {
        this.saldo += valor;
    }

    public void sacarValor(double valor) {
        this.saldo -= valor;
    }
}

class Cliente {
    public String nome;
    public double carteira;

    public Cliente(double carteira, String nome) {
        this.carteira = carteira;
        this.nome = nome;
    }

    private ContaBanco BB = new ContaBanco(10);

    public void seApresentar() {
        System.out.println("Olá, eu sou " + nome + ". Estou indo ao Banco nesse momento. Vamos comigo?");
    }

    public void irAoBanco() {
        Scanner sc = new Scanner(System.in);
        int op = 4;

        while (op != 0) {
            System.out.println("Escolha uma opção abaixo:\n 1 - Ver saldo\n 2 - Depositar saldo\n 3 - Sacar saldo\n");

            op = sc.nextInt();

            switch (op) {
                case 1 -> {
                    BB.getSaldo();
                    System.out.println("Este é o seu saldo atual: " + BB.getSaldo());
                }
                case 2 -> {
                    double valor;
                    System.out.print("Digite o valor a ser depositado: ");
                    valor = sc.nextDouble();
                    BB.depositarSaldo(valor);
                    this.carteira -= valor;
                    System.out.println("Este é o seu saldo atual: " + BB.getSaldo());
                } 
                case 3 -> {
                    double valor;
                    System.out.print("Digite o valor a ser sacado: ");
                    valor = sc.nextDouble();
                    BB.sacarValor(valor);
                    this.carteira += valor;
                    System.out.println("Este é o seu saldo atual: " + BB.getSaldo());
                } 
                default -> System.out.println("Até logo!\n");
            }
        }

        sc.close();
    }
}