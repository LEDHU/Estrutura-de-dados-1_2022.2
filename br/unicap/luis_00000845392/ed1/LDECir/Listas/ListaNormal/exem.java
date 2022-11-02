package br.unicap.luis_00000845392.ed1.LDECir.Listas.ListaNormal;

public class exem {
    public static void main(String[] args) {
        LDECirGenerica<Integer> ldeCirGenerica = new LDECirGenerica<>();

        ldeCirGenerica.insertFirst(15);
        ldeCirGenerica.insertFirst(10);
        ldeCirGenerica.insertFirst(150);
        ldeCirGenerica.insertFirst(75);
        ldeCirGenerica.insertFirst(55);
        ldeCirGenerica.insertFirst(5);

        ldeCirGenerica.exibir();

        System.out.println();

        ldeCirGenerica.remove(5);

        ldeCirGenerica.exibir();

        System.out.println();

        ldeCirGenerica.remove(15);

        ldeCirGenerica.exibir();

        System.out.println();

        ldeCirGenerica.remove(150);

        ldeCirGenerica.exibir();

        System.out.println();

        ldeCirGenerica.deleteFirst();

        ldeCirGenerica.exibir();

        System.out.println();

        ldeCirGenerica.deleteLast();

        ldeCirGenerica.exibir();





    }
}
