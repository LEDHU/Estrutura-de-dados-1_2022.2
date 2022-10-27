package br.unicap.luis_00000845392.ed1.LSE.Atividades.QUA_LISTA_LSE.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        LSEProduto feira = new LSEProduto();
        int op = 1;
        Produto produtinho;
        String descricao, codigo;
        double valor;
        int estoque;
        while(op != 0) {
            Menu();
            op = teclado.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.print("Informe a código do produto: ");
                    codigo = teclado.next();
                    System.out.print("Informe a descrição do produto: ");
                    descricao = teclado.next();
                    System.out.println("Informe o valor do produto: ");
                    valor = teclado.nextDouble();
                    System.out.println("Informe o estoque do produto: ");
                    estoque = teclado.nextInt();

                    produtinho = new Produto(codigo, descricao, valor, estoque);
                    feira.inserirProduto(produtinho);
                    System.out.println("Inserção efetuada!");
                }
                case 2 -> {
                    System.out.print("Informe a código do produto: ");
                    codigo = teclado.next();
                    System.out.print("Informe a descrição do produto: ");
                    descricao = teclado.next();
                    System.out.println("Informe o valor do produto: ");
                    valor = teclado.nextDouble();
                    System.out.println("Informe o estoque do produto: ");
                    estoque = teclado.nextInt();

                    produtinho = new Produto(codigo, descricao, valor, estoque);
                    feira.inserirProdutoFinal(produtinho);
                    System.out.println("Inserção efetuada!");
                }
                case 3 ->
                    feira.exibir();
                case 4 -> {
                    feira.removerPrimeiro();
                    System.out.println("Remoção efetuada!");
                }
                case 5 -> {
                    feira.removerUltimo();
                    System.out.println("Remoção efetuada!");
                }
                case 6 -> {
                    System.out.println("Qual é o código: ");
                    codigo = teclado.next();
                    feira.exibirProduto(codigo);
                }
                case 7 -> {
                    System.out.println("Qual é o codigo: ");
                    codigo = teclado.next();
                    feira.alterarProduto(codigo);
                }
                case 8 -> {
                    System.out.println("Qual é o codigo: ");
                    codigo = teclado.next();
                    feira.remover(codigo);
                }
                case 0 -> System.out.println("Bye bye");
                default -> System.out.println("Opção inválida");
            }
        }
    }
    public static void Menu() {
        System.out.println("1 - Cadastrar novo produto no início da lista");
        System.out.println("2 - Cadastrar novo produto no final da lista");
        System.out.println("3 - Exibir todos os produtos da lista");
        System.out.println("4 - Remover o primeiro produto da lista");
        System.out.println("5 - Remover o último produto da lista");
        //tem uma funcao aqui
        System.out.println("6 - Procurar um produto específico da lista");
        System.out.println("7 - Alterar os dados (preço e/ou estoque) do produto");
        System.out.println("8 - Remover um produto específico");
        System.out.println("0 - Encerrar programa");
    }
}
