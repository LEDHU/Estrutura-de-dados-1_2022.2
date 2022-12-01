package br.unicap.luis_00000845392.ed1.ArvoreBinaria.Tipos.SRepetidos;

import br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Queues.Queue;

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

    public void preOrdem(){
        if(this.isEmpyt())
            System.out.println("Arvore vazia");
        else
            percorrerPreOrdem(this.root);
    }

    private void percorrerPreOrdem(Node<T> r){
        if(r != null){
            System.out.println(r.getInfo());
            percorrerPreOrdem(r.getLeft());
            percorrerPreOrdem(r.getLeft());
        }
    }

    public void posOrdem(){
        if(this.isEmpyt())
            System.out.println("Arvore vazia");
        else
            percorrerPosOrdem(this.root);
    }

    private void percorrerPosOrdem(Node<T> r){
        if(r != null){
            percorrerPosOrdem(r.getLeft());
            percorrerPosOrdem(r.getLeft());
            System.out.println(r.getInfo());
        }
    }

    public void porNivel(){
        if(this.isEmpyt())
            System.out.println("Arvore vazia");
        else
            passeioPorNivel();
    }

    private void passeioPorNivel() {
        Queue<Node<T>> queue = new Queue<>();
        Node<T> aux;
        queue.enqueue(this.root);
        while (!queue.isEmpty()) {
            aux = queue.dequeue();
            if (aux.getLeft() != null)
                queue.enqueue(aux.getLeft());
            if (aux.getRight() != null)
                queue.enqueue(aux.getRight());
            System.out.println(aux.getInfo());
        }
    }

    public void insertSemRecursividade(T valor){
        Node<T> novo = new Node<>(valor);
        Node<T> aux;
        if (this.isEmpyt()) {
            this.root = novo;
            System.out.println("Inserção efetuada");
        } else {
            aux = this.root;
            while (true) {
                if (valor.compareTo(aux.getInfo()) == 0) {
                    System.out.println("Valor repetido. Inserção não efetuada");
                    break;
                } else if (valor.compareTo(aux.getInfo()) < 0) {
                    if (aux.getLeft() != null)
                        aux = aux.getLeft();
                    else {
                        aux.setLeft(novo);
                        System.out.println("Inserção efetuada");
                        break;
                    }
                } else {
                    if (aux.getRight() != null)
                        aux = aux.getRight();
                    else {
                        aux.setRight(novo);
                        System.out.println("Inserção efetuada");
                        break;
                    }
                }
            }
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

    public int qtdDeNos(){
        int i = 0;
        if(!this.isEmpyt()){
            Queue<Node<T>> queue = new Queue<>();
            Node<T> aux;
            queue.enqueue(this.root);
            while(!queue.isEmpty()){
                aux = queue.dequeue();
                if(aux.getLeft() != null)
                    queue.enqueue(aux.getLeft());
                if(aux.getRight() != null)
                    queue.enqueue(aux.getRight());
                i++;
            }
        }
        return i;
    }

    public int qtdDeFolhas(){
        int i = 0;
        if(!this.isEmpyt()){
            Queue<Node<T>> queue = new Queue<>();
            Node<T> aux;
            queue.enqueue(this.root);
            while(!queue.isEmpty()){
                aux = queue.dequeue();
                if(aux.getLeft() != null)
                    queue.enqueue(aux.getLeft());
                if(aux.getRight() != null)
                    queue.enqueue(aux.getRight());
                if(aux.getLeft() == null && aux.getRight() == null)
                    i++;
            }
        }
        return i;
    }

    public int qtdDeNaoFolhas(){
        int i = 0;
        if(!this.isEmpyt()){
            Queue<Node<T>> queue = new Queue<>();
            Node<T> aux;
            queue.enqueue(this.root);
            while(!queue.isEmpty()){
                aux = queue.dequeue();
                if(aux.getLeft() != null)
                    queue.enqueue(aux.getLeft());

                if(aux.getRight() != null)
                    queue.enqueue(aux.getRight());

                if(aux.getLeft() != null || aux.getRight() != null)
                    i++;
            }
        }
        return i;
    }



}
