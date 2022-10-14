package br.unicap.luis_00000845392.ed1.Atividades.QUA_LISTA_LSE.Q3;

public class LSENumero {
    private LSENode primeiro;
    private LSENode segundo;
    private LSENode terceiro;

    public boolean isEmptyPri() {
        if(this.primeiro == null)
            return true;
        else
            return false;
    }
    public boolean isEmptySeg() {
        if(this.segundo == null)
            return true;
        else
            return false;
    }
    public boolean isEmptyTer() {
        if(this.terceiro == null)
            return true;
        else
            return false;
    }

    public void insere(Numero numerozinho,int op){
        LSENode novo;
        novo = new LSENode(numerozinho);

        if(op == 1){
            if(!this.isEmptyPri())
                novo.setProx(this.primeiro);

            this.primeiro = novo;
        }
        else if(op == 2){
            if(!this.isEmptySeg())
                novo.setProx(this.segundo);

            this.segundo = novo;
        }
        else {
            if(!this.isEmptyTer())
                novo.setProx(this.terceiro);

            this.terceiro = novo;
        }

    }

    public void exibir(){
        exibirLista1();
        exibirLista2();
        exibirLista3();
    }

    public void exibirLista1() {
        LSENode aux;
        System.out.println("\nLista 1: " );
        if (this.isEmptyPri())
            System.out.println("Lista vazia!");
        else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.print(aux.getInfo().getNum() + " ");
                aux = aux.getProx();
            }
        }
    }

    public void exibirLista2() {
        LSENode aux;
        System.out.println("\nLista 2: ");
        if (this.isEmptySeg())
            System.out.println("Lista vazia!!");
        else {
            aux = this.segundo;
            while (aux != null) {
                System.out.print(aux.getInfo().getNum() + " ");
                aux = aux.getProx();
            }
        }
    }

    public void exibirLista3() {
        LSENode aux;
        System.out.println("\nLista 3: ");
        if (this.isEmptyTer())
            System.out.println("Lista vazia!!!");
        else {
            aux = this.terceiro;
            while (aux != null) {
                System.out.print(aux.getInfo().getNum() + " ");
                aux = aux.getProx();
            }
        }
    }
    public void exibirALista3(LSENumero lala){
        LSENode aux;
        System.out.println("\nLista 3: ");
        if (this.isEmptyTer())
            System.out.println("Lista vazia!!!");
        else {
            aux = this.terceiro;
            while (aux != null) {
                System.out.print(aux.getInfo().getNum() + " ");
                aux = aux.getProx();
            }
        }

    }

    public LSENumero criaLista3(){
        LSENode novo1 ,novo2, novo3;
        LSENumero lista3 = new LSENumero();
        Numero novoNumero;

        int contador1 = 0;
        int contador2 = 0;
        int i = 0;

        //se as duas listas estao vazias
        //contador da lista 1
        novo1 = this.primeiro;
        while (novo1 != null){
            novo1 = novo1.getProx();
            contador1++;
        }
        //contador da lista 2
        novo2 = this.segundo;
        while (novo2 != null){
            novo2 = novo2.getProx();
            contador2++;
        }
        //se a lista um for maior que lista dois
        //passando os valores da lista 1 e lista 2
        // para a nova lista e somando
        novo1 = this.primeiro;
        novo2 = this.segundo;
        if(contador1 >= contador2){
            while(i < contador2){
                novoNumero = new Numero(0);
                novo3 = new LSENode(novoNumero);

                lista3.insere(novoNumero, 3);

                novoNumero.setNum((novo1.getInfo().getNum() + novo2.getInfo().getNum()));

                this.terceiro = novo3;

                novo1 = novo1.getProx();
                novo2 = novo2.getProx();
                i++;
            }
            while(i < contador1){
                novoNumero = new Numero(novo1.getInfo().getNum());
                novo3 = new LSENode(novoNumero);

                lista3.insere(novoNumero, 3);

                this.terceiro = novo3;

                novo1 = novo1.getProx();
                i++;
            }

        }
        //se a lista dois for maior que lista um
        //passando os valores da lista 1 e lista 2
        // para a nova lista e somando
        else{
            while(i < contador1){
                novoNumero = new Numero(0);
                novo3 = new LSENode(novoNumero);

                lista3.insere(novoNumero, 3);

                novoNumero.setNum((novo1.getInfo().getNum() + novo2.getInfo().getNum()));

                this.terceiro = novo3;

                novo1 = novo1.getProx();
                novo2 = novo2.getProx();
                i++;
            }

            while(i < contador2){
                novoNumero = new Numero(novo2.getInfo().getNum());
                novo3 = new LSENode(novoNumero);

                lista3.insere(novoNumero, 3);

                this.terceiro = novo3;

                novo2 = novo2.getProx();
                i++;
            }
        }
        return lista3;
    }
}
