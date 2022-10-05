package QUA_LISTA_LSE.Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        LSENumero lista = new LSENumero();
        LSENumero lista3;

        int op = 1;
        int escolha;

        Numero numero;

        while(op != 0){
            Menu();
            op = teclado.nextInt();
            switch (op){
                case 1 -> {
                    System.out.println("Informe o numero: ");
                    escolha = teclado.nextInt();
                    int esc = 1;

                    numero = new Numero(escolha);
                    lista.insere(numero, esc);
                }
                case 2 -> {
                    System.out.println("Informe o numero: ");
                    escolha = teclado.nextInt();
                    int esc = 2;

                    numero = new Numero(escolha);
                    lista.insere(numero, esc);
                }
                case 3 ->
                    lista.exibir();

                case 4 -> {
                    lista3 = lista.criaLista3();
                    lista.exibirALista3(lista3);
                }
                case 0 ->
                    System.out.println("Bye bye");
                default ->
                    System.out.println("Opção invalida");
            }
        }




    }
    public static void Menu() {
        System.out.println("\n1 - Cadastrar novo produto na lista 1");
        System.out.println("2 - Cadastrar novo produto na lista 2");
        System.out.println("3 - Exibir listas");
        System.out.println("4 - Criar lista 3");
        System.out.println("0 - Encerrar programa");
    }
}
