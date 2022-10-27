package br.unicap.luis_00000845392.ed1.LSE.Atividades.Primeira_Lista_LSE;

public class LSENode {
    private Aluno info;
    private LSENode prox;

    public LSENode (Aluno valor) {
        this.info = valor;
    }

    public void setInfo(Aluno info) {
        this.info = info;
    }

    public void setProx(LSENode prox) {
        this.prox = prox;
    }

    public Aluno getInfo() {
        return this.info;
    }

    public LSENode getProx() {
        return prox;
    }
}
