package br.unicap.luis_00000845392.ed1.LSE.LSEComDescritor.Aula_2_LSEOrdenada;

import java.util.Scanner;

public class as {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int ano;
        ano = in.nextInt();
        int gap;
        gap = in.nextInt();
        int cont = 0;

        if(gap > 0){
            while(cont < 3){
                ano = ano + gap;
                System.out.print(ano + " ");
                cont++;
            }
        }
        else {
            while(cont < 3){
                System.out.print(ano + " ");
                cont++;
            }
        }
    }
}
