package br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Testes.Lista3;

import br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Queues.LSENode;

public class Q3<T> {
    private LSENode<T> tail;
    private LSENode<T> head;
    private int qtd;

    public boolean isEmpty(){
        return this.tail == null && this.head == null && this.qtd == 0;
    }

    //insere no inicio
    public void push(T valor){
        LSENode<T> novo = new LSENode<>(valor);
        if(!this.isEmpty())
            novo.setProx(this.tail);
        this.tail = novo;
    }

    //remove inicio
    public T pop() {
        LSENode<T> novo = this.head;
        this.head = this.head.getProx();
        return novo.getInfo();
    }

    //insere no final
    public void inject(T valor){
        LSENode<T> novo = new LSENode<>(valor);

        if (isEmpty())
            this.tail = novo;
        else
            this.head.setProx(novo);

        this.head = novo;
        this.qtd++;
    }

    //remove no final
    public T eject(){
        LSENode <T> aux = this.tail;
        if(this.qtd == 1){
            this.tail = null;
            this.head = null;
        }
        else
            this.tail = aux.getProx();

        this.qtd--;
        return aux.getInfo();
    }

    public boolean isFull(){
        return false;
    }
}
