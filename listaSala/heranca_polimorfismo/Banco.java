package listaSala.heranca_polimorfismo;
import java.util.List;
import java.util.ArrayList;

public class Banco {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        System.out.println("Você tem 1000 reais na sua Conta Corrente e na su Poupança!\n");

        System.out.println("Aplicado os juros");
        contas.add(new ContaCorrente(1000));
        contas.add(new ContaPoupanca(1000));

        for (Conta conta : contas) {
            conta.calcularJuros();
        }
    }
}

abstract class Conta {
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public abstract void calcularJuros();
}

class ContaCorrente extends Conta {
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void calcularJuros() {   
        this.saldo += saldo * 0.01;
        System.out.println("Novo Saldo da Conta Corrente: " + this.saldo);
    }
}

class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldo) {
        super(saldo);
    }


    @Override
    public void calcularJuros() {
        this.saldo += saldo * 0.05;
        System.out.println("Novo Saldo da Conta Poupança: " + this.saldo);
    }
}