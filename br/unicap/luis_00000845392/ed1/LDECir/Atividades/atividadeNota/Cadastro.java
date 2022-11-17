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
        Aluno aluno1 = new Aluno(aluno.getMatricula());
        LDENode<Aluno> aux = this.lista.consultar(aluno1);
        if(aux == null)
            lista.insertLast(aluno);
        else
            System.out.println("Aluno ja cadastrado");
    }

    //Letra B
    public void listar(){
        this.lista.listar();
    }

    //Letra C
    //funcionalidade consultar/buscar

    //LETRA D
    public void alterarMediaFinal(String matricula){
        Scanner in = new Scanner(System.in);
        Aluno aluno = new Aluno(matricula);
        LDENode<Aluno> aux = this.lista.consultar(aluno);
        double media;

        if(aux != null){
            System.out.println("Nova media: ");
            media = in.nextDouble();
            aluno = aux.getInfo();
            if(media > 10){
                media = 10;
                System.out.println("A media não pode ser maior que 10. Aluno ira ficar com 10 na media final");
            }
            else if(media < 0){
                media = 0;
                System.out.println("A media não pode ser menor que 0. Aluno ira ficar com 0 na media final");
            }
            aluno.setMedia_f(media);
            System.out.println("Media alterada");
        }
        else
            System.out.println("Aluno não encontrado!");
    }

    //Letra E
    public void alterarFalta(String matricula){
        Scanner in = new Scanner(System.in);
        Aluno aluno = new Aluno (matricula);
        LDENode<Aluno> aux = this.lista.consultar(aluno);
        int faltas;
        int auxiliar;

        if (aux != null) {
            aluno = aux.getInfo();

            System.out.println("Acrescentar(falta positiva) ou decrementar(falta negativa): ");
            faltas = in.nextInt();

            auxiliar = aluno.getFaltas() + faltas;

            if(aluno.getFaltas() + faltas < 0){
                auxiliar = 0;
                System.out.println("Aluno não pode ficar com faltas negativas. Faltas zeradas");
            }

            aluno.setFaltas(auxiliar);
            System.out.println("Falta alterada");
        }
        else
            System.out.println("Aluno não encontrado!");

    }

    //LETRA F
    public void exibir(String matricula){
        Aluno alun0 = new Aluno (matricula);
        LDENode<Aluno> aluno = this.lista.consultar(alun0);
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
        this.lista.remove(aluno);
    }

    //Metodos extras
    public boolean verificarMatricula(String matricula){
        Aluno aluno = new Aluno(matricula);
        return lista.consultar(aluno) == null;
    }
}
