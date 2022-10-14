package br.unicap.luis_00000845392.ed1.LSEComDescritor.Aula_2_LSEOrdenada;

public class LSEDescritor<T extends Comparable<T>> {
    private LSENode<T> primeiro;
    private LSENode<T> ultimo;
    private int qtd;

    public boolean vazio() {
        return this.qtd == 0 && this.primeiro == null && this.ultimo == null;
    }

    public void inserirNoInicio(T valor) {
        LSENode<T> novo = new LSENode<T>(valor);
        if (vazio()) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else {
            novo.setProx(this.primeiro);
            this.primeiro = novo;
            this.qtd++;
        }
    }

    public void inserirNoFinal(T valor) {
        LSENode<T> novo = new LSENode<>(valor);
        if (vazio()) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else {
            this.ultimo.setProx(novo);
            this.ultimo = novo;
            this.qtd++;
        }
    }

    public void removerInicio() {
        if (vazio())
            System.out.println("Lista vazia!");
        else if (this.qtd == 1) {
            this.primeiro = null;
            this.ultimo = null;
            this.qtd--;
        } else {
            this.primeiro = this.primeiro.getProx();
            this.qtd--;
        }
    }

    public void removerFinal() {
        if (vazio())
            System.out.println("Lista vazia!!");
        else if (this.qtd == 1) {
            this.ultimo = null;
            this.primeiro = null;
            this.qtd--;
        } else {
            this.ultimo = null;
            this.qtd--;
        }
    }

    public void exibirGeral() {
        LSENode<T> aux;

        if (this.vazio())
            System.out.println("Lista vazia!");

        else {
            aux = this.primeiro;

            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    // Inserir ordenado em ordem crescente e sem repetidos
    // Este código está inserindo repetidos
    // O que devemos fazer para que não sejam inserido valores repetidos????
    public void inserirOrdenado (T valor) {
        LSENode novo = new LSENode (valor);
        LSENode anterior = null, atual;
        if (vazio()) { // inserção na lista vazia
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        }
        else if (valor.compareTo(this.primeiro.getInfo()) < 0) {
            novo.setProx(this.primeiro);
            this.primeiro = novo;
            this.qtd++;
        }
        else if (valor.compareTo(this.ultimo.getInfo()) > 0) {
            this.ultimo.setProx(novo);
            this.ultimo = novo;
            this.qtd++;
        }
        else {
            atual = this.primeiro;
            while (atual != null) {
                if (atual.getInfo().compareTo(valor) > 0) {
                    anterior.setProx(novo);
                    novo.setProx(atual);
                    this.qtd++;
                    break;
                }
                else {
                    anterior = atual;
                    atual = atual.getProx();
                }
            }
            if(atual == null){
                this.ultimo.setProx(novo);
                this.ultimo = novo;
                this.qtd++;
            }
        }
    }
}