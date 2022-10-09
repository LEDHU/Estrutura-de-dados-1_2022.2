package Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Tipos;

import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Funcionario;

import java.util.ArrayList;

public class ListaDeADM {
    private ArrayList<Funcionario> adms;
    public ListaDeADM() {
        this.adms = new ArrayList<>();
    }

    public ArrayList<Funcionario> getAdms() {
        return adms;
    }

    public void setAdms(ArrayList<Funcionario> adms) {
        this.adms = adms;
    }

    public void addFuncionario(Funcionario f){
        if (buscar(f) == null) {
            adms.add(f);
            System.out.println("Funcionario adicionado ao sistema");
        } else
            System.out.println("Funcionario ja cadastrado no sistema");

    }
    public Funcionario buscar(Funcionario f){
        if(!getAdms().isEmpty()){
            int aux = 0;
            while(aux < adms.size()){
                if(f.compareTo(adms.get(aux)) == 0)
                    return f;
                aux++;
            }
        }
        return null;
    }

    public void deleteFuncionario(Funcionario f){
        if(buscar(f) != null){
            adms.remove(f);
            System.out.println("Funcionario removido do sistema");
        }
        else
            System.out.println("Funcionario nao encontrado no sistema");
    }

}
