package Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Tipos;

import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Paciente.Paciente;

import java.util.ArrayDeque;

public class Medico extends Recepcionista{

    private String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Medico(ArrayDeque<Paciente> pacisMedico, ArrayDeque<Paciente> pacisExame) {
        super(pacisMedico, pacisExame);
    }

    public void atenderConsultaPaci(ArrayDeque<Paciente> pacisMedico){
        pacisMedico.remove();
    }

    public void atenderExamePaci(ArrayDeque<Paciente> pacisExame){
        pacisExame.remove();
    }

}
