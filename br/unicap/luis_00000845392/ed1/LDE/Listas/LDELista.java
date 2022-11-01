package br.unicap.luis_00000845392.ed1.LDE.Listas;

public class LDELista<T extends Comparable<T>>{
    private LDENode<T> head;
    private LDENode<T> tail;
    private int qtd;

    public boolean isEmpty() {
        return this.head == null && this.tail == null && this.qtd == 0;
    }

    public void addFirst(T valor){
        LDENode<T> novo = new LDENode<>(valor);
        LDENode<T> aux = this.head;

        if(isEmpty())
            this.tail = novo;

        else{
            novo.setNext(aux);
            aux.setPrevious(novo);
        }
        this.head = novo;
        this.qtd++;
    }

    public void addLast(T valor){
        LDENode<T> novo = new LDENode<>(valor);
        LDENode<T> aux = this.tail;

        if(isEmpty())
            this.head = novo;

        else{
            aux.setNext(novo);
            novo.setPrevious(aux);
        }
        this.tail = novo;
        this.qtd++;

    }

    public boolean remove(T valor){
        if(isEmpty()) {
            System.out.println("Lista vazia");
            return false;
        }
        else if(this.qtd == 1){
            if(this.head.getInfo().compareTo(valor) == 0){
                this.head = null;
                this.tail = null;
                this.qtd--;
                return true;
            }
            else {
                System.out.println("Nao pertence a lista");
                return false;
            }
        }
        else{
            if(this.head.getInfo().compareTo(valor) == 0){
                this.head = this.head.getNext();
                this.head.setPrevious(null);
                this.qtd--;
                return true;
            }
            else if(this.tail.getInfo().compareTo(valor) == 0){
                this.tail = this.tail.getPrevious();
                this.tail.setNext(null);
                this.qtd--;
                return true;
            }
            else{
                LDENode<T> aux;
                aux = this.head.getNext();
                int cont = 0;
                while(cont < this.qtd){
                    if(aux.getInfo().compareTo(valor) == 0){
                        aux.getPrevious().setNext(aux.getNext());
                        aux.getNext().setPrevious(aux.getPrevious());
                        this.qtd--;
                        return true;
                    }
                    else{
                        aux = aux.getNext();
                        cont++;
                    }
                }
            }
        }
        return false;
    }

    public void exibirAoContrario() {
        LDENode<T> aux;
        if (this.isEmpty())
            System.out.println("Lista vazia");

        else {
            aux = this.tail;
            while (aux != null) {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getPrevious();
            }
            System.out.println("");
        }
    }

    private LDENode<T> buscar(T valor) { // Busca sequencial simples
        LDENode<T> aux;
        if (!this.isEmpty()){
            aux = this.head;
            while (aux != null) {
                if (aux.getInfo().compareTo(valor) == 0)
                    return aux;
                else
                    aux = aux.getNext();
            }
        }
        return null;
    }

    public boolean removerFinal(){
        if(this.tail == null)
            return false;
        if(this.qtd == 1){
            this.tail = null;
            this.head = null;
            this.qtd--;
            return true;
        }
        this.tail = this.tail.getPrevious();
        this.tail.setNext(null);
        this.qtd--;
        return true;
    }

    public boolean removerInicio(){
        if(this.head == null)
            return false;
        if(this.qtd == 1){
            this.tail = null;
            this.head = null;
            this.qtd--;
            return true;
        }
        this.head = this.tail.getNext();
        this.head.setPrevious(null);
        return true;
    }


    public void exibiGeral(){
        LDENode<T> aux;

        if(isEmpty())
            System.out.println("Lista vazia");
        else{
            aux = this.head;
            for(int i = 0; i < qtd; i++){
                System.out.println(aux.getInfo());
                aux = aux.getNext();
            }
        }
    }

}
