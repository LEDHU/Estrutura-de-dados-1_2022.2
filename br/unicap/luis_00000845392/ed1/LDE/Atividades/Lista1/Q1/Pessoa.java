package br.unicap.luis_00000845392.ed1.LDE.Atividades.Lista1.Q1;

public class Pessoa implements Comparable<Pessoa> {
    private String RG;
    private String nome;

    public Pessoa(String nome, String RG) {
        this.RG = RG;
        this.nome = nome;
    }

    public Pessoa(String RG) {
        this.RG = RG;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ". RG: " + this.RG;
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.getRG().compareTo(o.getRG());
    }
}
