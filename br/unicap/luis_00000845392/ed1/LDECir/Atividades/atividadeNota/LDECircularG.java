package br.unicap.luis_00000845392.ed1.LDECir.Atividades.atividadeNota;

import br.unicap.luis_00000845392.ed1.LDE.Listas.ListaNormal.LDENode;

import java.util.Scanner;

public class LDECircularG <T extends Comparable<Aluno>>{
    private LDENode<T> head;
    private LDENode<T> tail;
    private int qtd;

    public boolean isEmpty(){
        return this.qtd == 0;
    }

    //LETRA A
    public void insertLast(T valor){
        LDENode<T> novo = new LDENode<>(valor);
        LDENode<T> aux = this.tail;

        if(isEmpty())
            this.head = novo;
        else{
            aux.setNext(novo);
            novo.setPrevious(aux);
        }
        novo.setNext(this.head);
        novo.setPrevious(this.tail);
        this.tail = novo;
        this.qtd++;
    }

    //LETRA B
    public void listar(){
        LDENode<T> aux = this.head;
        if(this.isEmpty())
            System.out.println("Lista vazia");
        else {
            for (int i = 0; i < this.qtd; i++) {
                System.out.println(aux.getInfo());
                aux = aux.getNext();
            }
        }
    }
    //LETRA C
    public LDENode<T> buscar (String matri) {
        LDENode<T> aux = this.head;
        Aluno matr = new Aluno(matri);
        if (!this.isEmpty()){
            if(this.tail.getInfo().compareTo(matr) == 0)
                return this.tail;

            for (int i = 0; i < this.qtd; i++){
                if(aux.getInfo().compareTo(matr) <= 0) {
                    if (aux.getInfo().compareTo(matr) == 0) {
                        return aux;
                    }
                    aux = aux.getNext();
                }
                else
                    return null;
            }
        }
        return null;
    }

    //LETRA D
    public void alterarMediaFinal(String matricula){
        Scanner in = new Scanner(System.in);
        LDENode<T> aux = this.buscar(matricula);
        if(aux != null){
            System.out.println("Nova media: ");
            double media = in.nextDouble();
            aux.getInfo().;
            aux.getInfo().setMedia_f(media);
        }
        else
            System.out.println("Aluno não encontrado!");
    }

    //LETRA E
    public void alterarFalta(String matricula){
        Scanner in = new Scanner(System.in);
        LDENode<T> aux = this.buscar(matricula);
        if(aux != null){
            System.out.println("Acrescentar(falta positiva) ou decrementar(falta negativa): ");
            int falta = in.nextInt();
            aux.getInfo().setFaltas(getFaltas + falta);
            System.out.println("Alterado");
        }
        else
            System.out.println("Aluno não encontrado!");
    }

    //LETRA F
    public void exibir(String matri){
        LDENode<T> aux = this.buscar(matri);
        if(aux != null){
            System.out.println(aux.getInfo());
        }
        else
            System.out.println("Lista vazia");

    }

    //LETRA G
    public boolean remove(String matri){
        LDENode<T> aux = buscar(matri);

        if (aux != null) {
            if(this.qtd == 1){
                this.head = null;
                this.tail = null;
            }
            else if(this.head == aux){
                //deleteFirst();
                this.head = this.head.getNext();
                this.head.setPrevious(this.tail);
            }
            else if(this.tail == aux){
                //deleteLast();
                this.tail = this.tail.getPrevious();
                this.tail.setNext(this.head);
            }
            else{
                aux.getPrevious().setNext(aux.getNext());
                aux.getNext().setPrevious(aux.getPrevious());
            }
            this.qtd--;
            return true;

        }
        else {
            if (isEmpty())
                System.out.println("Lista vazia");
            else
                System.out.println("Aluno não cadastrado");
            return false;
        }
    }
}
