package br.unicap.luis_00000845392.ed1.LSE.Atividades.QUA_LISTA_LSE.Q1;

import java.util.Scanner;

public class LSEProduto {
    Scanner teclado = new Scanner (System.in);
    // ATRIBUTO
    private LSENode primeiro;

    // METODOS
    public boolean isEmpty() {
        if(this.primeiro == null)
            return true;
        else
            return false;
    }

    //Letra A. Insere o produto no inicio da lista
    public void inserirProduto(Produto prod) {
        LSENode novo;
        LSENode result = this.procura(prod);

        if (result != null)
            System.out.println("Aluno já existe na lista!");
        else {
            novo = new LSENode(prod);

            if (this.isEmpty())
                this.primeiro = novo;
            else {
                novo.setProx(this.primeiro);
                this.primeiro = novo;
            }
        }
    }

    //Letra B. Insere o produto no final da lista
    public void inserirProdutoFinal(Produto produtinho) {
        LSENode novo, aux;
        LSENode result = this.procura(produtinho);
        if (result != null) {
            System.out.println("Aluno já existe na lista!");
        } else {
            novo = new LSENode(produtinho);
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

    //Letra C. Exibir todos da lista
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

    //Letra D. Remover na primeira posição
    public void removerPrimeiro() {
        if (this.isEmpty())
            System.out.println("Lista vazia!");
        else
            this.primeiro = this.primeiro.getProx();

    }

    //Letra E. Removar na última posição
    public void removerUltimo() {
        LSENode aux, penultimo = null;
        if (this.isEmpty()) {
            System.out.println("Lista vazia!");
        } else if (this.primeiro.getProx() == null) {
            this.primeiro = null;
        }
        else {
            aux = this.primeiro;
            while (aux.getProx() != null) {
                penultimo = aux;
                aux = aux.getProx();
            }
            penultimo.setProx(null);
        }
    }

    //Letra F. Função que retorna o no
    private LSENode procura(Produto prod) {
        LSENode aux;

        if (this.isEmpty())
            return null;
        else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfo().compareTo(prod) == 0)
                    return aux;
                else
                    aux = aux.getProx();
            }
            return null;
        }
    }

    //Letra G. Exibir os dados de um produto
    public void exibirProduto (String c) {
        Produto aux = new Produto(c);
        LSENode result = this.procura(aux);
        if (result == null)
            System.out.println("Produto não está cadastrado");

        else
            System.out.println(result.getInfo());
    }

    //Letra H. Alterar dados de um produto
    public void alterarProduto (String c){
        Produto aux = new Produto(c);
        LSENode result = this.procura(aux);
        double valor;
        int est, op;
        if (result == null)
            System.out.println("Produto não está cadastrado");

        else {
            System.out.println("Quer alterar o preço? Sim - 1 / Não - 2");
            op = teclado.nextInt();
            if(op == 1) {
                System.out.println("Novo o preço: ");
                valor = teclado.nextDouble();
                result.getInfo().setPreco(valor);
                System.out.println("Alterado!");
            }
            System.out.println("Quer alterar o estoque? Sim - 1 / Não - 2");
            op = teclado.nextInt();
            if(op == 1) {
                System.out.println("Novo o estoque: ");
                est = teclado.nextInt();
                result.getInfo().setEstoque(est);
                System.out.println("Alterado!");
            }
        }
    }

    //Letra I. Remover um produto pelo codigo
    public void remover(String produtinho) {
        Produto proc = new Produto(produtinho);
        LSENode atual, anterior;

        if (this.isEmpty())
            System.out.println("Lista vazia!");

        else if (this.primeiro.getProx() == null) {
            if (proc.compareTo(this.primeiro.getInfo()) == 0) {
                this.primeiro = null;
                System.out.println("Remoção efetuada");
            } else
                System.out.println("Produto não está cadastrado!");
        }

        else {
            if (proc.compareTo(this.primeiro.getInfo()) == 0) {
                this.primeiro = this.primeiro.getProx();
                System.out.println("Remoção efetuada");
            } else {
                anterior = null;
                atual = this.primeiro;
                while (atual != null) {
                    if (atual.getInfo().compareTo(proc) != 0 ) {
                        anterior = atual;
                        atual = atual.getProx();
                    }
                    else {
                        break;
                    }
                }
                if (atual == null) {
                    System.out.println("Produto não está cadastrado!");
                }
                else {
                    anterior.setProx(atual.getProx());
                    System.out.println("Remoção efetuada!");
                }
            }
        }
    }
}
