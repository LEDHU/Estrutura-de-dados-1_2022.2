package Primeira_Lista_LSE;

public class Aluno implements Comparable <Aluno> {
    private String matricula;
    private String nome;
    private double media;
    private int faltas;


    public Aluno (String m, String n){
        this.matricula = m;
        this.nome = n;
    }

    public int compareTo (Aluno a1){
        int result;
        result = this.getMatricula().compareTo(a1.getMatricula());
        return result;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public String toString (){
        return "Nome: " + this.nome + "\n" +
                "Matricula: " + this.matricula + "\n" +
                "Medias: " + this.media + "\n" +
                "Faltas: " + this.faltas + "\n" +
                "-------------------";
    }

    public int compareToAluno (String a1){
        int result;
        result = this.getMatricula().compareTo(a1);
        return result;
    }
}
