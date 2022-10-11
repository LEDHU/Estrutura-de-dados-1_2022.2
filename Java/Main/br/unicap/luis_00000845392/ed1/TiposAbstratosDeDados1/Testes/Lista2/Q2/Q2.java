package Java.Main.br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Testes.Lista2.Q2;

import Java.Main.br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Queues.Queue;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Queue<Lanche> fila = new Queue<Lanche>();
        Lanche pedido;
        int opcao = 1;
        int qtd;
        String nome;

        while(opcao != 0){
            menu();
            opcao = teclado.nextInt();

            if(opcao == 1){
                System.out.println("Nome do pedido: ");
                nome = teclado.next();
                System.out.println("Quantidade: ");
                qtd = teclado.nextInt();
                pedido = new Lanche(nome, qtd);
                fila.enqueue(pedido);
            }
            else if(opcao == 2){
                if(!fila.isEmpty()) {
                    fila.dequeue();
                    System.out.println("Pedido entregue");
                }
                else
                    System.out.println("Nao ha pedidos em espera");
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
        System.out.println("1 - Adicionar novo pedido");
        System.out.println("2 - Entregar pedido ao cliente");
        System.out.println("3 - Mostrar os pedidos");
        System.out.println("0 - sair");
    }
}
