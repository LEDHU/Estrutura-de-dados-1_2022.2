package br.unicap.luis_00000845392.ed1.LDECir.Listas.ListaNormal;

import br.unicap.luis_00000845392.ed1.LDE.Listas.ListaNormal.LDENode;

public class LDECirGenerica<T extends Comparable<T>> {
    private LDENode<T> head;
    private LDENode<T> tail;
    private int qtd;

    public boolean isEmpty(){
        return this.qtd == 0;
    }

    public void insert(T valor){
        LDENode<T> novo = new LDENode<>(valor);

        if(isEmpty())
            this.tail = novo;

        else {
            novo.setNext(this.head);
            this.head.setPrevious(novo);
        }
        this.head = novo;
        this.qtd++;
        this.head.setPrevious(this.tail);
        this.tail.setNext(this.head);
    }

    public void insertLast(T valor){
        LDENode<T> novo = new LDENode<>(valor);

        if(isEmpty())
            this.head = novo;

        else {
            this.tail.setNext(novo);
            novo.setPrevious(this.tail);
        }
        this.tail = novo;
        this.qtd++;
        this.head.setPrevious(this.tail);
        this.tail.setNext(this.head);

    }

    private LDENode<T> buscar (T valor) {
        LDENode<T> aux = this.head;
        if (!this.isEmpty()){

            if(this.tail.getInfo().compareTo(valor) == 0)
                return this.tail;

            for (int i = 0; i < this.qtd; i++){
                if(aux.getInfo().compareTo(valor) <= 0) {
                    if (aux.getInfo().compareTo(valor) == 0)
                        return aux;
                    aux = aux.getNext();
                }
                else
                    return null;
            }
        }
        return null;
    }

    public void exibir(){
        LDENode<T> aux = this.head;
        if(this.isEmpty())
            System.out.println("Lista vazia");
        else {
            for (int i = 0; i < this.qtd; i++) {
                System.out.println(aux.getInfo());
                aux = aux.getNext();
            }
        }
    }

    public boolean remove(T valor){
        LDENode<T> aux = buscar(valor);

        if (aux != null) {
            if(this.qtd == 1){
                this.head = null;
                this.tail = null;
            }
            else{
                aux.getPrevious().setNext(aux.getNext());
                aux.getNext().setPrevious(aux.getPrevious());
            }
            this.qtd--;
            return true;

        }
        else {
            if (isEmpty())
                System.out.println("Lista vazia");
            else
                System.out.println("Não pertence a lista");
            return false;
        }
    }

    public void percorrerInverso(){//funcao sem finalidade, percorre do fim ao inicio
        LDENode<T> aux = this.tail;
        if(!this.isEmpty()){
            for(int i = 0; i < this.qtd; i++){
                aux = aux.getPrevious();
            }
        }
        else{
            System.out.println("LIsta vazia");
        }
    }

    public boolean deleteFirst(){
        if(!isEmpty()) {
            if (this.qtd == 1) {
                this.head = null;
                this.tail = null;
            } else {
                this.head = this.head.getNext();
                this.head.setPrevious(this.tail);
                this.tail.setNext(this.head);
            }
            this.qtd--;
            return true;
        }
        return false;
    }

    public boolean deleteLast(){
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
            return true;
        }
        return false;
    }

}
