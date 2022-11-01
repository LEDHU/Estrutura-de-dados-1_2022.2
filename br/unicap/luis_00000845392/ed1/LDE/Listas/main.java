package br.unicap.luis_00000845392.ed1.LDE.Listas;

public class main {
    public static void main(String[] args) {
        LDEOrdenada<Integer> ldeOrdenada = new LDEOrdenada();

        ldeOrdenada.buscar(10);

        ldeOrdenada.inserir(15);
        ldeOrdenada.inserir(10);
        ldeOrdenada.inserir(150);
        ldeOrdenada.inserir(85);
        ldeOrdenada.inserir(65);


        ldeOrdenada.exibirTodos();
        ldeOrdenada.remover(10);
        ldeOrdenada.exibirTodos();
        ldeOrdenada.remover(150);
        ldeOrdenada.exibirTodos();
        ldeOrdenada.remover(65);
        ldeOrdenada.exibirTodos();
        ldeOrdenada.remover(50);
        ldeOrdenada.exibirTodos();
        ldeOrdenada.remover(15);
        ldeOrdenada.exibirTodos();
        ldeOrdenada.remover(85);
        ldeOrdenada.exibirTodos();
        ldeOrdenada.remover(15);
        ldeOrdenada.exibirTodos();

    }
}
