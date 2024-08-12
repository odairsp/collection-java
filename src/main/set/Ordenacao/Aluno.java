package main.set.Ordenacao;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private long matricula;
    private double nota;

    public Aluno(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }
    @Override
    public int compareTo(Aluno o) {
        return Long.compare(this.getMatricula(), o.getMatricula());
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }


}
