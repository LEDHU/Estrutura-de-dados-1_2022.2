package Java.Main.br.unicap.luis_00000845392.ed1.Atividades.TER_LISTA_LSE;

import java.util.Scanner;

public class TestaListaEncadeada {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        LSEAluno turma = new LSEAluno();
        LSEAluno copia;
        int op = 1;
        Aluno al;
        String nome, matr;
        while(op != 0) {
            exibeMenu();
            op = in.nextInt(); in.nextLine();
            switch (op) {
                case 1 -> {
                    System.out.print("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    System.out.print("Informe o nome do aluno: ");
                    nome = in.nextLine();
                    al = new Aluno(matr, nome);
                    turma.inserirAluno(al);
                    System.out.println("Inserção efetuada!");
                }
                case 2 -> {
                    System.out.print("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    System.out.print("Informe o nome do aluno: ");
                    nome = in.nextLine();
                    al = new Aluno(matr, nome);
                    turma.inserirAlunoFinal(al);
                    System.out.println("Inserção efetuada!");
                }
                case 3 ->
                        turma.exibir();
                case 4 -> {
                    System.out.print("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.exibirAluno(matr);
                }
                case 5 -> {
                    System.out.print("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.alterarMedia(matr);
                }
                case 6 -> {
                    System.out.print("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.alterarFalta(matr);
                }
                case 7 -> {
                    System.out.print("Informe a matrícula do aluno: ");
                    matr = in.nextLine();
                    turma.remover(matr);
                }
                case 8 -> {
                    copia = turma.xeroCopia();
                    copia.exibir();
                    System.out.println("Lista copiada!!");

                }
                case 0 -> System.out.println("Bye bye");
                default -> System.out.println("Opção inválida");
            }
        }
    }
    public static void exibeMenu() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar novo aluno no início da lista");
        System.out.println("2 - Cadastrar novo aluno no final da lista");
        System.out.println("3 - Exibir alunos da turma");
        System.out.println("4 - Exibir os dados de um aluno");
        System.out.println("5 - Alterar a média de um aluno");
        System.out.println("6 - Alterar a quantidade de faltas de um aluno");
        System.out.println("7 - Remover um aluno");
        System.out.println("8 - Fazer copia da lista");
        System.out.println("0 - Encerrar programa");
        System.out.print("Digite a opção desejada: ");
    }
}
