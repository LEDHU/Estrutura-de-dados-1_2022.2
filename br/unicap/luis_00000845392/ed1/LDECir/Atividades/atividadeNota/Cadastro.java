package br.unicap.luis_00000845392.ed1.LDECir.Atividades.atividadeNota;

import br.unicap.luis_00000845392.ed1.LDE.Listas.ListaNormal.LDENode;

import java.util.Scanner;

public class Cadastro {
    private final LDECircularG<Aluno> lista;

    //Construdor
    public Cadastro(){
        lista = new LDECircularG<>();
    }

    //Letra A
    public void cadastrar(Aluno aluno){
        lista.insertLast(aluno);
    }

    //Letra B
    public void listar(){
        lista.listar();
    }

    //Letra C
    //funcionalidade consultar/buscar

    //LETRA D
    public void alterarMediaFinal(String matricula){
        Scanner in = new Scanner(System.in);
        Aluno aluno = new Aluno(matricula);
        LDENode<Aluno> aux = lista.consultar(aluno);
        double media;

        if(aux != null){
            System.out.println("Nova media: ");
            media = in.nextDouble();
            aluno = aux.getInfo();
            aluno.setMedia_f(media);
        }
        else
            System.out.println("Aluno não encontrado!");
    }

    //Letra E
    public void alterarFalta(String matricula){
        Scanner in = new Scanner(System.in);
        Aluno aluno = new Aluno (matricula);
        LDENode<Aluno> aux = lista.consultar(aluno);
        int faltas;

        if (aux != null) {
            aluno = aux.getInfo();
            System.out.println("Acrescentar(falta positiva) ou decrementar(falta negativa): ");
            faltas = in.nextInt();
            aluno.setFaltas(aluno.getFaltas() + faltas);
            System.out.println("alteração realizada");
        }
        else
            System.out.println("Aluno não encontrado!");

    }

    //LETRA F
    public void exibir(String matricula){
        Aluno alun0 = new Aluno (matricula);
        LDENode<Aluno> aluno = lista.consultar(alun0);
        if(aluno != null){
            System.out.println("Media Final: " + aluno.getInfo().getMedia_f() +
                    "\nFaltas: " + aluno.getInfo().getFaltas());
        }
        else
            System.out.println("Lista vazia");
    }

    //LETRA G
    public void remove(String matricula){
        Aluno aluno = new Aluno (matricula);
        lista.remove(aluno);
    }
}
