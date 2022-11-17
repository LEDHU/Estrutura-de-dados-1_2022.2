package br.unicap.luis_00000845392.ed1.LDECir.Atividades.atividadeNota;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();

        Aluno aluno0 = new Aluno("Edu", "M0", 0, 7.5);
        Aluno aluno1 = new Aluno("Bia", "M1", 0, 7.5);
        Aluno aluno2 = new Aluno("Artu", "M2", 0, 7.5);
        Aluno aluno3 = new Aluno("Caio", "M3", 0, 7.5);


        cadastro.cadastrar(aluno0);
        cadastro.cadastrar(aluno1);
        cadastro.cadastrar(aluno2);
        cadastro.cadastrar(aluno3);
        cadastro.cadastrar(aluno0);

        cadastro.listar();
        System.out.println();

        cadastro.alterarMediaFinal("M1");
        cadastro.exibir("M1");

        cadastro.alterarFalta("M2");

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
