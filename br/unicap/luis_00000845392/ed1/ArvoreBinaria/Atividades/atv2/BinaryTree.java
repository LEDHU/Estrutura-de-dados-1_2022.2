package br.unicap.luis_00000845392.ed1.ArvoreBinaria.Atividades.atv2;

import br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Queues.Queue;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    public boolean isEmpyt(){
        return this.root == null;
    }

    //Letra A
    private Node<T> enderecoMenorNo(){
        Node<T> aux = this.root;
        while(true){
            if(aux.getLeft() != null)
                aux = aux.getLeft();

            else if(aux.getLeft() == null)
                break;
        }
        System.out.println(aux.getInfo());
        return aux;
    }

    //Letra B
    public Node<T> enderecoMenor(){
        if(!this.isEmpyt())
            return enderecoMenorNo();
        else
            return null;
    }

    //Letra C
    private Node<T> enderecoMaiorNo(){
        Node<T> aux = this.root;
        while(true){
            if(aux.getRight() != null)
                aux = aux.getRight();

            else if(aux.getRight() == null)
                break;
        }
        System.out.println(aux.getInfo());
        return aux;
    }

    //Letra D
    public Node<T> enderecoMaior(){
        if(!this.isEmpyt())
            return enderecoMaiorNo();
        else
            return null;
    }

    //Letra E
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

    //Letra F
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

    //Letra G
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

    //Letra H
    public void insertSemRecursividade(T valor) {
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
}
