package br.unicap.luis_00000845392.ed1.Tests.Tentativa_LDE;

public class Main {
    public static void main(String[] args) {
        LDETentativa<Integer> tentativa = new LDETentativa<>();

        tentativa.addFirst(15);
        tentativa.addFirst(20);
        tentativa.addFirst(10);
        tentativa.addFirst(0);
        tentativa.addFirst(40);
        tentativa.exibireral();
        tentativa.addLast(15);
        tentativa.addLast(20);
        tentativa.addLast(10);
        tentativa.addLast(0);
        tentativa.addLast(40);
        System.out.println();
        tentativa.exibireral();

    }
}
