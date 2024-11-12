package heranca_polimorfismo2;

public class Despesas {
    public static void main(String[] args) {
        DespesaDia[] despesas = new DespesaDia[5];
        despesas[0] = new DespesaDia(12, 2, 1299.00f);
        despesas[1] = new DespesaDia(14, 2, 123.00f);
        despesas[2] = new DespesaDia(17, 2, 15329.00f);
        despesas[3] = new DespesaDia(19, 3, 7299.00f);
        despesas[4] = new DespesaDia(22, 2, 131299.00f);

        Pessoa p = new Pessoa("00011122233", despesas);

        System.out.println("Eu sou a Pessoa p de cpf igual á " + p.getCpf());
        System.out.println();
        System.out.println("Estes foram os meus gastos no mes 2");
        System.out.println();
        p.totalizaMes(2);
        System.out.println("E estes foram meus gastos no mes 3");
        System.out.println();
        p.totalizaMes(3);
    }
}

class Pessoa {
    private String cpf;
    private DespesaDia[] despesas;

    public Pessoa (String cpf, DespesaDia[] despesas) {
        this.cpf = cpf;
        this.despesas = despesas;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void totalizaMes(int mes) {
        double total = 0;

        for (DespesaDia d : despesas) {
            if (d.getMes() == mes) {
                total += d.getValor();
                System.out.println(d.getDia() + ", " + d.getMes() + " : " + d.getValor());
            }
        }

        if (total == 0) {
            System.out.println("Não houve nenhuma despesa no mes " + mes);
        }
        else {
            System.out.println("No mes " + mes + " houve a despesa de " + total + "R$");
        }
    }
}


class DespesaMes {
    private int mes;
    private float valor;

    public DespesaMes(int mes, float valor) {
        this.mes = mes;
        this.valor = valor;
    }

    public int getMes() {
        return this.mes;
    }

    public float getValor() {
        return this.valor;
    }
}

class DespesaDia extends DespesaMes {
    private int dia;

    public DespesaDia(int dia, int mes, float valor) {
        super(mes, valor);
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }
}