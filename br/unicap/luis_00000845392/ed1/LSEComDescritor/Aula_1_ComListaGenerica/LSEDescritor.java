package br.unicap.luis_00000845392.ed1.LSEComDescritor.Aula_1_ComListaGenerica;

public class LSEDescritor<T> {
    private LSENode<T> primeiro;
    private LSENode<T> ultimo;
    private int qtd;

    public boolean vazio(){
        return this.qtd == 0 && this.primeiro == null && this.ultimo == null;
    }

    public void inserirNoInicio (T valor){
        LSENode<T> novo = new LSENode<>(valor);
        if(vazio()) {
            this.primeiro = novo;
            this.ultimo = novo;
        }
        else{
            novo.setProx(this.primeiro);
            this.primeiro = novo;
        }
        this.qtd++;
    }

    public void inserirNoFinal(T valor){
        LSENode<T> novo = new LSENode<>(valor);
        if(vazio()){
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        }
        else{
            this.ultimo.setProx(novo);
            this.ultimo = novo;
            this.qtd++;
        }
    }

    public void removerInicio(){
        if(vazio())
            System.out.println("Lista vazia!");
        else if(this.qtd == 1){
            this.primeiro = null;
            this.ultimo = null;
            this.qtd--;
        }
        else {
            this.primeiro = this.primeiro.getProx();
            this.qtd--;
        }
    }

    public void removerFinal(){
        if(vazio())
            System.out.println("Lista vazia!!");
        else if(this.qtd == 1){
            this.ultimo = null;
            this.primeiro = null;
            this.qtd--;
        }
        else{
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
}
