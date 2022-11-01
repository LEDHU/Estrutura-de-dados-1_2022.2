package br.unicap.luis_00000845392.ed1.LDECir.Listas;

public class LDECirNode<T> {
    private LDECirNode<T> next;
    private LDECirNode<T> previous;
    private T info;

    public LDECirNode(T valor) {
        this.info = valor;
    }

    public LDECirNode<T> getNext() {
        return next;
    }

    public void setNext(LDECirNode<T> next) {
        this.next = next;
    }

    public LDECirNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(LDECirNode<T> previous) {
        this.previous = previous;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}
