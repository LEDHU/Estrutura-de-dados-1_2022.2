package br.unicap.luis_00000845392.ed1.ArvoreBinaria.Atividades.atv3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Scanner in = new Scanner(System.in);

        Produto a = new Produto("50", "arroz", "super", 2, 12);
        Produto b = new Produto("30", "arroz", "super", 2, 12);
        Produto c = new Produto("70", "arroz", "super", 2, 12);
        Produto d = new Produto("20", "bola", "arco", 3, 18);
        Produto e = new Produto("65", "arroz", "super", 2, 12);
        Produto f = new Produto("75", "bola", "arco", 3, 18);
        Produto g = new Produto("25", "bola", "arco", 3, 18);
        Produto h = new Produto("80", "arroz", "super", 2, 12);
        Produto i = new Produto("15", "bola", "arco", 3, 18);
        Produto j = new Produto("20", "bola", "arco", 3, 18);
        Produto k = new Produto("72", "bola", "arco", 3, 18);
        Produto l = new Produto("74", "bola", "arco", 3, 18);
        Produto m = new Produto("76", "bola", "arco", 3, 18);
        Produto n = new Produto("12", "bola", "arco", 3, 18);
        Produto o = new Produto("10", "bola", "arco", 3, 18);

        //Letra A
        cadastro.add(a);
        cadastro.add(b);
        cadastro.add(c);
        cadastro.add(d);
        cadastro.add(e);
        cadastro.add(f);
        cadastro.add(g);
        cadastro.add(h);
        cadastro.add(i);
        cadastro.add(j);
        cadastro.add(k);
        cadastro.add(l);
        cadastro.add(m);
        cadastro.add(n);
        cadastro.add(o);

        /*//Letra B
        cadastro.showTree();

        //Letra D
        cadastro.showProduto("65");
        cadastro.changePrice("65");
        // produto e de valor 12, muda para valor 15
        cadastro.showProduto("65");

        //Letra E
        cadastro.showProduto("20");
        cadastro.changeStock("20");
        // produto d de valor 3, muda para valor 5
        cadastro.showProduto("20");*/

        cadastro.showTree();

        cadastro.remove("25");
        //cadastro.remove("50");
        cadastro.showTree();

    }
}
