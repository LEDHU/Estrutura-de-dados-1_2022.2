package Lista_Feira_Teste;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        LSEProdutos feira = new LSEProdutos();

        int escolha;

        String nome;
        int quan;
        double valor;

        Produtos prods;

        do{
            Menu();
            escolha = teclado.nextInt();
            switch(escolha){
                case 1:
                    System.out.println("Nome: ");
                    nome = teclado.next();
                    System.out.println("Quantidade: ");
                    quan = teclado.nextInt();
                    System.out.println("Valor: ");
                    valor = teclado.nextDouble();

                    prods = new Produtos(nome, quan, valor);
                    feira.inserirFinal(prods);
                    break;
                case 2:
                    feira.removerInicio();
                    break;
                case 3:
                    System.out.println("Nome: ");
                    nome = teclado.next();
                    System.out.println("Quantidade: ");
                    quan = teclado.nextInt();
                    System.out.println("Valor: ");
                    valor = teclado.nextDouble();
                    prods = new Produtos(nome, quan, valor);
                    feira.inserirFinal(prods);
                case 4:
                    feira.removerFinal();
                    break;
                case 5:
                    feira.exibir();
                    break;
                case 0:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        } while(escolha != 0);

    }

    public static void Menu(){
        System.out.println("1 - Inserir um novo produto no início da lista");
        System.out.println("2 - Remover o primeiro produto da lista");
        System.out.println("3 - Inserir um novo produto no final da lista");
        System.out.println("4 - Remover o último produto da lista");
        System.out.println("5 - Exibir todos os produtos da lista");
        System.out.println("0 - Sair do programa");
    }
}
