package Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Tipos;

import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Paciente.Paciente;

import java.util.ArrayDeque;

public class Medico extends Recepcionista{

    public Medico() {
        super();
    }

    public Medico(ArrayDeque<Paciente> pacisMedico, ArrayDeque<Paciente> pacisExame) {
        super(pacisMedico, pacisExame);
    }

    public void ConsultaPaci(){
        atenderConsultaPaci(this.getPacisMedico());
    }

    public void ExamePaci(){
        atenderExamePaci(this.getPacisExame());
    }

    public void atenderConsultaPaci(ArrayDeque<Paciente> pacisMedico){
        pacisMedico.remove();
    }

    public void atenderExamePaci(ArrayDeque<Paciente> pacisExame){
        pacisExame.remove();
    }

}
