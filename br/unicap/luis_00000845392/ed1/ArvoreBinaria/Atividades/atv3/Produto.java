package br.unicap.luis_00000845392.ed1.ArvoreBinaria.Atividades.atv3;

public class Produto implements Comparable<Produto> {
    private final String codigo;
    private String descricao;
    private String fornecedor;
    private int estoque;
    private double preco;

    public Produto(String codigo) {
        this.codigo = codigo;
    }

    public Produto(String codigo, String descricao, String fornecedor, int estoque, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.estoque = estoque;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto o) {
        return this.getCodigo().compareTo(o.getCodigo());
    }

    @Override
    public String toString() {
        return "Código = " + this.getCodigo() + "\n"  +
                "Descrição = " + this.getDescricao() + "\n" +
                "Fornecedor = " + this.getFornecedor() + "\n" +
                "Estoque = " + this.getEstoque() + "\n" +
                "Preço = " + this.getPreco() + "\n\n";
    }
}
