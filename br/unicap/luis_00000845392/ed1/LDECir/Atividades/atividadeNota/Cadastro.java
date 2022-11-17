package br.unicap.luis_00000845392.ed1.LDECir.Atividades.atividadeNota;

public class Cadastro {
    private final LDECircularG<Aluno> lista = new LDECircularG<>();

    public Cadastro(){

    }
    public void inserir(Aluno aluno){
        lista.insertLast(aluno);
    }
    public void listar(){
        lista.listar();
    }
    public void mediaFinal(String matricula){
        lista.alterarMediaFinal(matricula);
    }
    public void falta(String matricula){
        lista.alterarFalta(matricula);
    }
    public void exibir(String matricula){
        lista.exibir(matricula);
    }
    public void remove(String matricula){
        lista.remove(matricula);
    }
}
