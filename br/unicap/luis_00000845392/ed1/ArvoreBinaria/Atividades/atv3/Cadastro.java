package br.unicap.luis_00000845392.ed1.ArvoreBinaria.Atividades.atv3;

import java.util.Scanner;

public class Cadastro {
    private final BinaryTree<Produto> binaryTree;

    public Cadastro(){
        binaryTree = new BinaryTree<>();
    }

    //Letra A
    public void add(Produto p){
        binaryTree.insert(p);
    }

    //Letra B
    public void showTree(){
        binaryTree.emOrdem();
    }

    //Letra C implementado na letra 'D', 'E' e 'F'

    //Letra D
    public void changePrice(String codigo){
        Scanner in = new Scanner(System.in);
        Produto aux = new Produto(codigo);
        aux = this.binaryTree.find(aux);
        if(aux != null){
            System.out.println("Novo preço: ");
            double p = in.nextDouble();
            aux.setPreco(p);
            System.out.println("Preço alterado");
        }
        else
            System.out.println("Não cadastrado");
    }

    //Letra E
    public void changeStock(String codigo){
        Scanner in = new Scanner(System.in);
        Produto aux = new Produto(codigo);
        Produto aux1 = this.binaryTree.find(aux);

        if(aux1 != null){
            System.out.println("Novo estoque: ");
            int e = in.nextInt();
            aux1.setEstoque(e);
            System.out.println("Estoque alterado");
        }
        else
            System.out.println("Não cadastrado");
    }

    //Letra F
    public void showProduto(String codigo){
        Produto aux = new Produto(codigo);
        Produto aux1 = this.binaryTree.find(aux);
        if(aux1 != null)
            System.out.println(aux1);
        else
            System.out.println("Não cadastrado");
    }

    //Letra G
    public void remove(String codigo){
        Produto aux = new Produto(codigo);
        aux = this.binaryTree.find(aux);
        if(aux != null)
            binaryTree.remove(aux);
        else
            System.out.println("Nao cadastrado");
    }

}
