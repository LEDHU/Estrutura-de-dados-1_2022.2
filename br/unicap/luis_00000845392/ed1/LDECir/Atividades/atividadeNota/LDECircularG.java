package br.unicap.luis_00000845392.ed1.LDECir.Atividades.atividadeNota;

import br.unicap.luis_00000845392.ed1.LDE.Listas.ListaNormal.LDENode;

public class LDECircularG <T extends Comparable<T>>{
    private LDENode<T> head;
    private LDENode<T> tail;
    private int qtd;

    public boolean isEmpty(){
        return this.qtd == 0;
    }

    //LETRA A
    public void insertLast(T valor){
        LDENode<T> novo = new LDENode<>(valor);
        LDENode<T> aux = this.tail;

        if(this.isEmpty())
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

    //LETRA B
    public void listar(){
        LDENode<T> aux = this.head;
        if(this.isEmpty())
            System.out.println("Lista vazia");
        else {
            for (int i = 0; i < this.qtd; i++) {
                System.out.println(aux.getInfo());
                System.out.println();
                aux = aux.getNext();
            }
        }
    }
    //LETRA C
    public LDENode<T> consultar(T valor){
        LDENode<T> aux = this.head;
        if (!this.isEmpty()){
            for (int i = 0; i < this.qtd; i++){
                if(aux.getInfo().compareTo(valor) == 0)
                    return aux;
                else
                    aux = aux.getNext();
            }
        }
        return null;
    }

    //LETRA G
    public void remove(T valor){
        LDENode<T> aux = consultar(valor);

        if (aux != null) {
            if(this.qtd == 1){
                this.head = null;
                this.tail = null;
            }
            else if(this.head == aux){
                //deleteFirst();
                this.head = this.head.getNext();
                this.head.setPrevious(this.tail);
            }
            else if(this.tail == aux){
                //deleteLast();
                this.tail = this.tail.getPrevious();
                this.tail.setNext(this.head);
            }
            else{
                aux.getPrevious().setNext(aux.getNext());
                aux.getNext().setPrevious(aux.getPrevious());
            }
            this.qtd--;
        }
        else {
            if (isEmpty())
                System.out.println("Lista vazia");
            else
                System.out.println("Aluno não cadastrado");
        }
    }

}
