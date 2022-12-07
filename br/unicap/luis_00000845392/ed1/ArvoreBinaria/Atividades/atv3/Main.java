package br.unicap.luis_00000845392.ed1.ArvoreBinaria.Atividades.atv3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Scanner in = new Scanner(System.in);

        Produto produto;

        String cod;
        String des;
        String forn;
        double price;
        int est;

        int op = 1;

        while(op != 0){
            menu();
            op = in.nextInt();

            switch (op){
                case 1 -> {
                    System.out.println("Codigo: ");
                    cod = in.nextLine();
                    System.out.println("Descriçao: ");
                    des = in.nextLine();
                    System.out.println("Fornecedor: ");
                    forn = in.nextLine();
                    System.out.println("Preço: ");
                    price = in.nextDouble();
                    System.out.println("Estoque: ");
                    est = in.nextInt();
                    produto = new Produto(cod, des, forn, est, price);

                    cadastro.add(produto);
                }
                case 2 ->
                    cadastro.showTree();

                case 3 ->{
                    System.out.println("Codigo: ");
                    cod = in.nextLine();
                    cadastro.changePrice(cod);
                }
                case 4 ->{
                    System.out.println("Codigo: ");
                    cod = in.nextLine();
                    cadastro.changeStock(cod);
                }
                case 5 ->{
                    System.out.println("Codigo: ");
                    cod = in.nextLine();
                    cadastro.showProduto(cod);
                }
                case 6 ->{
                    System.out.println("Codigo: ");
                    cod = in.nextLine();
                    cadastro.remove(cod);
                }
                case 0 ->
                    System.out.println("Ate ED2");

                default ->
                    System.out.println("Valor incorreto");

            }
        }
    }

    public static void menu(){
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Mostrar todos os produtos");
        System.out.println("3 - Alterar preço");
        System.out.println("4 - Alterar estoque");
        System.out.println("5 - Mostrar apenas um procuto");
        System.out.println("6 - Excluir produto");
    }
}
