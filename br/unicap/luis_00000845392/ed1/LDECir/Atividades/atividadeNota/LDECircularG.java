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

        if(this.isEmpty())
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
                System.out.println();
                aux = aux.getNext();
            }
        }
    }
    //LETRA C
    public Aluno consultar(String matricula){
        LDENode<T> aux = this.head;
        Aluno aluno = new Aluno(matricula);
        if (!this.isEmpty()){
            for (int i = 0; i < this.qtd; i++){
                if(aux.getInfo().compareTo(aluno) == 0){

                    return ;
                }
                else
                    aux = aux.getNext();
            }
        }
        return null;
    }

    //LETRA D
    public void alterarMediaFinal(String matricula){
        Scanner in = new Scanner(System.in);
        Aluno aux = this.consultar(matricula);
        if(aux != null){
            System.out.println("Nova media: ");
            double media = in.nextDouble();
            aux.setMedia_f(media);
        }
        else
            System.out.println("Aluno não encontrado!");
    }

    //LETRA E
    public void alterarFalta(String matricula){
        Scanner in = new Scanner(System.in);
        Aluno aux = this.consultar(matricula);
        if(aux != null){
            System.out.println("Acrescentar(falta positiva) ou decrementar(falta negativa): ");
            int falta = in.nextInt();
            aux.setFaltas(aux.getFaltas() + falta);
            System.out.println("Alterado");
        }
        else
            System.out.println("Aluno não encontrado!");
    }

    //LETRA F
    public void exibir(String matri){
        Aluno aux = this.consultar(matri);
        if(aux != null){
            System.out.println("Media Final: " + aux.getMedia_f() +
                    "\nFaltas: " + aux.getFaltas());
        }
        else
            System.out.println("Lista vazia");

    }

    //LETRA G
    public void remove(String matri){
        Aluno aluno = new Aluno(matri);
        LDENode<T> aux = buscar(aluno);

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
        }
        else {
            if (isEmpty())
                System.out.println("Lista vazia");
            else
                System.out.println("Aluno não cadastrado");
        }
    }

    public LDENode<T> buscar (Aluno valor) {
        LDENode<T> aux = this.head;
        if (!this.isEmpty()){

            if(this.tail.getInfo().compareTo(valor) == 0)
                return this.tail;

            for (int i = 0; i < this.qtd; i++){
                if(aux.getInfo().compareTo(valor) <= 0) {
                    if (aux.getInfo().compareTo(valor) == 0)
                        return aux;
                    aux = aux.getNext();
                }
                else
                    return null;
            }
        }
        return null;
    }
}
