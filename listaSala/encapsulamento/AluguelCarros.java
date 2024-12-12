package encapsulamento;

import java.util.ArrayList;
import java.util.Scanner;

public class AluguelCarros {
    private static ArrayList<Carro> carros = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Reserva> reservas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarDados();

        while (true) {
            System.out.println("\nBem vindo ao sistema de aluguel de carros Ande Bem!");
            System.out.println("1. Listar carros disponíveis");
            System.out.println("2. Alugar carro");
            System.out.println("3. Devolver carro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    listarCarrosDisponiveis();
                    break;
                case 2:
                    alugarCarro();
                    break;
                case 3:
                    devolverCarro();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            sc.close();
        }
    }

    private static void inicializarDados() {
        clientes.add(new Cliente("Murilo", "12345678900"));
        clientes.add(new Cliente("Ana", "98765432100"));

        carros.add(new Carro("Onix Lt", "Chevrolet", 2018, 130.99, 50000.33, "MY3SL6Q"));
        carros.add(new Carro("Etios", "Toyota", 2020, 114.99, 23051.59, "IKAS3NT"));
        carros.add(new Carro("Virtus", "Volkswagen", 2017, 59.99, 93460.03, "UTH48L2"));
    }

    private static void listarCarrosDisponiveis() {
        System.out.println("\nCarros disponíveis:");
        for (Carro carro : carros) {
            if (carro.isDisponivel()) {
                carro.getInfos();
            }
        }
    }

    private static void alugarCarro() {
        System.out.print("Digite o CPF do cliente: ");
        String cpf = sc.nextLine();
        Cliente cliente = buscarCliente(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        System.out.print("Digite a placa do carro: ");
        String placa = sc.nextLine();
        Carro carro = buscarCarro(placa);
        if (carro == null || !carro.isDisponivel()) {
            System.out.println("Carro não disponível para aluguel.");
            return;
        }

        carro.alugar();
        String dataReserva = "Hoje";
        reservas.add(new Reserva(carro, cliente, dataReserva));
        System.out.println("Carro alugado com sucesso!");
    }

    private static void devolverCarro() {
        System.out.print("Digite o CPF do cliente: ");
        String cpf = sc.nextLine();
        Cliente cliente = buscarCliente(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        System.out.print("Digite a placa do carro: ");
        String placa = sc.nextLine();
        Carro carro = buscarCarro(placa);
        if (carro == null || carro.isDisponivel()) {
            System.out.println("Carro não está alugado ou não encontrado.");
            return;
        }

        carro.devolver();
        reservas.removeIf(reserva -> reserva.getCarro().getPlaca().equals(placa) && reserva.getCliente().getCpf().equals(cpf));
        System.out.println("Carro devolvido com sucesso!");
    }

    private static Cliente buscarCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    private static Carro buscarCarro(String placa) {
        for (Carro carro : carros) {
            if (carro.getPlaca().equals(placa)) {
                return carro;
            }
        }
        return null;
    }
}

class Carro {
    private String nome;
    private String marca;
    private int ano;
    private double preco;
    private double quilometragem;
    private boolean disponivel = true;
    private String placa;

    public Carro(String nome, String marca, int ano, double preco, double quilometragem, String placa) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
        this.quilometragem = quilometragem;
        this.placa = placa;
    }

    public void getInfos() {
        System.out.printf("Carro - %s\nMarca - %s\nAno - %d\nQuilometragem - %.2f km\nPlaca - %s\nPreço Diária - R$ %.2f\nStatus: %s\n\n", 
                          this.nome, this.marca, this.ano, this.quilometragem, this.placa, this.preco, disponivel ? "Disponível" : "Indisponível");
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void alugar() {
        if (disponivel) {
            disponivel = false;
        } else {
            System.out.println("Carro indisponível para aluguel.");
        }
    }

    public void devolver() {
        disponivel = true;
    }

    public String getPlaca() {
        return placa;
    }
}

class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}

class Reserva {
    private Carro carro;
    private Cliente cliente;
    private String dataReserva;

    public Reserva(Carro carro, Cliente cliente, String dataReserva) {
        this.carro = carro;
        this.cliente = cliente;
        this.dataReserva = dataReserva;
    }

    public Carro getCarro() {
        return carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // Getters e Setters, e outros métodos relevantes
}
