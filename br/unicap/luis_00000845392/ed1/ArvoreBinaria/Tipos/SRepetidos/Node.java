package br.unicap.luis_00000845392.ed1.ArvoreBinaria.Tipos.SRepetidos;

public class Node<T extends Comparable<T>>{
    private T info;
    private Node<T> left;
    private Node<T> right;

    public Node(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    void insertNode(T valor){
        if(valor.compareTo(this.getInfo()) == 0)
            System.out.println("Valor repetido");
        else if(valor.compareTo(this.getInfo()) < 0) {
            if (this.left == null)
                this.left = new Node<>(valor);
            else
                this.left.insertNode(valor);
        }
        else{
            if(this.right == null)
                this.right = new Node<>(valor);
            else
                this.right.insertNode(valor);
        }
    }
    T findNode(T valor){
        if(valor.compareTo(this.getInfo()) == 0)
            return this.getInfo();
        else if(valor.compareTo(this.getInfo()) < 0){
            if(this.left == null)
                return null;
            else
                return this.left.findNode(valor);
        }
        else{
            if(this.right == null)
                return null;
            else
                return this.right.findNode(valor);
        }
    }
}
