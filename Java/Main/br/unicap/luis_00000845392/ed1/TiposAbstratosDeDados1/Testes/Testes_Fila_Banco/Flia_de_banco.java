package Java.Main.br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Testes.Testes_Fila_Banco;

import Java.Main.br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Queues.Queue;

import java.util.Scanner;

public class Flia_de_banco{
    public static <T> void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Queue<T> filaNormal = new Queue<>();
        Queue<T> filaPrioridade = new Queue<>();
        Queue<T> filaMaisPrioridade = new Queue<>();

        Number number;

        int numero;
        int i = 1;
        int aux = 0;

        while(i != 0){
            menu();
            i = teclado.nextInt();
            switch (i){
                case 1 ->{
                    System.out.println("Number: ");
                    numero = teclado.nextInt();
                    number = numero;
                    if(numero < 60)
                        filaNormal.enqueue((T)number);
                    else if(numero < 80)
                        filaPrioridade.enqueue((T)  number);
                    else
                        filaMaisPrioridade.enqueue((T) number);
                }
                case 2 ->{
                    while (true){
                        if (aux < 4){
                            if (aux == 0 || aux == 2){
                                if (!filaMaisPrioridade.isEmpty()){
                                    filaMaisPrioridade.dequeue();
                                    aux++;
                                    break;
                                }else
                                    aux++;
                            }
                            if (aux == 1){
                                if (!filaPrioridade.isEmpty()){
                                    filaPrioridade.dequeue();
                                    aux++;
                                    break;
                                }else
                                    aux++;
                            }
                            if (aux == 3){
                                if (!filaNormal.isEmpty()){
                                    filaNormal.dequeue();
                                    aux = 0;
                                    break;
                                }else
                                    aux = 0;
                            }
                            if (filaMaisPrioridade.isEmpty() && filaPrioridade.isEmpty() && filaNormal.isEmpty())
                                break;
                        }

                    }
                }
                case 3 ->{
                    System.out.println("Fila normal");
                    filaNormal.exibirFila();
                    System.out.println("\nFila Prioridade");
                    filaPrioridade.exibirFila();
                    System.out.println("\nFila Mais Prioridade");
                    filaMaisPrioridade.exibirFila();
                }
            }

        }
    }
    public static void menu(){
        System.out.println("1 - Add");
        System.out.println("2 - Remove");
        System.out.println("3 - Visualizar");
        System.out.println("0 - Sair");

    }
}
