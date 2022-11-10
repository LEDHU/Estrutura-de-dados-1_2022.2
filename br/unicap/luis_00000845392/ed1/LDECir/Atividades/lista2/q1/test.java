package br.unicap.luis_00000845392.ed1.LDECir.Atividades.lista2.q1;

public class test {
    public static void main(String[] args) {
        Q1<Integer> lista1 = new Q1<>();
        Q1<Integer> lista2 = new Q1<>();

        lista1.insertLast(50);
        lista1.insertLast(80);
        lista2.insertLast(30);
        lista2.insertLast(20);
        lista2.insertLast(45);
        lista1.insertLast(25);


        lista1.concatenar(lista2);

        lista1.exibir();
        System.out.println();
        lista2.exibir();
    }
}
