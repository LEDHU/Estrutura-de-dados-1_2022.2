package br.unicap.luis_00000845392.ed1.LDE.Atividades.Lista1.Q1;

import br.unicap.luis_00000845392.ed1.LDE.Listas.ListaNormal.LDELista;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pessoa pessoa;
        LDELista<Pessoa> lista = new LDELista<Pessoa>();
        int esc;
        String nome;
        String rg;
        int cancelado = 0;

        while(true) {
            menu();
            esc = in.nextInt();
            if (esc == 1) {
                System.out.println("Nome: ");
                nome = in.nextLine();
                System.out.println("RG: ");
                rg = in.next();
                pessoa = new Pessoa(nome, rg);
                lista.addLast(pessoa);
                cancelado = 1;
            } else if (esc == 2) {
                if (cancelado == 1) {
                    lista.removerFinal();
                    System.out.println("Cancelado");
                    cancelado = 0;
                }
                else
                    System.out.println("Nao cancelado");
            } else if (esc == 3)
                lista.exibirAoContrario();

            else if (esc == 4) {
                System.out.println("RG: ");
                rg = in.next();
                pessoa = new Pessoa(rg);
                if (lista.buscar(pessoa) != null)
                    System.out.println("Esta no predio");
                else
                    System.out.println("Nao esta o predio");

            } else if (esc == 5)
                System.out.println("Nº de pessoas: " + lista.numero());
            else if (esc == 6) {
                System.out.println("RG: ");
                pessoa = new Pessoa(in.next());
                if (lista.remove(pessoa))
                    System.out.println("Removido");
            } else if (esc == 0)
                break;
        }
    }
    public static void menu(){
        System.out.println("1 - cadastrar");
        System.out.println("2 - cancelar");
        System.out.println("3 - exibir");
        System.out.println("4 - verificar");
        System.out.println("5 - numero de pessoas");
        System.out.println("6 - remover");
        System.out.println("0 - sair");
    }
}
