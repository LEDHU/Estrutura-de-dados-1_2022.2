package br.unicap.luis_00000845392.ed1.Atividades.Seguna_Lista_LSE;

public class LSENode {
    private Aluno info;
    private LSENode prox;
    // Método construtor
    public LSENode(Aluno valor) {
        this.info = valor;
    }
    // Métodos SET
    public void setInfo(Aluno valor) {
        this.info = valor;
    }
    public void setProx(LSENode novoProx) {
        this.prox = novoProx;
    }
    // Métodos GET
    public Aluno getInfo() {
        return this.info;
    }
    public LSENode getProx() {
        return this.prox;
    }
}
