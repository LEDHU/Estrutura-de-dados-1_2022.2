package br.unicap.luis_00000845392.ed1.LDECir.Atividades.atividadeNota;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();

        Aluno aluno0 = new Aluno("Edu", "M0", 0, 7.5);
        Aluno aluno1 = new Aluno("Edua", "M1", 0, 7.5);
        Aluno aluno2 = new Aluno("Eduar", "M2", 0, 7.5);
        Aluno aluno3 = new Aluno("Eduard", "M3", 0, 7.5);


        cadastro.inserir(aluno0);
        cadastro.inserir(aluno1);
        cadastro.inserir(aluno2);
        cadastro.inserir(aluno3);

        cadastro.listar();
        System.out.println();

        cadastro.mediaFinal("M1");
        cadastro.exibir("M1");

        cadastro.falta("M2");

        cadastro.listar();
        System.out.println();

        cadastro.exibir("M1");
        System.out.println();

        cadastro.exibir("M2");
        System.out.println();

        cadastro.remove("M3");
        cadastro.listar();


    }
}
