package Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Paciente;

import java.util.ArrayList;

public class ListaDePaciente {
    private int qtd = 0;
    private ArrayList<Paciente> pacientes;

    public ListaDePaciente() {
        this.pacientes = new ArrayList<>();
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public void addPaciente(Paciente p){
        if(buscar(p) == null){
            pacientes.add(this.qtd,p);
            this.qtd++;
            System.out.println("Paciente adicionado ao sistema");
        }
        else
            System.out.println("Paciente ja cadastrado no sistema");
    }

    public Paciente buscar(Paciente p){
        if(!getPacientes().isEmpty()){
            int aux = 0;
            while(aux < pacientes.size()){
                if(p.compareTo(pacientes.get(aux)) == 0)
                    return p;
                aux++;
            }
        }
        return null;
    }

    public void deletePaciente(Paciente p){
        if(buscar(p) != null){
            pacientes.remove(p);
            System.out.println("Paciente removido do sistema");
            this.qtd--;
        }
        else
            System.out.println("Paciente nao encontrado no sistema");
    }
}
