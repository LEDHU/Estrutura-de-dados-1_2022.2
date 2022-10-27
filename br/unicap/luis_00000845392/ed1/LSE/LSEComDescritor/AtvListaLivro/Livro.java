package br.unicap.luis_00000845392.ed1.LSE.LSEComDescritor.AtvListaLivro;

public class Livro implements Comparable <Livro>{
    private final String codigo;
    private String titulo;
    private String autor;
    private double preco;
    private int estoque;

    public Livro(String codigo, String titulo, String autor, double preco, int estoque){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.estoque = estoque;
    }

    public Livro(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Livro {" +
                "\nCodigo = '" + getCodigo() + '\'' +
                ",\nTitulo = '" + getTitulo() + '\'' +
                ",\nAutor = '" + getAutor() + '\'' +
                ",\nPreco = " + getPreco() +
                ",\nEstoque = " + getEstoque() +
                " }";
    }

    @Override
    public int compareTo (Livro livro) {
        return this.getCodigo().compareTo(livro.getCodigo());
    }
}
