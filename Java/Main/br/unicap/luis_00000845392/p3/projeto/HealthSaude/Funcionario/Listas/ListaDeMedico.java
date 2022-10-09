package Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Listas;

import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Funcionario;

import java.util.ArrayList;

public class ListaDeMedico {
    private ArrayList<Funcionario> medicos;

    public ListaDeMedico() {
        this.medicos = new ArrayList<>();
    }

    public ArrayList<Funcionario> getMedicos() {
        return medicos;
    }

    public void setMedicos(ArrayList<Funcionario> medicos) {
        this.medicos = medicos;
    }

    public void addFuncionario(Funcionario f){
        if (buscar(f) == null) {
            medicos.add(f);
            System.out.println("Funcionario adicionado ao sistema");
        } else
            System.out.println("Funcionario ja cadastrado no sistema");

    }
    public Funcionario buscar(Funcionario f){
        if(!getMedicos().isEmpty()){
            int aux = 0;
            while(aux < medicos.size()){
                if(f.compareTo(medicos.get(aux)) == 0)
                    return f;
                aux++;
            }
        }
        return null;
    }

    public void deleteFuncionario(Funcionario f){
        if(buscar(f) != null){
            medicos.remove(f);
            System.out.println("Funcionario removido do sistema");
        }
        else
            System.out.println("Funcionario nao encontrado no sistema");
    }
    public void exibirLista(){
        for (Funcionario medico : medicos) {
            System.out.println(medico);
        }
    }


}
