package br.unicap.luis_00000845392.ed1.Tests.Tentativa_LDE;

public class LDETentativa <T>{
    private LDENode<T> head;
    private LDENode<T> tail;
    private int qtd;

    public boolean isEmpty() {
        return this.head == null && this.tail == null && this.qtd == 0;
    }

    public void addFirst(T valor){
        LDENode<T> novo = new LDENode<>(valor);
        LDENode<T> aux = this.head;

        if(isEmpty()){
            this.tail = novo;
        }
        else{
            novo.setNext(aux);
            aux.setPrevious(novo);
        }
        this.head = novo;
        this.qtd++;
    }

    public void addLast(T valor){
        LDENode<T> novo = new LDENode<>(valor);
        LDENode<T> aux = this.tail;

        if(isEmpty()){
            this.head = novo;
        }
        else{
            aux.setNext(novo);
            novo.setPrevious(aux);
        }
        this.tail = novo;
        this.qtd++;

    }

    public void remove(){

    }


    public void exibireral(){
        LDENode<T> aux;

        if(isEmpty())
            System.out.println("Lista vazia");
        else{
            aux = this.head;
            for(int i = 0; i < qtd; i++){
                System.out.println(aux.getInfo());
                aux = aux.getNext();
            }
        }
    }

}
