package Lista_Feira_Teste;

public class LSENode {
    private Produtos info;
    private LSENode prox;

    public LSENode (Produtos valor) {
        this.info = valor;
    }

    public Produtos getInfo() {
        return info;
    }

    public void setInfo(Produtos info) {
        this.info = info;
    }

    public LSENode getProx() {
        return prox;
    }

    public void setProx(LSENode prox) {
        this.prox = prox;
    }
}
