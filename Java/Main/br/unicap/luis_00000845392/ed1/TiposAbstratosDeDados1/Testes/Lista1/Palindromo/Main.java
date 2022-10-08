package Java.Main.br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Testes.Palindromo;

import Java.Main.br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Stacks.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Stack<Character> pilha = new Stack<>();
        String palavra;
        System.out.println("Palavra: ");
        palavra = teclado.next();
        int i;
        char c;

        int tam = palavra.length();

        for(i = 0; i < tam; i++){
            c = palavra.charAt(i);
            if(Character.isLetter(c) && !Character.isSpaceChar(c)){
                pilha.push(c);
            }
        }

        i = 0;
        while(i < tam){
            if(i <= tam - 1){
                if(pilha.top().equals(palavra.charAt(i))){
                    pilha.pop();
                }
            }
            else
                break;
            i++;

        }

        if(pilha.isEmpty())
            System.out.println("É palindromo");
        else
            System.out.println("Não é palindromo");

    }
}
