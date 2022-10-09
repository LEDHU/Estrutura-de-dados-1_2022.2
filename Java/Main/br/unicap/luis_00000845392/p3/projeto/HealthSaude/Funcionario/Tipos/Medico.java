package Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Tipos;

public class Medico extends Recepcionista{

    public Medico() {
        super();
    }

    public void atenderConsultaPaci(){
        this.deletePaciMedico();
    }

    public void atenderExamePaci(){
        this.deletePaciExame();
    }


}
