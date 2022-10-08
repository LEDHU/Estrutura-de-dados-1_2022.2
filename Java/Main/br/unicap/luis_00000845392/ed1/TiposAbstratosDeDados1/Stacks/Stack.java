package Java.Main.br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Stacks;

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
        this.topo = this.topo.getProx();
        if(isEmpty())
            return null;
        return this.topo.getInfo();
    }

    public T top(){
        return this.topo.getInfo();
    }

    public boolean isFull (){
        return false;
    }

}
