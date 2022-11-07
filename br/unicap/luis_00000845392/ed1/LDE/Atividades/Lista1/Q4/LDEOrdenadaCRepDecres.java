package br.unicap.luis_00000845392.ed1.LDE.Atividades.Lista1.Q4;

import br.unicap.luis_00000845392.ed1.LDE.Listas.ListaNormal.LDENode;

public class LDEOrdenadaCRepDecres <T extends Comparable<T>> {
    private LDENode<T> head;
    private LDENode<T> tail;
    private int qtd;

    public boolean isEmpty() {
        return this.qtd == 0;
    }

    public void inserir (T valor) {
        LDENode<T> novo = new LDENode<>(valor);
        LDENode<T> aux, anterior;
        if (this.isEmpty()) { // inserir na lista vazia
            this.head = novo;
            this.tail = novo;
            this.qtd++;
        }
        else if (valor.compareTo(this.head.getInfo()) > 0) { // inserir antes do primeiro
            novo.setNext(this.head);
            this.head.setPrevious(novo);
            this.head = novo;
            this.qtd++;
        }
        else if (valor.compareTo(this.tail.getInfo()) < 0) { // inserir depois do último
            this.tail.setNext(novo);
            novo.setPrevious(this.tail);
            this.tail = novo;
            this.qtd++;
        }
        else {
            aux = this.tail.getPrevious();
            while (true){
                if (valor.compareTo(aux.getInfo()) <= 0) { // achei local de inserção
                    anterior = aux.getNext();
                    anterior.setPrevious(novo);
                    aux.setNext(novo);
                    novo.setPrevious(aux);
                    novo.setNext(anterior);
                    this.qtd++;
                    break;
                }
                else {
                    aux = aux.getPrevious();
                }
            }
        }
    }
    // Implementar a busca sequencial melhorada
    private LDENode<T> buscar (T valor) {
        LDENode<T> aux;
        if (!this.isEmpty()){
            aux = this.tail;
            while (aux != null) {
                if(aux.getInfo().compareTo(valor) <= 0) {
                    if (aux.getInfo().compareTo(valor) == 0)
                        return aux;
                    else
                        aux = aux.getPrevious();
                }
                else
                    return null;
            }
        }
        return null;
    }

    // Implementar a remoção de um dado valor
    public void remover (T valor) {

        //lista vazia
        if(isEmpty())
            System.out.println("Lista vazia");

            //lista com apenas um no
        else if(this.qtd == 1){
            if(this.head.getInfo().compareTo(valor) == 0){
                this.head = null;
                this.tail = null;
                this.qtd--;
            }
            else
                System.out.println("Nao pertence a lista");
        }
        else{//lista com mais de um no

            //o primeiro no
            if(this.head.getInfo().compareTo(valor) == 0){
                this.head = this.head.getNext();
                this.head.setPrevious(null);
                this.qtd--;
            }
            //o ultimo no
            else if(this.tail.getInfo().compareTo(valor) == 0){
                this.tail = this.tail.getPrevious();
                this.tail.setNext(null);
                this.qtd--;
            }

            //se é menor do que o primeiro no
            else if(this.head.getInfo().compareTo(valor) < 0) {
                System.out.println("Nao pertence a lista 1");
            }

            //se é maior do que o ultimo no
            else if(this.tail.getInfo().compareTo(valor) > 0) {
                System.out.println("Nao pertence a lista 2");
            }

            //ta no meio
            else{
                LDENode<T> aux = buscar(valor);
                if(aux != null){
                    aux.getPrevious().setNext(aux.getNext());
                    aux.getNext().setPrevious(aux.getPrevious());
                    this.qtd--;
                }
                else{
                    System.out.println("Nao pertence a lista 3");
                }
            }
        }
    }

    // Implementar o exibir todos
    public void exibirCrescente () {
        LDENode<T> aux;
        if (this.isEmpty())
            System.out.println("Lista vazia");

        else {
            aux = this.tail;
            for(int i = 0; i < this.qtd; i++){
                System.out.print(aux.getInfo() + " ");
                aux = aux.getPrevious();
            }
            System.out.println();
        }
    }

    public void exibirDecrescente () {
        LDENode<T> aux;
        if (this.isEmpty())
            System.out.println("Lista vazia");

        else {
            aux = this.head;
            for(int i = 0; i < this.qtd; i++){
                System.out.print(aux.getInfo() + " ");
                aux = aux.getNext();
            }
            System.out.println();
        }
    }

    public boolean naLista(T no){//se ta na lista
        LDENode<T> aux = buscar(no);
        return aux == null;
    }
}
