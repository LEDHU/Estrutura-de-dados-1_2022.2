package br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Testes.Lista3.Q4;

import br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Testes.Lista3.Q3.Q3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Q3<Object> queueQ3 = new Q3<>();


        boolean p = true;
        int op;
        int valor;

        while (p){
            menu();
            op = in.nextInt();
            switch (op){
                case 1->{
                    System.out.println("Valor: ");
                    valor = in.nextInt();
                    queueQ3.push(valor);
                }
                case 2->
                    System.out.println(queueQ3.pop());
                case 3->{
                    System.out.println("Valor: ");
                    valor = in.nextInt();
                    queueQ3.inject(valor);
                }
                case 4 ->
                    System.out.println(queueQ3.eject());
                case 5 ->
                    System.out.println(queueQ3.isEmpty());
                case 6 ->
                    System.out.println(queueQ3.isFull());
                case 0 ->
                    p = false;
            }
        }


    }
    public static void menu(){
        System.out.println("1 - Push");
        System.out.println("2 - Pop");
        System.out.println("3 - Inject");
        System.out.println("4 - Eject");
        System.out.println("5 - isEmpty");
        System.out.println("6 - isFull");
        System.out.println("0 - Break");
    }
}
