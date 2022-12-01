package br.unicap.luis_00000845392.ed1.ArvoreBinaria.Atividades.Atv1;

import br.unicap.luis_00000845392.ed1.ArvoreBinaria.Tipos.SRepetidos.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> arvore = new BinaryTree<>();
        arvore.insert(10);
        arvore.insert(23);
        arvore.insert(9);
        arvore.insert(18);

        arvore.emOrdem();
        System.out.println();
        arvore.preOrdem();
        System.out.println();
        arvore.posOrdem();


    }
}
