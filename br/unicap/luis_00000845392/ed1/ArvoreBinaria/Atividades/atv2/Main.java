package br.unicap.luis_00000845392.ed1.ArvoreBinaria.Atividades.atv2;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.insertSemRecursividade(50);
        tree.insertSemRecursividade(100);
        tree.insertSemRecursividade(30);
        tree.insertSemRecursividade(20);
        tree.insertSemRecursividade(1500);
        tree.insertSemRecursividade(5);
        tree.insertSemRecursividade(1250);
        tree.insertSemRecursividade(35);
        tree.insertSemRecursividade(7);
        tree.insertSemRecursividade(35*2);
        tree.insertSemRecursividade(200);


        System.out.println("letra A e B");
        tree.enderecoMenor();
        System.out.println();
        System.out.println("letra C e D");
        tree.enderecoMaior();
        System.out.println();

        System.out.println("letra e " + tree.qtdDeNos());
        System.out.println();
        System.out.println("letra f " + tree.qtdDeFolhas());
        System.out.println();
        System.out.println("letra g " + tree.qtdDeNaoFolhas());

    }
}
