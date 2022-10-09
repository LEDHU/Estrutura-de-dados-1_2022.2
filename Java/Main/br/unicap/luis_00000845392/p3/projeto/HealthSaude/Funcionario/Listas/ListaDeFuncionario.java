package Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Listas;

import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Funcionario;

import java.util.ArrayList;

public class ListaDeFuncionario {
    private ArrayList<Funcionario> funcionarios;

    public ListaDeFuncionario() {
        this.funcionarios = new ArrayList<>();
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void addFuncionario(Funcionario f){
        if (buscar(f) == null) {
            funcionarios.add(f);
            System.out.println("Funcionario adicionado ao sistema");
        } else
            System.out.println("Funcionario ja cadastrado no sistema");

    }
    public Funcionario buscar(Funcionario f){
        if(!getFuncionarios().isEmpty()){
            int aux = 0;
            while(aux < funcionarios.size()){
                if(f.compareTo(funcionarios.get(aux)) == 0)
                    return f;
                aux++;
            }
        }
        return null;
    }

    public void deleteFuncionario(Funcionario f){
        if(buscar(f) != null){
            funcionarios.remove(f);
            System.out.println("Funcionario removido do sistema");
        }
        else
            System.out.println("Funcionario nao encontrado no sistema");
    }

    public void exibirLista(){
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
