package br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Testes.Lista3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual o tamanho da fila? ");
        Q1<Object> filaLimitada = new Q1<>(in.nextInt());
        int op;
        int cont = 1;
        boolean p = true;

        while (p){
            menu();
            op = in.nextInt();
            switch (op) {
                case 1 -> {
                    if(filaLimitada.enqueue(cont)){
                        cont++;
                        System.out.println("Imprimindo\nSenha " + filaLimitada.head());
                    }
                    else
                        System.out.println("Cliente deverá retornar em um outro momento.");
                }
                case 2 -> {
                    if(!filaLimitada.isEmpty()) {
                        int aux = (int) filaLimitada.dequeue();
                        System.out.println("SENHA: " + aux + "\nCAIXA: 01");
                    }
                    else
                        System.out.println("Fila vazia");
                }
                case 3 ->
                    filaLimitada.exibirFila();

                case 0 ->
                    p = false;

            }
            if(filaLimitada.isEmpty())
                System.out.println("Não há clientes na fila de espera.");
        }
    }
    public static void menu(){
        System.out.println("1 - Novo cliente");
        System.out.println("2 - Cliente atendido");
        System.out.println("3 - Ver a fila");
        System.out.println("0 - Sair");
    }
}
