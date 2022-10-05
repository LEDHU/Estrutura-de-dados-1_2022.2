package TiposAbstratosDeDados1.Queues;

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

        else{
            LSENode<T> aux;
            aux = this.head;
            aux.setProx(novo);
        }
        this.head = novo;
        this.qtd++;
    }

    public void dequeue(){
        LSENode <T> aux = this.tail;
        if(this.qtd == 1){
            this.tail = null;
            this.head = null;
            this.qtd--;
            return;
        }
        aux = aux.getProx();
        this.tail = aux;
        this.qtd--;
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
