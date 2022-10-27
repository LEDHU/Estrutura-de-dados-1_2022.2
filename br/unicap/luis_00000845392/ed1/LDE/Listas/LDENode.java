package br.unicap.luis_00000845392.ed1.LDE.Listas;

public class LDENode <T>{
    private LDENode<T> next;
    private LDENode<T> previous;
    private T info;

    public LDENode(T valor) {
        this.info = valor;
    }

    public LDENode<T> getNext() {
        return next;
    }

    public void setNext(LDENode<T> next) {
        this.next = next;
    }

    public LDENode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(LDENode<T> previous) {
        this.previous = previous;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

}
