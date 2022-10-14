package br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Queues;

public class Queue<T> {
    private LSENode<T> tail;
    private LSENode<T> head;
    private int qtd;

    public boolean isEmpty(){
        return this.tail == null && this.head == null && this.qtd == 0;
    }

    public void enqueue(T valor){
        LSENode<T> novo = new LSENode<>(valor);

        if(isEmpty())
            this.tail = novo;

        else
            this.head.setProx(novo);

        this.head = novo;
        this.qtd++;
    }

    public T dequeue(){
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

    public void exibirFila(){
        LSENode <T> aux = this.tail;
        while (aux != null){
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
        if(this.tail == null && this.head == null && this.qtd == 0)
            System.out.println("Fila vazia");
    }

    public T head(){
        return this.head.getInfo();
    }

    public boolean isFull(){
        return false;
    }


}
