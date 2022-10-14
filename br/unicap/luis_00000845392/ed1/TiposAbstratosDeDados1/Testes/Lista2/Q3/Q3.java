package br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Testes.Lista2.Q3;

import br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Queues.Queue;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Queue<String> fila = new Queue<String>();
        int opcao = 1;

        while(opcao != 0) {
            menu();
            opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.println("Nome do projeto: ");
                fila.enqueue(teclado.next());
            }
            else if(opcao == 2){
                fila.dequeue();
                System.out.println("Avaliacao do projeto concluido");
            }
            else if(opcao == 3)
                fila.exibirFila();
            else if(opcao == 0)
                System.out.println("Bye");

            else
                System.out.println("Opcao invalida");
        }
    }
    public static void menu(){
        System.out.println("1 - Adicionar novo projeto");
        System.out.println("2 - Projeto avaliado");
        System.out.println("3 - Mostrar os projetos");
        System.out.println("0 - sair");
    }
}
