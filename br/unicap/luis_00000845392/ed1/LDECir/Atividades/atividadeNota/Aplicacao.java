package br.unicap.luis_00000845392.ed1.LDECir.Atividades.atividadeNota;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Cadastro turma1 = new Cadastro();
        Cadastro turma2 = new Cadastro();
        Cadastro turma3 = new Cadastro();
        Cadastro turma4 = new Cadastro();
        Cadastro turma  = new Cadastro();

        Aluno aluno;

        String nome;
        String matricula;

        int opcaoTurmas;
        int opcaoLista;

        while(true){
            opcaoTurmas = menuTurmas();

            if(opcaoTurmas == 0)
                break;

            switch (opcaoTurmas){
                case 1 -> turma = turma1;
                case 2 -> turma = turma2;
                case 3 -> turma = turma3;
                case 4 -> turma = turma4;
            }

            opcaoLista = menuLista();

            switch (opcaoLista){
                case 1 ->{
                    System.out.println("Vamos cadastrar um novo aluno");
                    System.out.println("Nome: ");
                    nome = in.nextLine();
                    System.out.println("Matricula: ");
                    matricula = in.nextLine();
                    boolean p = verificarMatri(matricula, turma1, turma2, turma3, turma4);
                    if(p) {
                        aluno = new Aluno(nome, matricula);
                        turma.cadastrar(aluno);
                        System.out.println("Aluno cadastrado");
                    }
                    else
                        System.out.println("Matricula em uso\nAluno não cadastrado");
                }
                case 2 ->{
                    System.out.println("Listar todos os alunos\n");
                    turma.listar();
                }
                case 3 ->{
                    System.out.println("Alterar media final\n");
                    System.out.println("Matricula: ");
                    matricula = in.nextLine();
                    turma.alterarMediaFinal(matricula);
                }
                case 4 ->{
                    System.out.println("Alterar faltas");
                    System.out.println("Matricula: ");
                    matricula = in.nextLine();
                    turma.alterarFalta(matricula);
                }
                case 5 ->{
                    System.out.println("Exibir dados de um aluno");
                    System.out.println("Matricula: ");
                    matricula = in.nextLine();
                    turma.exibir(matricula);
                }
                case 6 ->{
                    System.out.println("Remover aluno");
                    System.out.println("Matricula: ");
                    matricula = in.nextLine();
                    turma.remove(matricula);
                }
            }

            switch (opcaoTurmas){
                case 1 -> turma1 = turma;
                case 2 -> turma2 = turma;
                case 3 -> turma3 = turma;
                case 4 -> turma4 = turma;
            }

        }
    }


    public static int menuTurmas(){
        Scanner in = new Scanner(System.in);

        System.out.println("|| 1 - Turma 1 ||");
        System.out.println("|| 2 - Turma 2 ||");
        System.out.println("|| 3 - Turma 3 ||");
        System.out.println("|| 4 - Turma 4 ||");
        System.out.println("|| 0 - Sair    ||");

        return in.nextInt();
    }

    public static int menuLista(){
        Scanner in = new Scanner(System.in);

        System.out.println("|| 1 - Cadastrar             ||");
        System.out.println("|| 2 - Listar                ||");
        System.out.println("|| 3 - Alterar media final   ||");
        System.out.println("|| 4 - Altarar faltas        ||");
        System.out.println("|| 5 - Exibir media e faltas ||");
        System.out.println("|| 6 - Remover               ||");

        return in.nextInt();
    }

    public static boolean verificarMatri(String matricula ,Cadastro l1, Cadastro l2, Cadastro l3, Cadastro l4){
        if (!l1.verificarMatricula(matricula))
            return false;
        if (!l2.verificarMatricula(matricula))
            return false;
        if (!l3.verificarMatricula(matricula))
            return false;
        return l4.verificarMatricula(matricula);
    }
}
