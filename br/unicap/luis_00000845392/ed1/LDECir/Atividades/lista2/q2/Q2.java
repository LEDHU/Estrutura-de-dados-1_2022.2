package br.unicap.luis_00000845392.ed1.LDECir.Atividades.lista2.q2;

import br.unicap.luis_00000845392.ed1.LDE.Listas.ListaNormal.LDENode;

public class Q2 <T extends Comparable<T>> {
    private LDENode<T> head;
    private LDENode<T> tail;
    private int qtd;

    public boolean isEmpty(){
        return this.qtd == 0;
    }

    public void insertFirst(T valor){
        LDENode<T> novo = new LDENode<>(valor);
        LDENode<T> aux = this.head;

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

    public Q2<T> dividir(){
        Q2<T> lista2 = new Q2<>();
        LDENode<T> aux = this.tail;
        int m = this.qtd;
        for(int i = this.qtd/2; i < m; i++){
            lista2.insertFirst(aux.getInfo());
            aux = aux.getPrevious();
        }
        for(int i = this.qtd/2; i < m; i++){
            this.deleteLast();
        }
        return lista2;
    }
    public void exibir(){
        LDENode<T> aux = this.head;
        if(!this.isEmpty()){
            for(int i = 0; i < this.qtd; i++){
                System.out.println(aux.getInfo());
                aux = aux.getNext();
            }
        }
        else{
            System.out.println("Lista vazia");
        }
    }
    public void deleteLast(){
        if(!isEmpty()) {
            if (this.qtd == 1) {
                this.head = null;
                this.tail = null;
            } else {
                this.tail = this.tail.getPrevious();
                this.tail.setNext(this.head);
                this.head.setPrevious(this.tail);
            }
            this.qtd--;
        }
    }


}
