package Java.Main.br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Testes.NumeroBinario;

import Java.Main.br.unicap.luis_00000845392.ed1.TiposAbstratosDeDados1.Stacks.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<Integer>();

        int resto;
        int num;
        int cont = 0;

        System.out.println("Numero: ");
        num = teclado.nextInt();

        while (num != 0) {
            resto = num % 2;
            pilha.push(resto);
            num = num / 2;
            cont++;
        }

        while (cont > 0) {
            System.out.print(pilha.top());
            if(cont > 1)
                pilha.pop();
            cont--;
        }

    }
}
