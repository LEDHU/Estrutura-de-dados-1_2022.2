package LSEComDescritor.AtvListaLivro;

public class LSEOrdenada <T extends Comparable<T>> {
    private LSENode<T> primeiro;
    private LSENode<T> ultimo;
    private int qtd;

    public boolean vazio() {
        return this.qtd == 0 && this.primeiro == null && this.ultimo == null;
    }

    public LSENode<T> buscar(Livro livro){
        LSENode<T> aux = this.primeiro;

        while (aux != null){
            if(aux.getInfo().compareTo((T) livro) == 0)
                return aux;
            aux = aux.getProx();
        }
        return null;
    }


    //aceita repetidos
    public void inserirOrdenado(T valor) {
        LSENode<T> novo = new LSENode<>(valor);
        LSENode<T> anterior = null;
        LSENode<T> atual;
        //para caso a lista ta vazia
        if (vazio()) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            System.out.println("Livro adicionado!");
        }
        //para adicionar no primeiro no
        else if (valor.compareTo(this.primeiro.getInfo()) < 0) {
            if(buscar((Livro) valor) == null){
                novo.setProx(this.primeiro);
                this.primeiro = novo;
                this.qtd++;
                System.out.println("Livro adicionado!");
            }
            else
                System.out.println("Livro ja tem na prateleira");
        }
        //para adicionar no ultimo no
        else if (valor.compareTo(this.ultimo.getInfo()) > 0) {
            if(buscar((Livro) valor) == null) {
                this.ultimo.setProx(novo);
                this.ultimo = novo;
                this.qtd++;
                System.out.println("Livro adicionado!");
            }
            else
                System.out.println("Livro ja tem na prateleira");
        }
        //para adicionar no meio
        else {
            if (buscar((Livro) valor) == null) {
                atual = this.primeiro;
                while (atual != null) {
                    if (atual.getInfo().compareTo(valor) > 0) {
                        anterior.setProx(novo);
                        novo.setProx(atual);
                        this.qtd++;
                        System.out.println("Livro adicionado!");
                        break;
                    } else {
                        anterior = atual;
                        atual = atual.getProx();
                    }
                }
                if (atual == null) {
                    this.ultimo.setProx(novo);
                    this.ultimo = novo;
                    this.qtd++;
                    System.out.println("Livro adicionado!");
                }
            }
            else
                System.out.println("Livro ja tem na prateleira");
        }
    }
    public void exibirGeral() {
        LSENode<T> aux;

        if (this.vazio())
            System.out.println("Nenhum livro encontrado na prateleira\n");

        else {
            aux = this.primeiro;

            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public void remover(String codigo){
        Livro livro = new Livro(codigo);

        //esta vazia
        if(vazio())
            System.out.println("Nao exite nenhum livro na prateleira para remover\n");

        //com apenas um no
        else if(this.qtd == 1){
            if(livro.compareTo((Livro) this.primeiro.getInfo()) == 0){

                this.primeiro = null;
                this.ultimo = null;
                this.qtd--;
                System.out.println("Removido especifico com apenas um no (1)" + this.qtd);
            }
            else
                System.out.println("Livro nao encontrado na prateleira para remover\n");
        }
        //remover o primeiro com varios nos
        else if(livro.compareTo((Livro) this.primeiro.getInfo()) == 0){
            this.primeiro = this.primeiro.getProx();
            this.qtd--;
            System.out.println("Livro removido na primeira com varios nos (2)" + this.qtd);

        }

        //para quando o no é menor que o primeiro no
        else if(livro.compareTo((Livro) this.primeiro.getInfo()) < 0){
            System.out.println("Livro nao encotrado");
        }
        //para quando o no é maior que o ultimo no
        else if(livro.compareTo((Livro) this.ultimo.getInfo()) > 0){
            System.out.println("Livro nao encotrado");
        }

        //remove o ultimo com varios nos
        else if(livro.compareTo((Livro) this.ultimo.getInfo()) == 0){
            LSENode<T> atual = this.primeiro.getProx();
            while(atual.getProx() != this.ultimo){
                atual = atual.getProx();
            }
            atual.setProx(null);
            this.ultimo = atual;
            this.qtd--;
            System.out.println("Livro removido na ultima com varios nos(3)" + this.qtd);
        }
        //remover meio com varios nos
        else{
            LSENode<T> atual, anterior;
            anterior = this.primeiro;
            atual = this.primeiro.getProx();

            while (atual.getProx() != null) {
                if (livro.compareTo((Livro) atual.getInfo()) == 0)
                    break;

                else {
                    anterior = atual;
                    atual = atual.getProx();
                }

                if(atual.getProx() == null)
                    break;

            }
            if (livro.compareTo((Livro) atual.getInfo()) == 0) {

                anterior.setProx(atual.getProx());
                this.qtd--;
                System.out.println("Livro excluido no meio com varios nos(4)" + this.qtd);

            } else
                System.out.println("Livro nao encontrado na prateleira para remover\n");
        }

    }

    public void exibirLivro(String codigo){
        Livro aux = new Livro(codigo);
        LSENode<T> result = this.buscar(aux);

        if(result == null)
            System.out.println("Livro nao encontrado na prateleira\n");
        else
            System.out.println(result.getInfo());
    }

    public void alterarPreco(String codigo, double preco){
        Livro aux = new Livro(codigo);
        LSENode<T> result = this.buscar(aux);

        if(result == null)
            System.out.println("Livro nao encontrado na prateleira para alterar preco\n");
        else {
            aux = (Livro) result.getInfo();

            aux.setPreco(preco);
            System.out.println("Preco alterado");
        }
    }

    public void alterarEstoque(String codigo, int estoque){
        Livro aux = new Livro(codigo);
        LSENode<T> result = this.buscar(aux);

        if(result == null)
            System.out.println("Livro nao encontrado na prateleira para estoque\n");
        else {
            aux = (Livro) result.getInfo();
            aux.setEstoque(estoque);
            System.out.println("Estoque alterado");
        }
    }

    public void vender(String codigo){
        Livro aux = new Livro(codigo);
        LSENode<T> result = this.buscar(aux);

        if(result == null)
            System.out.println("Livro nao encontrado na prateleira para vender\n");

        else {
            System.out.println("Livro vendido");
            aux = (Livro) result.getInfo();
            aux.setEstoque(aux.getEstoque() - 1);
        }
    }





}