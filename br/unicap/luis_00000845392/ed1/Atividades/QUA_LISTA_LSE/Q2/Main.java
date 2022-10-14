package br.unicap.luis_00000845392.ed1.Atividades.QUA_LISTA_LSE.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    LSENumero lista = new LSENumero();
    int op = 1;
    int num;
    Numero numerozinho;

    while(op != 0) {
        Menu();
        op = teclado.nextInt();
        switch (op) {
            case 1 -> {
                System.out.print("Informe o número: ");
                num = teclado.nextInt();
                numerozinho = new Numero(num);
                lista.inserir(numerozinho);
            }
            case 2 -> {
                lista.exibir();
            }
            case 3 ->{
                System.out.print("Informe o número: ");
                num = teclado.nextInt();
                lista.remover(num);
            }
            case 0 -> System.out.println("Bye bye");
            default -> System.out.println("Opção inválida");
        }
    }
}
    public static void Menu() {
        System.out.println();
        System.out.println("1 - Inserir novo numero na lista");
        System.out.println("2 - Exibir todos os numeros da lista");
        System.out.println("3 - Remover um numero específico");
        System.out.println("0 - Encerrar programa");
    }
}
