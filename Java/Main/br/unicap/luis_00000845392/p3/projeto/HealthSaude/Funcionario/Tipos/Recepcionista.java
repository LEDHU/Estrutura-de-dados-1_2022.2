package Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Tipos;

import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Paciente.Paciente;

import java.util.ArrayDeque;

public class Recepcionista {
    private ArrayDeque<Paciente> pacisMedico;
    private ArrayDeque<Paciente> pacisExame;

    public Recepcionista() {
        this.pacisMedico = new ArrayDeque<>();
        this.pacisExame = new ArrayDeque<>();
    }

    public ArrayDeque<Paciente> getPacisMedico() {
        return pacisMedico;
    }

    public void setPacisMedico(ArrayDeque<Paciente> pacisMedico) {
        this.pacisMedico = pacisMedico;
    }

    public ArrayDeque<Paciente> getPacisExame() {
        return pacisExame;
    }

    public void setPacisExame(ArrayDeque<Paciente> pacisExame) {
        this.pacisExame = pacisExame;
    }

    public void addPaciMedico(Paciente p){
        pacisMedico.add(p);
    }

    public void addPaciExame(Paciente p){
        pacisExame.add(p);
    }

    public void deletePaciMedico(){
        pacisMedico.removeFirst();
    }

    public void deletePaciExame(){
        pacisExame.removeFirst();
    }


}
