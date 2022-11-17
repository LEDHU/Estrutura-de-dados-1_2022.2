package br.unicap.luis_00000845392.ed1.LDECir.Atividades.atividadeNota;

public class Aluno implements Comparable <Aluno>{
    private String nome;
    private String matricula;
    private int faltas;
    private double media_f;

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public Aluno(String nome, String matricula, int faltas, double media_f) {
        this.nome = nome;
        this.matricula = matricula;
        this.faltas = faltas;
        this.media_f = media_f;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public double getMedia_f() {
        return media_f;
    }

    public void setMedia_f(double media_f) {
        this.media_f = media_f;
    }

    @Override
    public int compareTo(Aluno al) {
        int result;
        result = this.getMatricula().compareTo(al.getMatricula());
        return result;
    }

    @Override
    public String toString() {
        return "Aluno: " + getNome() + "\nMatricula: " + getMatricula() + "\nFaltas: " + getFaltas() + "\nMedia final: " + getMedia_f();
    }
}
