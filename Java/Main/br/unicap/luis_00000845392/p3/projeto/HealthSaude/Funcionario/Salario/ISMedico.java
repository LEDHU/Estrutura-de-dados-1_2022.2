package Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Salario;

public class ISMedico implements ISalario{
    @Override
    public double calcularSalario(double salarioBase) {
        return salarioBase + salarioBase;
    }
}
