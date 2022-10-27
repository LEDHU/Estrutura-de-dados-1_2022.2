package br.unicap.luis_00000845392.ed1.LSE.Atividades.QUA_LISTA_LSE.Q1;

public class LSENode {
    //ATRIBUTOS
    private Produto info;
    private LSENode prox;

    //CONSTRUDOR
    public LSENode (Produto valor){
        this.info = valor;
    }

    //GETTERS
    public Produto getInfo() {
        return info;
    }

    public LSENode getProx() {
        return prox;
    }

    //SETTERS
    public void setInfo(Produto info) {
        this.info = info;
    }

    public void setProx(LSENode prox) {
        this.prox = prox;
    }
}
