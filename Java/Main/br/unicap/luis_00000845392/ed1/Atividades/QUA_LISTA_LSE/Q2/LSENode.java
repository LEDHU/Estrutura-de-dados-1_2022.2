package QUA_LISTA_LSE.Q2;

public class LSENode {
    private Numero info;
    private LSENode prox;

    public LSENode(Numero valor) {
        this.info = valor;
    }

    public Numero getInfo() {
        return info;
    }

    public void setInfo(Numero info) {
        this.info = info;
    }

    public LSENode getProx() {
        return prox;
    }

    public void setProx(LSENode prox) {
        this.prox = prox;
    }
}
