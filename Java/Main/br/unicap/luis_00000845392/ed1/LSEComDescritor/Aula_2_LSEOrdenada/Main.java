package Java.Main.br.unicap.luis_00000845392.ed1.LSEComDescritor.Aula_2_LSEOrdenada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        LSEDescritor<Integer> lista1 = new LSEDescritor();
        LSEDescritor<Double> lista2 = new LSEDescritor();

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
                    System.out.println("final Qual o valor lista1");
                    valor = teclado.nextInt();
                    lista1.inserirNoFinal(valor);
                }
                case 4 ->{
                    System.out.println("final Qual o valor lista2");
                    valorD = teclado.nextDouble();
                    lista2.inserirNoFinal(valorD);
                }

                case 5->{
                    System.out.println("----LISTA1----");
                    lista1.exibirGeral();
                    System.out.println("----LISTA2----");
                    lista2.exibirGeral();

                }
                case 6 ->
                        lista1.removerInicio();
                case 7 ->
                        lista2.removerInicio();
                case 8 ->
                        lista1.removerFinal();
                case 9 ->
                        lista2.removerFinal();
                case 10 ->{
                    System.out.println("Qual o valor");
                    lista1.inserirOrdenado(teclado.nextInt());
                }



            }
        }
    }
    public static void menu(){
        System.out.println("1 - Adicionar na primeira lista no inicio");
        System.out.println("2 - Adicionar na segunda lista no inicio");
        System.out.println("3 - Adicionar na primeira lista no final");
        System.out.println("4 - Adicionar na segunda lista no final");
        System.out.println("5 - Exibir todas as listas");
        System.out.println("6 - Remover na primeira lista inicio");
        System.out.println("7 - Remover na segunda lista inicio");
        System.out.println("8 - Remover na primeira lista final");
        System.out.println("9 - Remover na segunda lista final");
        System.out.println("10 - Adicionar na lista ordenada em ordem crescente e sem repetidos");

    }
}
