package LSEComDescritor.AtvListaLivro;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        LSEOrdenada<Livro> prateleira = new LSEOrdenada<>();
        Livro livro;

        String codigo;
        String titulo;
        String autor;
        double preco;
        int estoque;
        int i = 1;

        while(i != 0){
            menu();
            i = teclado.nextInt();
            switch (i){
                case 1 ->{
                    //add livro
                    System.out.println("Codigo: ");
                    codigo = teclado.next();
                    System.out.println("Titulo: ");
                    titulo = teclado.next();
                    System.out.println("Autor: ");
                    autor = teclado.next();
                    System.out.println("Preço: ");
                    preco = teclado.nextDouble();
                    System.out.println("Estoque: ");
                    estoque = teclado.nextInt();

                    livro = new Livro(codigo, titulo, autor, preco, estoque);

                    prateleira.inserirOrdenado(livro);

                }
                case 2 ->{
                    //remover livro
                    System.out.println("Codigo: ");
                    prateleira.remover(teclado.next());
                }
                case 3 ->{
                    //exibir dados de um livro
                    System.out.println("Codigo: ");
                    prateleira.exibirLivro(teclado.next());
                }
                case 4 ->{
                    //alterar preco de um livro
                    System.out.println("Codigo: ");
                    codigo = teclado.next();
                    System.out.println("Novo preço: ");
                    preco = teclado.nextDouble();

                    prateleira.alterarPreco(codigo, preco);
                }
                case 5 ->{
                    //alterar estoque
                    System.out.println("Codigo: ");
                    codigo = teclado.next();
                    System.out.println("Novo estoque: ");
                    estoque = teclado.nextInt();

                    prateleira.alterarEstoque(codigo, estoque);

                }
                case 6 ->{
                    //vender um livro
                    System.out.println("Codigo: ");
                    codigo = teclado.next();

                    prateleira.vender(codigo);

                }
                case 7 ->
                    prateleira.exibirGeral();
                case 0 ->
                    System.out.println("Ate mais");
                default ->
                    System.out.println("Opcao invalida");
            }
        }

    }
    public static void menu(){
        System.out.println("1 - Cadastrar um novo livro");
        System.out.println("2 - Remover um livro do cadastro");
        System.out.println("3 - Exibir os dados de um livro");
        System.out.println("4 - Alterar o preco de um livro");
        System.out.println("5 - Atualizar o estoque de um livro");
        System.out.println("6 - Vender um livro");
        System.out.println("7 - Exibir todos os livros cadastrados");
        System.out.println("0 - Sair do programa");
    }
}
