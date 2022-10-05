package Lista_Feira_Teste;

public class Produtos {
    private String nome;
    private double valor;
    private int quantidade;

    public Produtos (String n, int q, double v){
        this.nome = n;
        this.quantidade = q;
        this.valor = v;
    }

    public int compareTo (Produtos prods){
        int result;
        result = this.getNome().compareTo(prods.getNome());
        return result;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String toString (){
        return "Nome: " + this.nome + "\n" +
                "Quantidade: " + this.quantidade + "\n" +
                "Valor: " + this.valor + "\n" +
                "-------------------";
    }


}
