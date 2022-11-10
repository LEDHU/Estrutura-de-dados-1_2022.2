package br.unicap.luis_00000845392.ed1.LDECir.Atividades.lista2.q2;

import br.unicap.luis_00000845392.ed1.LDECir.Atividades.lista2.q1.Q1;

public class test {
    public static void main(String[] args) {
        Q2<Integer> lista1 = new Q2<>();
        Q2<Integer> lista2 = new Q2<>();

        lista1.insertFirst(50);
        lista1.insertFirst(80);
        lista1.insertFirst(25);
        lista1.insertFirst(500);
        lista1.insertFirst(100);

        lista1.exibir();
        System.out.println();
        lista2.exibir();

        System.out.println("\n");

        lista2 = lista1.dividir();

        lista1.exibir();
        System.out.println();
        lista2.exibir();

    }
}
