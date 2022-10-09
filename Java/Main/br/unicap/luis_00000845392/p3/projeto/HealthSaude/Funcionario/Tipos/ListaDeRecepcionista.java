package Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Tipos;

import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Funcionario;

import java.util.ArrayList;

public class ListaDeRecepcionista {
    private ArrayList<Funcionario> recepcionistas;

    public ListaDeRecepcionista() {
        this.recepcionistas = new ArrayList<>();
    }

    public ArrayList<Funcionario> getRecepcionistas() {
        return recepcionistas;
    }

    public void setRecepcionistas(ArrayList<Funcionario> recepcionistas) {
        this.recepcionistas = recepcionistas;
    }

    public void addFuncionario(Funcionario f){
        if (buscar(f) == null) {
            recepcionistas.add(f);
            System.out.println("Funcionario adicionado ao sistema");
        } else
            System.out.println("Funcionario ja cadastrado no sistema");

    }
    public Funcionario buscar(Funcionario f){
        if(!getRecepcionistas().isEmpty()){
            int aux = 0;
            while(aux < recepcionistas.size()){
                if(f.compareTo(recepcionistas.get(aux)) == 0)
                    return f;
                aux++;
            }
        }
        return null;
    }

    public void deleteFuncionario(Funcionario f){
        if(buscar(f) != null){
            recepcionistas.remove(f);
            System.out.println("Funcionario removido do sistema");
        }
        else
            System.out.println("Funcionario nao encontrado no sistema");
    }

}
