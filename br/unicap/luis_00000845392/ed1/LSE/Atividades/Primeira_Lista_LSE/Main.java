package br.unicap.luis_00000845392.ed1.LSE.Atividades.Primeira_Lista_LSE;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        //LSEAluno turma = new LSEAluno();

        int op = 1;
        String nome;
        String matricula;
        int faltas;
        double media;
        Aluno a1;

        while(op != 0){
            Menu();
            op = teclado.nextInt();
            switch(op){
                case 1:
                    System.out.println("Nome: ");
                    nome = teclado.next();
                    System.out.println("Matricula: ");
                    matricula = teclado.next();
                    a1 = new Aluno(matricula, nome);
                    //turma.inserirInicio(a1);
                    break;
                case 2:
                    System.out.println("Nome: ");
                    nome = teclado.next();
                    System.out.println("Matricula: ");
                    matricula = teclado.next();
                    a1 = new Aluno(matricula, nome);
                   // turma.inserirFinal(a1);
                    break;
                case 3:
                    //turma.exibirGeral();
                    break;
                case 4:
                    System.out.println("Matricula do aluno: ");
                    matricula = teclado.next();
                    //turma.exibirALuno(matricula);
                    break;
                case 5:
                    System.out.println("Matricula do aluno: ");
                    matricula = teclado.next();
                    System.out.println("Media: ");
                    media = teclado.nextInt();
                    //turma.mediaAluno(matricula,media);
                    break;
                case 6:
                    //alterar as faltas de um aluno
                    System.out.println("Matricula do aluno: ");
                    matricula = teclado.next();
                    System.out.println("Faltas: ");
                    faltas = teclado.nextInt();
                    //turma.mediaAluno(matricula,faltas);
                    break;
                case 7:
                    //remover um aluno
                    System.out.println("Matricula do aluno: ");
                    matricula = teclado.next();
                    //turma.removerAluno(matricula);
                    break;
                case 0:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        }

    }
    public static void Menu(){
        System.out.println("1 - Inserir um novo aluno no início da lista");
        System.out.println("2 - Inserir um novo aluno no final da lista");
        System.out.println("3 - Exibir todos os alunos da lista");
        System.out.println("4 - Exibir apenas um aluno da lista");
        System.out.println("5 - Alterar a média de um aluno");
        System.out.println("6 - Alterar a quantidade de faltas de um aluno");
        System.out.println("7 - Remover um aluno da lista");
        System.out.println("0 - Sair do programa");
    }

}