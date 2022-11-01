package br.unicap.luis_00000845392.ed1.LDECir.Listas;

public class LDECirGenerica<T extends Comparable<T>> {
    private LDECirNode<T> head;
    private LDECirNode<T> tail;
    private int qtd;

    public boolean isEmpty(){
        return this.qtd == 0;
    }

    public void insertFirst(T valor){
        LDECirNode<T> novo = new LDECirNode<>(valor);
        LDECirNode<T> aux = this.head;

        if(isEmpty()) {
            this.tail = novo;
        }
        else{
            novo.setNext(aux);
            aux.setPrevious(novo);
        }
        novo.setNext(this.head);
        novo.setPrevious(this.tail);
        this.head = novo;
        this.qtd++;
    }

    public void insertLast(T valor){
        LDECirNode<T> novo = new LDECirNode<>(valor);
        LDECirNode<T> aux = this.tail;

        if(isEmpty())
            this.head = novo;
        else{
            aux.setNext(novo);
            novo.setPrevious(aux);
        }
        novo.setNext(this.head);
        novo.setPrevious(this.tail);
        this.tail = novo;
        this.qtd++;
    }

    public void exibir(){
        LDECirNode<T> aux = this.head;
        for(int i = 0; i < this.qtd; i++){
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        }
    }

    public boolean remove(T valor){

    }

}
