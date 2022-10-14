package br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Testes.Lista2.Q2;

public class Lanche {
    private String nome;
    private int qtd;

    public Lanche(String nome, int qtd){
        this.nome = nome;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "nome = " + nome +
                " qtd = " + qtd +
                "\n";
    }
}
