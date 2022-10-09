package Java.Main.br.unicap.luis_00000845392.ed1.Tests.Lista_Feira_Teste;

public class LSEProdutos {

    private LSENode primeiro;

    //Inserir no inicio da lista
    public void inserirInicio(Produtos prods) {

        LSENode novo;
        novo = new LSENode(prods);

        if (this.isEmpty())
            this.primeiro = novo;

        else {
            novo.setProx(this.primeiro);
            this.primeiro = novo;
        }
    }

    //Inserir no final da lista
    public void inserirFinal(Produtos prods) {

        LSENode novo;
        LSENode aux;
        novo = new LSENode(prods);

        if (this.isEmpty())
            this.primeiro = novo;

        else {
            aux = this.primeiro;
            while(aux.getProx() != null ){
                aux = aux.getProx();
            }
            aux.setProx(novo);
        }
    }

    //exibir a lista completa
    public void exibir() {

        LSENode aux;

        if (this.isEmpty())
            System.out.println("Lista vazia!");

        else {
            aux = this.primeiro;

            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    //remover no inicio da lista
    public void removerInicio(){

        LSENode aux = this.primeiro;

        if (this.isEmpty())
            System.out.println("Lista vazia!");

        else {
            aux = this.primeiro;
            this.primeiro = aux;
        }
    }

    //remover no final da lista
    public void removerFinal(){

        LSENode aux = this.primeiro;
        LSENode pen = null;

        if(this.isEmpty())
            System.out.println("Lista vazia!");

        else{
            while(aux.getProx() != null){
                pen = aux;
                aux = aux.getProx();
            }
            pen.setProx(null);
        }
    }

    //buscar um no da lista
    public LSENode buscar(Produtos prods){

        LSENode aux;

        if(this.isEmpty())
            return null;

        else{
            aux = this.primeiro;
            while(aux != null){
                if(aux.getInfo().compareTo(prods) == 0)
                    return aux;
                else
                    aux = aux.getProx();
            }
            return null;
        }
    }


    public boolean isEmpty(){

        if(this.primeiro == null)
            return true;

        else
            return false;
    }
}
