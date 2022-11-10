package br.unicap.luis_00000845392.ed1.LDECir.Atividades.lista2.q1;

import br.unicap.luis_00000845392.ed1.LDE.Listas.ListaNormal.LDENode;

public class Q1<T extends Comparable<T>> {
    private LDENode<T> head;
    private LDENode<T> tail;
    private int qtd;

    public boolean isEmpty(){
        return this.qtd == 0;
    }

    public void insertLast(T valor){
        LDENode<T> novo = new LDENode<>(valor);
        LDENode<T> aux = this.tail;

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

    public void concatenar(Q1<T> lista2){
        LDENode<T> aux = lista2.head;
        for(int i = 0; i < lista2.qtd; i++){
            this.insertLast(aux.getInfo());
            aux = aux.getNext();
        }
        aux = lista2.head;
        int n = lista2.qtd;
        for(int i = 0; i < n; i++){
            lista2.deleteLast();
            aux = aux.getNext();
        }
    }
    public void deleteLast() {
        if (!isEmpty()) {
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
