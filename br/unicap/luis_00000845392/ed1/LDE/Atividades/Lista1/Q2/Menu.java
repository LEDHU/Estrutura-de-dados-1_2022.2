package br.unicap.luis_00000845392.ed1.LDE.Atividades.Lista1.Q2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        LDEOrdeSRepDecres<Integer> ldeOrdeSRepDecres = new LDEOrdeSRepDecres<>();
        Scanner in = new Scanner(System.in);
        int esc;

        while(true){
            menu();
            esc = in.nextInt();
            if(esc == 1)
                ldeOrdeSRepDecres.inserir(in.nextInt());

            else if(esc == 2)
                ldeOrdeSRepDecres.remover(in.nextInt());

            else if(esc == 3)
                ldeOrdeSRepDecres.exibirDecrescente();

            else if(esc == 4)
                ldeOrdeSRepDecres.exibirCrescente();

            else if(esc == 5){
                if(ldeOrdeSRepDecres.naLista(in.nextInt()))
                    System.out.println("Esta na lista");
                else
                    System.out.println("Nao esta na lista");
            }
            else if(esc == 0)
                break;
        }

    }
    public static void menu(){
        System.out.println("1 - Inserir");
        System.out.println("2 - Deletar");
        System.out.println("3 - Exibir decrescente");
        System.out.println("4 - Exibir crescente");
        System.out.println("5 - Na lista?");
        System.out.println("0 - Sair");
    }
}
