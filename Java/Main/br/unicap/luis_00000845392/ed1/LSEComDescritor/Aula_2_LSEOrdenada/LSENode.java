package Java.Main.br.unicap.luis_00000845392.ed1.LSEComDescritor.Aula_2_LSEOrdenada;

public class LSENode <T extends Comparable <T>>{
    private T info;
    private LSENode<T> prox;

    public LSENode (T valor){
        this.info = valor;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public LSENode<T> getProx() {
        return prox;
    }

    public void setProx(LSENode<T> prox) {
        this.prox = prox;
    }


}
