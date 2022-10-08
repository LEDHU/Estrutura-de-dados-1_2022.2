package Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Tipos;

import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Funcionario;
import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.ListaDeFuncionario;
import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Salario.ISalario;

import java.util.ArrayList;


public class ADM extends ListaDeFuncionario implements ISalario {


    public ADM(ArrayList<Funcionario> funcionarios) {
        super(funcionarios);
    }

    public void addFun(Funcionario f){
        addFuncionario(f);
    }

    public void deleteFun(Funcionario f){
        deleteFuncionario(f);
    }

    @Override
    public double calcularSalario(double salarioBase) {
        return 0;
    }
}
