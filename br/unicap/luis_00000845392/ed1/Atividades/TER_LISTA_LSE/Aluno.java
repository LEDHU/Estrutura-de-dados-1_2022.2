package br.unicap.luis_00000845392.ed1.Atividades.TER_LISTA_LSE;

public class Aluno implements Comparable <Aluno> {
    // Atributos
    private String matr;
    private String nome;
    private double media;
    private int faltas;

    // Método construtor
    public Aluno (String m) {
        this.matr = m;
    }
    public Aluno (String m, String n) {
        this.matr = m;
        this.nome = n;
    }
    public Aluno (String m, String n, double media, int faltas) {
        this.matr = m;
        this.nome = n;
        this.media = media;
        this.faltas = faltas;
    }

    // Métodos GET
    public String getMatr () {
        return this.matr;
    }
    public String getNome () {
        return this.nome;
    }
    public double getMedia () {
        return this.media;
    }
    public int getFaltas () {
        return this.faltas;
    }
    // Métodos SET
    public void setMatr (String matricula) {
        this.matr = matricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMedia (double media) {
        this.media = media;
    }
    public void setFaltas (int faltas) {
        this.faltas = faltas;
    }

    @Override
    public int compareTo (Aluno al) {
        int result;
        result = this.getMatr().compareTo(al.getMatr());
        return result;
    }

    @Override
    public String toString () {
        return this.matr + " " + this.nome + " " + this.media + " " + this.faltas;
    }
}
