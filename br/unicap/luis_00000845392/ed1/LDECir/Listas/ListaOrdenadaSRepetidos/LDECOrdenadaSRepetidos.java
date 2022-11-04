package br.unicap.luis_00000845392.ed1.LDECir.Listas.ListaOrdenadaSRepetidos;

import br.unicap.luis_00000845392.ed1.LDE.Listas.LDENode;

public class LDECOrdenadaSRepetidos<T extends Comparable<T>> {
    private LDENode<T> head;
    private LDENode<T> tail;
    private int qtd;

    public boolean isEmpty() {
        return this.qtd == 0;
    }

    public void inserir(T valor) {
        LDENode<T> novo = new LDENode<>(valor);

        if (this.isEmpty()) {
            this.head = novo;
            this.tail = novo;
            this.qtd++;
        } else if (valor.compareTo(this.head.getInfo()) < 0) {
            novo.setNext(this.head);
            this.head.setPrevious(novo);
            this.head = novo;
            this.qtd++;
        } else if (valor.compareTo(this.head.getInfo()) == 0) {
            System.out.println("Valor repetido. Inserção não efetuada!");
        } else if (valor.compareTo(this.tail.getInfo()) > 0) { // inserir depois do último
            this.tail.setNext(novo);
            novo.setPrevious(this.tail);
            this.tail = novo;
            this.qtd++;
        } else if (valor.compareTo(this.tail.getInfo()) == 0) {
            System.out.println("Valor repetido. Inserção não efetuada!");
        } else {
            LDENode<T> aux = this.head.getNext(), anterior;
            while (true) {
                if (valor.compareTo(aux.getInfo()) == 0) {
                    System.out.println("Valor repetido. Inserção não efetuada!");
                    break;
                } else if (valor.compareTo(aux.getInfo()) < 0) { // achei local de inserção
                    anterior = aux.getPrevious();
                    anterior.setNext(novo);
                    aux.setPrevious(novo);
                    novo.setNext(aux);
                    novo.setPrevious(anterior);
                    this.qtd++;
                    break;
                } else {
                    aux = aux.getNext();
                }
            }
        }
    }

    public LDENode<T> buscar(T valor) {
        LDENode<T> aux;
        if (!this.isEmpty()) {
            aux = this.head;
            while (aux != null) {
                if (aux.getInfo().compareTo(valor) <= 0) {
                    if (aux.getInfo().compareTo(valor) == 0)
                        return aux;
                    else
                        aux = aux.getNext();
                } else
                    return null;
            }
        }
        return null;
    }

    public void remover(T valor) {

        //lista vazia
        if (isEmpty())
            System.out.println("Lista vazia");

            //lista com apenas um no
        else if (this.qtd == 1) {
            if (this.head.getInfo().compareTo(valor) == 0) {
                this.head = null;
                this.tail = null;
                this.qtd--;
            } else
                System.out.println("Nao pertence a lista");
        } else {//lista com mais de um no

            //o primeiro no
            if (this.head.getInfo().compareTo(valor) == 0) {
                this.head = this.head.getNext();
                this.head.setPrevious(null);
                this.qtd--;
            }
            //o ultimo no
            else if (this.tail.getInfo().compareTo(valor) == 0) {
                this.tail = this.tail.getPrevious();
                this.tail.setNext(null);
                this.qtd--;
            }

            //se é menor do que o primeiro no
            else if (this.head.getInfo().compareTo(valor) > 0) {
                System.out.println("Nao pertence a lista");
            }

            //se é maior do que o ultimo no
            else if (this.tail.getInfo().compareTo(valor) < 0) {
                System.out.println("Nao pertence a lista");
            }

            //ta no meio
            else {
                LDENode<T> aux = buscar(valor);
                if (aux != null) {
                    aux.getPrevious().setNext(aux.getNext());
                    aux.getNext().setPrevious(aux.getPrevious());
                    this.qtd--;
                } else {
                    System.out.println("Nao pertence a lista");
                }
            }
        }
    }
    public void exibirTodos () {
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
}