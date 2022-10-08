package Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario;

public class Funcionario implements Comparable <Funcionario> {

    private String nome;
    private String cpf;
    private String telefone;
    private String matricula;

    public Funcionario(String matricula) {
        this.matricula = matricula;
    }

    public Funcionario(String nome, String cpf, String telefone, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }



    @Override
    public int compareTo(Funcionario f) {
        int result;
        result = this.getMatricula().compareTo(f.getMatricula());
        return result;
    }
}
