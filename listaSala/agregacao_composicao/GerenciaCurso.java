package agregacao_composicao;

import java.util.ArrayList;
import java.util.List;

public class GerenciaCurso {
    public static void main(String[] args) {
        Aluno murilo = new Aluno("Murilo");
        Aluno rodrigo = new Aluno("Rodrigo");

        Curso c1 = new Curso(murilo.getNome());
        c1.adicionarAulaNaCurso("Desenvolvimento Web 1");
        c1.adicionarAulaNaCurso("Linguagem de Programação 2");
        c1.adicionarAulaNaCurso("Estrutura de Banco de Dados 1");
        c1.adicionarAulaNaCurso("Cálculo 3");

        murilo.iniciarCurso(c1);
        
        Curso c2 = new Curso(rodrigo.getNome());

        c2.adicionarAulaNaCurso("Blockchain");
        c2.adicionarAulaNaCurso("Linguagem de Programação 2");
        c2.adicionarAulaNaCurso("Banco de Dados NoSql");
        c2.adicionarAulaNaCurso("Cálculo 3");

        rodrigo.iniciarCurso(c2);

        murilo.mostrarCurso();

        rodrigo.mostrarCurso();


        murilo.acabarCurso();

        rodrigo.acabarCurso();

        murilo.mostrarCurso();

        rodrigo.mostrarCurso();
    }
}


class Aula {
    private String materia;

    public Aula(String materia) {
        this.materia = materia;
    }

    public void showInfoAula() {
        System.out.println("Aula da matéria de " + this.materia);
    }
}

class Curso {
    private String alunoDono;
    private List<Aula> aulas;

    public Curso(String alunoDono) {
        this.alunoDono = alunoDono;
        this.aulas = new ArrayList<>();
    }

    public void adicionarAulaNaCurso(String materia) {
        Aula aula = new Aula(materia);
        this.aulas.add(aula);
    }

    public void mostrarCurso() {
        if (!aulas.isEmpty()) {
            System.out.println("Curso do aluno " + this.alunoDono);
            System.out.println("Suas matérias são:");
            System.out.println();
            for (Aula a : aulas) {
                a.showInfoAula();
            }
            System.out.println();
        }
        else {
            System.out.println("O aluno " + this.alunoDono + " finalizou o cuso.");
            System.out.println();
        }
    }

    public void acabarCurso() {
        this.aulas.clear();
    }
}

class Aluno {
    private String nome;
    private Curso curso;

    public Aluno (String nome) {
        this.nome = nome;
    }

    public void iniciarCurso(Curso curso) {
        this.curso = curso;
    }

    public void acabarCurso() {
        this.curso.acabarCurso();
    }

    public String getNome() {
        return this.nome;
    }

    public void mostrarCurso() {
        curso.mostrarCurso();
    }
}