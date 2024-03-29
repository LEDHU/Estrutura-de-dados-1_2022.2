package br.unicap.luis_00000845392.ed1.LSE.LSEComDescritor.Aula_1_ComListaGenerica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        LSEDescritor<Integer> lista1 = new LSEDescritor();
        LSEDescritor<Double> lista2 = new LSEDescritor();
        LSEDescritor<Aluno> lista3 = new LSEDescritor();
        int valor;
        double valorD;
        String mat;

        int op = 1;

        while(op != 0){
            menu();
            op = teclado.nextInt();

            switch (op){
                case 1 ->{
                    System.out.println("inicio da Qual o valor lista1");
                    valor = teclado.nextInt();
                    lista1.inserirNoInicio(valor);
                }
                case 2 ->{
                    System.out.println("inicio da Qual o valor lista2");
                    valorD = teclado.nextDouble();
                    lista2.inserirNoInicio(valorD);
                }
                case 3 ->{
                    System.out.println("inicio da Qual a matricula");
                    mat = teclado.next();
                    Aluno aluno = new Aluno(mat);
                    lista3.inserirNoInicio(aluno);
                }
                case 4 ->{
                    System.out.println("final Qual o valor lista1");
                    valor = teclado.nextInt();
                    lista1.inserirNoFinal(valor);
                }
                case 5 ->{
                    System.out.println("final Qual o valor lista2");
                    valorD = teclado.nextDouble();
                    lista2.inserirNoFinal(valorD);
                }
                case 6 ->{
                    System.out.println("final Qual a matricula");
                    mat = teclado.next();
                    Aluno aluno = new Aluno(mat);
                    lista3.inserirNoFinal(aluno);
                }
                case 7->{
                    System.out.println("----LISTA1----");
                    lista1.exibirGeral();
                    System.out.println("----LISTA2----");
                    lista2.exibirGeral();
                    System.out.println("----LISTA3----");
                    lista3.exibirGeral();
                }
                case 8 ->
                        lista1.removerInicio();
                case 9 ->
                        lista2.removerInicio();
                case 10 ->
                        lista3.removerInicio();
            }
        }
    }
    public static void menu(){
        System.out.println("1 - Adicionar na primeira lista no inicio");
        System.out.println("2 - Adicionar na segunda lista no inicio");
        System.out.println("3 - Adicionar na terceira lista no inicio");
        System.out.println("4 - Adicionar na primeira lista no final");
        System.out.println("5 - Adicionar na segunda lista no final");
        System.out.println("6 - Adicionar na terceira lista no final");
        System.out.println("7 - Exibir todas as listas");
        System.out.println("8 - Remover na primeira lista inicio");
        System.out.println("9 - Remover na segunda lista inicio");
        System.out.println("10 - Remover na terceira lista inicio");
    }

}
