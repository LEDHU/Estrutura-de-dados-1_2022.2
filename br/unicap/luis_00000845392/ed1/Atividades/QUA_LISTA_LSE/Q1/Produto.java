package br.unicap.luis_00000845392.ed1.Atividades.QUA_LISTA_LSE.Q1;

public class Produto {
    //ATRIBUTOS
    private String codigo;
    private String descricao;
    private double preco;
    private int estoque;

    //GETTERS
    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    //SETTERS (sem codigo)
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    //CONSTRUDOR
    public Produto (String c){
        this.codigo = c;
    }
    public Produto (String c, String d){
        this.codigo = c;
        this.descricao = d;
    }
    public Produto (String c, String d, double v, int e){
        this.codigo = c;
        this.descricao = d;
        this.preco = v;
        this.estoque = e;
    }


    public int compareTo (Produto al) {
        int result;
        result = this.getCodigo().compareTo(al.getCodigo());
        return result;
    }
    public String toString () {
        return "O código é: " + this.codigo + "\n" +
                "A descrição é: " + this.descricao + "\n" +
                "O preço é: " + this.preco + "\n" +
                "O estoque é: " + this.estoque + "\n";
    }

}
