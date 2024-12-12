package agregacao_composicao;

public class Oficina {
    public static void main(String[] args) {
        Carro golG4 = new Carro("Gol G4", "Pioner 885", "Pneu Dianteiro Direito", "Pneu Dianteiro Esquerdo", "Pneu Traseiro Direito", "Pneu Traseiro Esquerdo", "Pneu de Estepe", "Motor EA111");
        Motorista murilo = new Motorista("Murilo", golG4);
    
        murilo.infoMotorista();
    }
}

abstract class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}

class Motorista extends Pessoa {
    private Carro carro;

    public Motorista(String nome, Carro carro) {
        super(nome);
        this.carro = carro;
    }

    public void infoMotorista() {
        System.out.println("O motorista " + this.getNome() + " tem um carro.");
        carro.mostrarCarro();
    }
}

class Motor {
    private String nomeMotor;

    public Motor(String nomeMotor) {
        this.nomeMotor = nomeMotor;
    }

    public String getNomeMotor() {
        return this.nomeMotor;
    }
}

class Pneu {
    private String tipoPneu;

    public Pneu(String tipoPneu) {
        this.tipoPneu = tipoPneu;
    }

    public String getTipoPneu() {
        return this.tipoPneu;
    }
}

class Radio {
    private String nomeRadio;

    public Radio(String nomeRadio) {
        this.nomeRadio = nomeRadio;
    }

    public String getNomeRadio() {
        return this.nomeRadio;
    }
}

class Carro {
    private String nomeCarro;
    private Pneu pneuDR;
    private Pneu pneuDL;
    private Pneu pneuTR;
    private Pneu pneuTL;
    private Pneu pneuS;
    private Motor motor;
    private String nomeRadio;

    public Carro(String nomeCarro, String nomeRadio, String pneu1, String pneu2, String pneu3, String pneu4, String pneu5, String motor) {
        this.nomeCarro = nomeCarro;
        this.pneuDR = new Pneu(pneu1);
        this.pneuDL = new Pneu(pneu2);
        this. pneuTR = new Pneu(pneu3);
        this.pneuTL = new Pneu(pneu4);
        this. pneuS = new Pneu(pneu5);
        this.motor = new Motor(motor);
        this.nomeRadio = nomeRadio;
    }

    public void mostrarCarro() {
        System.out.println("O carro " + this.nomeCarro + " contém");
        System.out.println();
        System.out.println(pneuDL.getTipoPneu());
        System.out.println(pneuDR.getTipoPneu());
        System.out.println(pneuTL.getTipoPneu());
        System.out.println(pneuTR.getTipoPneu());
        System.out.println(pneuS.getTipoPneu());
        System.out.println(this.motor);
        System.out.println(this.nomeRadio);

    }
}