package br.unicap.luis_00000845392.ed1.ArvoreBinaria.Atividades.atv3;

public class BinaryTree <T extends Comparable<T>>{
    private NodeTree<T> root;

    public boolean isEmpyt(){
        return this.root == null;
    }

    public void insert(T valor){
        if(this.isEmpyt()) {
            this.root = new NodeTree<>(valor);
            System.out.println("Adicionado");
        }
        else
            this.root.insertNode(valor);
    }

    public void emOrdem(){
        if(this.isEmpyt())
            System.out.println("Arvore vazia");
        else
            percorrerEmOrdem(this.root);
    }

    private void percorrerEmOrdem(NodeTree<T> r){
        if(r != null){
            percorrerEmOrdem(r.getLeft());
            System.out.println(r.getInfo());
            percorrerEmOrdem(r.getRight());
        }
    }

    public T find(T valor){
        if(this.isEmpyt())
            return null;
        else
            return this.root.findNode(valor);
    }

    public void remove(T valor){
        if(this.isEmpyt())
            System.out.println("Arvore vazia");
        else
            this.root = this.removeNode(this.root, valor);
    }

    private NodeTree<T> removeNode (NodeTree<T> r, T value) {
        if (r != null) {
            if (value.compareTo(r.getInfo()) == 0) {
                NodeTree<T> pai, filho;
                if (r.getLeft() == null && r.getRight() == null) {
                    r = null;
                } else if (r.getLeft() == null) {
                    r = r.getRight();
                }
                else if (r.getRight() == null) {
                    r = r.getLeft();
                }
                else {
                    pai = r;
                    filho = pai.getLeft();
                    while (filho.getRight() != null){
                        pai = filho;
                        filho = filho.getRight();
                    }
                    if(filho.getLeft() == null && filho.getRight() == null){
                        pai.setLeft(null);
                        r.setInfo(filho.getInfo());
                    }
                    else {
                        pai.setRight(filho.getLeft());
                        r.setInfo(filho.getInfo());
                    }
                }
            }
            else if (value.compareTo( r.getInfo()) < 0) {
                r.setLeft(removeNode (r.getLeft(), value));
            }
            else {
                r.setRight(removeNode (r.getRight(), value));
            }
        }
        return r;
    }

}

