package br.unicap.luis_00000845392.ed1.ArvoreBinaria.Tipos.SRepetidos;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    public boolean isEmpyt(){
        return this.root == null;
    }

    public void insert(T valor){
        if(this.isEmpyt())
            this.root = new Node<>(valor);
        else
            this.root.insertNode(valor);
    }

    public void emOrdem(){
        if(this.isEmpyt())
            System.out.println("Arvore vazia");
        else
            percorrerEmOrdem(this.root);
    }

    private void percorrerEmOrdem(Node<T> r){
        if(r != null){
            percorrerEmOrdem(r.getLeft());
            System.out.println(r.getInfo());
            percorrerEmOrdem(r.getLeft());
        }
    }

    public void posOrdem(){
        if (this.isEmpyt())
            System.out.println("Arvore vazia");
        else
            pecorrePosOrdem(this.root);
    }

    private void pecorrePosOrdem(Node<T> r){
        if(r != null){

        }
    }
    public T find(T valor){
        if(this.isEmpyt())
            return null;
        else
            return this.root.findNode(valor);
    }

    public T buscarSemRecursividade(T valor) {
        if (!this.isEmpyt()) {
            Node<T> aux = this.root;
            while (aux != null) {
                if (valor.compareTo(aux.getInfo()) == 0)
                    return aux.getInfo();
                else if (valor.compareTo(aux.getInfo()) < 0)
                    aux = aux.getLeft();
                else
                    aux = aux.getRight();
            }
        }
        return null;
    }
}
