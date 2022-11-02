package br.unicap.luis_00000845392.ed1.LSE.LSECompleto;

import java.util.Scanner;

public class LSEAluno {

    // Atributo
    private LSENode primeiro;

    // Métodos públicos
    public boolean isEmpty() {
        // Testa se a lista está vazia
        return this.primeiro == null;

    }

    public void remover (String matr) {
        Aluno noQueEuQueroExcluir = new Aluno(matr);
        if (this.isEmpty())
            System.out.println("Lista vazia!");

        else if (this.primeiro.getProx() == null) {
            if (noQueEuQueroExcluir.compareTo(this.primeiro.getInfo()) == 0) {
                this.primeiro = null;
                System.out.println("Remoção efetuada");
            }
            else
                System.out.println("Aluno não encontrado!");

        }
        else {
            LSENode aux1 = this.primeiro;
            LSENode aux2 = this.primeiro;
            LSENode aux3 = this.primeiro;
            aux1 = aux1.getProx();


            if(noQueEuQueroExcluir.compareTo(this.primeiro.getInfo()) == 0){
                this.primeiro = aux3.getProx();
                System.out.println("Removido!");
            }

            while(noQueEuQueroExcluir.compareTo(aux1.getInfo()) != 0) {
                aux2 = aux2.getProx();
                if(aux1.getProx() == null)
                    break;
                aux1 = aux1.getProx();
            }
            if(noQueEuQueroExcluir.compareTo((aux1.getInfo())) == 0) {
                aux2.setProx(aux1.getProx());
                System.out.println("Removido!");
            }
            else
                System.out.println("Aluno não encontrado!");
        }
    }

    public LSEAluno xeroCopia(){

        LSENode original;
        LSEAluno fake = new LSEAluno();
        Aluno novoAluno, auxAluno;

        if(!this.isEmpty()){
            original = this.primeiro;
            while(original != null){
                auxAluno = original.getInfo();
                novoAluno = new Aluno(auxAluno.getMatr(), auxAluno.getNome(),auxAluno.getMedia(), auxAluno.getFaltas());
                fake.inserirAlunoFinal(novoAluno);
                original = original.getProx();

            }
        }
        return fake;
    }

    private LSENode buscar(Aluno al) { // Busca sequencial simples
        LSENode aux;
        if (!this.isEmpty()){
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfo().compareTo(al) == 0)
                    return aux;
                else
                    aux = aux.getProx();
            }
        }
        return null;
    }

    public void exibirAluno (String m) {
        Aluno aux = new Aluno(m);
        LSENode result = this.buscar(aux);
        if (result == null)
            System.out.println("Aluno não encontrado!");

        else {
            System.out.println("Dados do aluno");
            System.out.println(result.getInfo());
        }
    }

    public void alterarMedia (String matri) {
        Scanner in = new Scanner (System.in);
        Aluno aux = new Aluno(matri);
        double media;
        LSENode result = this.buscar(aux);
        if (result == null)
            System.out.println("Aluno não encontrado!");

        else {
            System.out.print("Informe a nova média do aluno: ");
            media = in.nextDouble();
            result.getInfo().setMedia(media);
            System.out.println("Média alterada!");
        }
    }

    public void alterarFalta (String matri){
        Scanner in = new Scanner (System.in);
        Aluno aux = new Aluno(matri);
        int falta;
        LSENode result = this.buscar(aux);
        if (result == null)
            System.out.println("Aluno não encontrado!");

        else {
            System.out.print("Informe a quantidade de faltas: ");
            falta = in.nextInt();
            result.getInfo().setFaltas(falta);
            System.out.println("Faltas alterada!");
        }
    }

    public void inserirAluno(Aluno al) {
        LSENode novo;
        // Verifica, usando a função "buscar" se o aluno já é cadastrado
        LSENode result = this.buscar(al);
        if (result != null)
            System.out.println("Aluno já existe na lista!");
        else {
            // Cria e preenche um novo nó com o aluno que foi passado como parâmetro
            novo = new LSENode(al);
            // Insere um novo aluno no início da lista de alunos
            if (!this.isEmpty())
                novo.setProx(this.primeiro);
            this.primeiro = novo;
        }
    }

    public void inserirAlunoFinal(Aluno al) {
        LSENode novo, aux;
        // Verifica, usando a função "buscar" se o aluno já é cadastrado
        LSENode result = this.buscar(al);
        if (result != null) {
            System.out.println("Aluno já existe na lista!");
        } else {
            // Cria e preenche um novo nó com o aluno que foi passado como parâmetro
            novo = new LSENode(al);
            // Insere um novo aluno no final da lista de alunos
            if (this.isEmpty())
                this.primeiro = novo;
            else {
                aux = this.primeiro;
                while (aux.getProx() != null) {
                    aux = aux.getProx();
                }
                aux.setProx(novo);
            }
        }
    }

    public void exibir() {
        // Exibe o conteúdo de todos os nós da lista
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
    public LSEAluno criarUniao(LSEAluno lista2){
        LSEAluno listaUniao = new LSEAluno();
        LSENode aux;
        Aluno original, copia;
        aux = this.primeiro;
        while(aux != null){
            original = aux.getInfo();
            //fazer uma copia na class aluno
            //copia = original.copiarAluno();
            //listaUniao.inserirAlunoFinal(copia);
            aux = aux.getProx();

        }
        aux = lista2.primeiro;
        while(aux != null){
            original = aux.getInfo();
            //fazer uma copia na class aluno
            //copia = original.copiarAluno();
            //listaUniao.inserirAlunoFinal(copia);
            aux = aux.getProx();
        }
        return listaUniao;
    }
}