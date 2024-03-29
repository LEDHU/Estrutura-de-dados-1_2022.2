package br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Testes.Lista3;

import br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Queues.LSENode;

public class Q1<T> {
    private LSENode<T> tail;
    private LSENode<T> head;
    private int qtd = 0;
    private final int tam;

    public Q1(int tam) {
        this.tam = tam;
    }

    public boolean isEmpty(){
        return this.tail == null && this.head == null && this.qtd == 0;
    }

    public boolean enqueue(T valor){
        if(this.qtd < this.tam) {
            LSENode<T> novo = new LSENode<>(valor);

            if (isEmpty())
                this.tail = novo;

            else
                this.head.setProx(novo);

            this.head = novo;
            this.qtd++;
            return true;
        }
        else
            return false;
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
        return this.qtd == this.tam;
    }


}
