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
        if (valor <= this.saldo) {
            this.saldo -= valor;
        }
        else System.out.println("Saldo insuficiente");
    }
}

class Cliente {
    public String nome;
    public double carteira;

    public Cliente(double carteira, String nome) {
        this.carteira = carteira;
        this.nome = nome;
    }

    private ContaBanco BB = new ContaBanco(100000);

    public void seApresentar() {
        System.out.println("Olá, eu sou " + nome + ". Estou indo ao Banco nesse momento. Vamos comigo?");
    }

    public void irAoBanco() {
        Scanner sc = new Scanner(System.in);
        int op = 19;

        while (op != 0) {
            System.out.println("\nEscolha uma opção abaixo:\n 1 - Ver saldo\n 2 - Depositar saldo\n 3 - Sacar saldo\n 4 - Verificar Carteira\n");

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
                    if (valor <= carteira) {
                        BB.depositarSaldo(valor);
                        this.carteira -= valor;
                        System.out.println("Este é o seu saldo atual: " + BB.getSaldo());
                    }
                    else {
                        System.out.println("Não tenho dinheiro o suficiente para depositar na conta..\n");
                    }
                } 
                case 3 -> {
                    double valor;
                    System.out.print("Digite o valor a ser sacado: ");
                    valor = sc.nextDouble();
                    if (valor > BB.getSaldo()) {
                        System.out.println("Você não tem dinheiro o suficiente na conta para sacar");
                    }
                    else {
                        BB.sacarValor(valor);
                        this.carteira += valor;
                        System.out.println("Este é o seu saldo atual: " + BB.getSaldo());
                    }
                } 
                case 4 -> {
                    System.out.println("Eu tenho " + this.carteira + " reais na carteira");
                }
                default -> System.out.println("Até logo!\n");
            }
        }

        sc.close();
    }
}