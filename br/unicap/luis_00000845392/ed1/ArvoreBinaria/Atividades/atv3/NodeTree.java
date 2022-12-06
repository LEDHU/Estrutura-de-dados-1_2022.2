package br.unicap.luis_00000845392.ed1.ArvoreBinaria.Atividades.atv3;

public class NodeTree<T extends Comparable<T>> {
    private NodeTree<T> left;
    private T info;
    private NodeTree<T> right;

    public NodeTree(T info) {
        this.info = info;
    }

    public NodeTree<T> getLeft() {
        return left;
    }

    public void setLeft(NodeTree<T> left) {
        this.left = left;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NodeTree<T> getRight() {
        return right;
    }

    public void setRight(NodeTree<T> right) {
        this.right = right;
    }

    void insertNode(T valor){
        if(valor.compareTo(this.getInfo()) == 0)
            System.out.println("Não adicionado");

        else if(valor.compareTo(this.getInfo()) < 0) {
            if (this.left == null){
                this.left = new NodeTree<>(valor);
                System.out.println("Adicionado");
            }

            else
                this.left.insertNode(valor);
        }

        else{
            if(this.right == null) {
                this.right = new NodeTree<>(valor);
                System.out.println("Adicionado");
            }

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
