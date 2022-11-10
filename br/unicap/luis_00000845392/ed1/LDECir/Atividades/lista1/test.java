package br.unicap.luis_00000845392.ed1.LDECir.Atividades.lista1;

import br.unicap.luis_00000845392.ed1.LDECir.Listas.ListaOrdenadaSRepetidos.LDECOrdenadoSRepDecres;

public class test {
    public static void main(String[] args) {
        LDECOrdenadoSRepDecres<Integer> ldecOrdenadoSRepDecres = new LDECOrdenadoSRepDecres<>();

        ldecOrdenadoSRepDecres.inserir(20);
        ldecOrdenadoSRepDecres.inserir(10);
        ldecOrdenadoSRepDecres.inserir(30);
        ldecOrdenadoSRepDecres.inserir(50);
        ldecOrdenadoSRepDecres.inserir(40);
        ldecOrdenadoSRepDecres.inserir(20);
        ldecOrdenadoSRepDecres.inserir(50);
        ldecOrdenadoSRepDecres.inserir(10);

        ldecOrdenadoSRepDecres.exibirTodos();
        System.out.println();

        ldecOrdenadoSRepDecres.remover(50);

        ldecOrdenadoSRepDecres.exibirTodos();
        System.out.println();

        ldecOrdenadoSRepDecres.remover(10);

        ldecOrdenadoSRepDecres.exibirTodos();
        System.out.println();

        ldecOrdenadoSRepDecres.remover(30);

        ldecOrdenadoSRepDecres.exibirTodos();


    }
}
