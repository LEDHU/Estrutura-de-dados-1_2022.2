package br.unicap.luis_00000845392.ed1.ArvoreBinaria.Atividades.atv2;

public class Node <T extends Comparable<T>> {
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
}