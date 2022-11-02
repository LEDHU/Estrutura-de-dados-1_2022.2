package br.unicap.luis_00000845392.ed1.LDECir.Listas.ListaNormal;

public class LDECNode<T> {
    private LDECNode<T> next;
    private LDECNode<T> previous;
    private T info;

    public LDECNode(T valor) {
        this.info = valor;
    }

    public LDECNode<T> getNext() {
        return next;
    }

    public void setNext(LDECNode<T> next) {
        this.next = next;
    }

    public LDECNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(LDECNode<T> previous) {
        this.previous = previous;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}
