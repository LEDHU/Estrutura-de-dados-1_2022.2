package br.unicap.luis_00000845392.ed1.LSE.Atividades.QUA_LISTA_LSE.Q2;

import java.util.Scanner;

public class LSENumero {
    Scanner teclado = new Scanner(System.in);
    // ATRIBUTO
    private LSENode primeiro;

    public boolean isEmpty() {
        if (this.primeiro == null)
            return true;
        else
            return false;
    }

    //Insere na lista
    public void inserir(Numero prod) {
        LSENode novo;
        novo = new LSENode(prod);

        if (!this.isEmpty())
            novo.setProx(this.primeiro);

        this.primeiro = novo;
    }

    //exibi a lista
    public void exibir() {
        LSENode aux;
        if (this.isEmpty())
            System.out.println("Lista vazia!");
        else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.print(aux.getInfo().getNum() + " ");
                aux = aux.getProx();
            }
        }
    }

    //remove o numero especifico
    public void remover(int numerozinho) {
        Numero proc = new Numero(numerozinho);
        LSENode atual, anterior;
        int contador = 0;

        if (this.isEmpty())
            System.out.println("Lista vazia!");

        else if (this.primeiro.getProx() == null) {
            if (proc.getNum() == this.primeiro.getInfo().getNum()) {
                this.primeiro = null;
                contador++;
            }

        } else {
            if (proc.getNum() == this.primeiro.getInfo().getNum()) {
                this.primeiro = this.primeiro.getProx();
                contador++;
            } else {
                atual = this.primeiro;
                anterior = null;
                while (atual != null) {
                    atual = this.primeiro;
                    while (atual != null) {
                        if (atual.getInfo().getNum() != proc.getNum()) {
                            anterior = atual;
                            atual = atual.getProx();
                        }
                        else
                            break;
                    }
                    if (atual != null) {
                        anterior.setProx(atual.getProx());
                        contador++;
                    }
                }
            }
        }

        if (!isEmpty()) {
            if (contador != 1)
                System.out.println("Foram " + contador + " vezes que esse numero se repetiu");
            else
                System.out.println("Foi " + contador + " vez que esse numero se repetiu");
        }
    }
}

