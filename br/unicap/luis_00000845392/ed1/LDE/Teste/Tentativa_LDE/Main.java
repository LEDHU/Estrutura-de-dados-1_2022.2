package br.unicap.luis_00000845392.ed1.LDE.Teste.Tentativa_LDE;

import br.unicap.luis_00000845392.ed1.LDE.Listas.ListaNormal.LDELista;

public class Main {
    public static void main(String[] args) {
        LDELista<Integer> tentativa = new LDELista<>();

        tentativa.addFirst(15);
        tentativa.addFirst(20);
        tentativa.addFirst(10);
        tentativa.addFirst(0);
        tentativa.addFirst(40);
        //tentativa.exibiGeral();
        //tentativa.addLast(15);
        //tentativa.addLast(20);
        //tentativa.addLast(10);
        //tentativa.addLast(0);
        //tentativa.addLast(40);
        System.out.println();
        tentativa.exibiGeral();
        /*tentativa.remove(40);
        tentativa.remove(0);
        tentativa.remove(10);
        tentativa.remove(20);*/
        //tentativa.remove(250);
        System.out.println();
        tentativa.exibiGeral();

    }
}
