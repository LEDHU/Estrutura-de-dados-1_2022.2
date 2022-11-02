package br.unicap.luis_00000845392.ed1.LDECir.Listas.ListaOrdenadaCRepetidos;

import br.unicap.luis_00000845392.ed1.LDECir.Listas.ListaNormal.LDECNode;

public class LDECOrdenadaCRepetidos<T extends Comparable<T>>{
    private LDECNode<T> head;
    private LDECNode<T> tail;
    private int qtd;

    public boolean isEmpty(){
        return this.qtd == 0;
    }

    public void insert(T valor){
        LDECNode<T> novo = new LDECNode<>(valor);
        if (this.isEmpty()) { // inserir na lista vazia
            this.head = novo;
            this.tail = novo;
            this.qtd++;
        }
        else if (valor.compareTo(this.head.getInfo()) < 0) { // inserir antes do primeiro
            novo.setNext(this.head);
            this.head.setPrevious(novo);
            this.head = novo;
            this.qtd++;
        }
        else if (valor.compareTo(this.tail.getInfo()) > 0) { // inserir depois do último
            this.tail.setNext(novo);
            novo.setPrevious(this.tail);
            this.tail = novo;
            this.qtd++;
        }
        else {
            LDECNode<T> aux, anterior;
            aux = this.head;
            while (true){
                if (valor.compareTo(aux.getInfo()) <= 0) { // achei local de inserção
                    anterior = aux.getPrevious();
                    anterior.setNext(novo);
                    aux.setPrevious(novo);
                    novo.setNext(aux);
                    novo.setPrevious(anterior);
                    this.qtd++;
                    break;
                }
                else {
                    aux = aux.getNext();
                }
            }
        }

    }
    public LDECNode<T> buscar (T valor) {
        LDECNode<T> aux;
        if (!this.isEmpty()){
            aux = this.head;
            while (aux != null) {
                if(aux.getInfo().compareTo(valor) <= 0) {
                    if (aux.getInfo().compareTo(valor) == 0)
                        return aux;
                    else
                        aux = aux.getNext();
                }
                else
                    return null;
            }
        }
        return null;
    }

    public boolean remove(T valor){
        LDECNode<T> aux = buscar(valor);

        if (aux != null) {
            if(this.qtd == 1){
                this.head = null;
                this.tail = null;
            }
            else if(this.head == aux){
                //deleteFirst();
                this.head = this.head.getNext();
                this.head.setPrevious(this.tail);
            }
            else if(this.tail == aux){
                //deleteLast();
                this.tail = this.tail.getPrevious();
                this.tail.setNext(this.head);
            }
            else{
                aux.getPrevious().setNext(aux.getNext());
                aux.getNext().setPrevious(aux.getPrevious());
            }
            this.qtd--;
            return true;

        }
        else {
            if (isEmpty())
                System.out.println("Lista vazia");
            else
                System.out.println("Não pertence a lista");
            return false;
        }

    }
    public void exibir(){
        LDECNode<T> aux = this.head;
        for(int i = 0; i < this.qtd; i++){
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        }
    }

}
