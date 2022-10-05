package TiposAbstratosDeDados1.Stacks;

public class Stack <T>{
    private LSENode<T> topo;

    public boolean isEmpty(){
        return this.topo == null;
    }

    public void push(T valor){
        LSENode<T> novo = new LSENode<T>(valor);
        novo.setProx(this.topo);
        this.topo = novo;
    }

    public T pop(){
        LSENode <T> aux = this.topo = this.topo.getProx();
        return aux.getInfo();
    }

    public T top(){
        return this.topo.getInfo();
    }

    public boolean isFull (){
        return false;
    }

}
