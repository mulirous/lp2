package listaSala.heranca_polimorfismo;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<Contato> contatos = new ArrayList<>();
        Agenda a = new Agenda();
        a.loop(contatos);
    }
}

class Agenda {
    private Scanner sc = new Scanner(System.in);

    public void loop(List<Contato> contatos) {
        int op = 1000;
        while (op != 0) {
            System.out.println("Escolha uma opção abaixo");
            System.out.printf(" 1 - Listar contatos\n 2 - Adicionar Contato\n 3 - Remover Contato\n 4 - Procurar Contato\n 0 - Sair\n");
            System.out.print("Opção: ");
            op = sc.nextInt();
            sc.nextLine();
            System.out.println();
            switch (op) {
                case 1:
                    ordena(contatos);
                    listarContatos(contatos);
                    break;
                case 2:
                    adicionarContato(contatos);
                    break;
                case 3:
                    removerContato(contatos);
                    break;
                case 4:
                    procurarContato(contatos);
                default:
                    break;
            }
        }

    }

    public void listarContatos(List<Contato> contatos) {
        if (contatos.isEmpty()) {
            System.out.println("A sua agenda está vazia.");
            System.out.println();
        } else {
            for (Contato contato : contatos) {
                if (contato instanceof Pf) {
                    System.out.println("Tipo: Pessoa Física (PF)");
                } else if (contato instanceof Pj) {
                    System.out.println("Tipo: Pessoa Jurídica (PJ)");
                }
                contato.showInfo();
                System.out.println("----------------------");
                System.out.println();
            }
        }
    }

    public void adicionarContato(List<Contato> contatos) {
        System.out.print("Esolha 1 para uma Pessoa Física ou 2 para Pessoa Jurídica: ");
        int tp = sc.nextInt();
        sc.nextLine();
        if (tp == 1) {
            adicionarPf(contatos);
        } else {
            adicionarPj(contatos);
        }
    }

    public void adicionarPf(List<Contato> contatos) {
        String nome;
        String endereco;
        String dataNascimento;
        String email;
        String estadoCivil;
        String cpf;
        System.out.println("Vamos adicionar uma Pessoa Física a sua agenda");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("CPF: ");
        cpf = sc.nextLine();
        System.out.print("Endereço: ");
        endereco = sc.nextLine();
        System.out.print("email: ");
        email = sc.nextLine();
        System.out.print("Data de Nascimento no formato dia/mes/ano: ");
        dataNascimento = sc.nextLine();
        System.out.print("Estado Civil: ");
        estadoCivil = sc.nextLine();

        System.out.println();

        contatos.add(new Pf(nome, endereco, dataNascimento, email, cpf, estadoCivil));
    }

    public void adicionarPj(List<Contato> contatos) {
        String nome;
        String endereco;
        String dataNascimento;
        String email;
        String razaoSocial;
        String cnpj;
        System.out.println("Vamos adicionar uma Pessoa Jurídico a sua agenda");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("CNPJ: ");
        cnpj = sc.nextLine();
        System.out.print("A Razão Social: ");
        razaoSocial = sc.nextLine();
        System.out.print("Endereço: ");
        endereco = sc.nextLine();
        System.out.print("email: ");
        email = sc.nextLine();
        System.out.print("Data de Nascimento no formato dia/mes/ano: ");
        dataNascimento = sc.nextLine();

        System.out.println();

        contatos.add(new Pj(nome, endereco, dataNascimento, email, cnpj, razaoSocial));
    }

    public void removerContato(List<Contato> contatos) {
        System.out.print("Digite o nome do contato para remove-lo:");
        String nomeRemove = sc.nextLine();

        for (Contato c : contatos) {
            if (nomeRemove.equalsIgnoreCase(c.nome)) {
                contatos.remove(c);
                System.out.println("Contato removido!");
                System.out.println();
                return;
            }
        }

        System.out.println("O contato não foi encontrado.");

    }

    public void procurarContato(List<Contato> contatos) {
        System.out.print("Digite o nome ou cpf/cnpj do contato para encontralo: ");
        String busca = sc.nextLine();
        System.out.println();
        boolean encontrou = false;

        for (Contato c : contatos) {
            if (busca.equalsIgnoreCase(c.nome)) {
                c.showInfo();
                System.out.println();
                encontrou = true;
            }
            else if (c instanceof Pf) {
                Pf pf = (Pf) c;
                if (busca.equalsIgnoreCase(pf.getCpf())) {
                    pf.showInfo();
                    System.out.println();
                    encontrou = true;
                }
            }
            else if (c instanceof Pj) {
                Pj pj = (Pj) c;
                if (busca.equalsIgnoreCase(pj.getCnpj())) {
                    pj.showInfo();
                    System.out.println();
                    encontrou = true;
                }
            }
        }

        if (!encontrou) {
            System.out.println("O contato não foi encontrado.");
        }
    } 

    public void ordena(List<Contato> contatos) {
        contatos.sort(new Comparator<Contato>() {
            @Override
            public int compare(Contato c1, Contato c2) {
                if (c1 instanceof Pf && c2 instanceof Pj) {
                    return -1;
                }
                if (c1 instanceof Pj && c2 instanceof Pf) {
                    return 1;
                }
                if (c1 instanceof Pf && c2 instanceof Pf) {
                    Pf pf1 = (Pf) c1;
                    Pf pf2 = (Pf) c2;
                    return pf1.getCpf().compareTo(pf2.getCpf());
                }
                if (c1 instanceof Pj && c2 instanceof Pj) {
                    Pj pj1 = (Pj) c1;
                    Pj pj2 = (Pj) c2;
                    return pj1.getCnpj().compareTo(pj2.getCnpj());
                }
                return 0;
            }
        });
    }
}

abstract class Contato {
    protected String nome;
    protected String endereco;
    protected String dataNascimento;
    protected String email;

    public Contato(String nome, String endereco, String dataNascimento, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public abstract void showInfo();
}

class Pf extends Contato {
    private String estadoCivil;
    private String cpf;

    public Pf(String nome, String endereco, String dataNascimento, String email, String cpf, String estadoCivil) {
        super(nome, endereco, dataNascimento, email);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }

    public String getCpf() {
        return this.cpf;
    }

    @Override
    public void showInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Email: " + this.email);
        System.out.println("Estado Civil: " + this.estadoCivil);
    }
}

class Pj extends Contato {
    private String razaoSocial;
    private String cnpj;

    public Pj(String nome, String endereco, String dataNascimento, String email, String cnpj, String razaoSocial) {
        super(nome, endereco, dataNascimento, email);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    @Override
    public void showInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Razão Social: " + this.razaoSocial);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Email: " + this.email);
    }
}