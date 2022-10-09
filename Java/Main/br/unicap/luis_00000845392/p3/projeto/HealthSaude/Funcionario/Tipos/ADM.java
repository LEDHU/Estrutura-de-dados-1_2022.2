package Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Tipos;

import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Salario.ISalario;

public class ADM implements ISalario {
    @Override
    public double calcularSalario(double extra) {
        return 7;
    }
}
