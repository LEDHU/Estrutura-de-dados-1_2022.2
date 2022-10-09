package Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Aplicação;

import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Funcionario;
import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Listas.ListaDeFuncionario;
import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Listas.ListaDeADM;
import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Listas.ListaDeMedico;
import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Listas.ListaDeRecepcionista;
import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Salario.ISADM;
import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Salario.ISMedico;
import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Salario.ISRecepcionista;
import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Funcionario.Tipos.*;
import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Paciente.ListaDePaciente;
import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Paciente.Paciente;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



//adicionar casos para visualizaçao das listas




public class Interface {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);

        Paciente paciente;
        Funcionario funcionario;
        Medico medico = new Medico();
        ADM adm;
        Recepcionista recepcionista = new Recepcionista();

        ISADM isadm = new ISADM();
        ISMedico isMedico = new ISMedico();
        ISRecepcionista isRecepcionista = new ISRecepcionista();

        ListaDePaciente listaDePaciente = new ListaDePaciente();
        ListaDeFuncionario listaDeFuncionario = new ListaDeFuncionario();
        ListaDeADM listaDeADM = new ListaDeADM();
        ListaDeMedico listaDeMedico = new ListaDeMedico();
        ListaDeRecepcionista listaDeRecepcionista = new ListaDeRecepcionista();


        int opcao0 = 1;
        int opcao1 = 1;
        int opcao2 = 1;

        String matricula;
        String nome;
        String cpf;
        String telefone;
        String endereco;
        String nasc;
        Date nascimento;

        SimpleDateFormat formatter;

        //criacao de uma credencial funcionario principal
        matricula = "M000";
        funcionario = new Funcionario(matricula);
        listaDeFuncionario.addFuncionario(funcionario);
        listaDeADM.addFuncionario(funcionario);

        while (opcao0 != 0) {
            menuGeral();
            opcao0 = in.nextInt();
            switch (opcao0) {
                case 1 -> {
                    menuMatri();
                    matricula = in.next();
                    funcionario = new Funcionario(matricula);
                    if (listaDeADM.buscar(funcionario) == null) {
                        System.out.println("Não exite credencial para ADM");
                    } else {
                        while (opcao1 != 0) {
                            menuADM();
                            opcao1 = in.nextInt();
                            switch (opcao1) {
                                case 1 -> {
                                    System.out.println("Cargo: ");
                                    menuCargo();
                                    opcao1 = in.nextInt();
                                    System.out.println("Nome: ");
                                    nome = in.next();
                                    System.out.println("CPF: ");
                                    cpf = in.next();
                                    System.out.println("Telefone: ");
                                    telefone = in.next();
                                    menuMatri();
                                    matricula = in.next();
                                    funcionario = new Funcionario(nome, cpf, telefone, matricula);
                                    if(opcao1 == Cargos.ADM.Cargo){
                                        if (listaDeFuncionario.buscar(funcionario) == null) {
                                            listaDeFuncionario.addFuncionario(funcionario);
                                            listaDeADM.addFuncionario(funcionario);
                                        } else
                                            System.out.println("Funcionario ja cadastrado");

                                    }
                                    else if(opcao1 == Cargos.Medico.Cargo){
                                        if (listaDeFuncionario.buscar(funcionario) == null) {
                                            listaDeFuncionario.addFuncionario(funcionario);
                                            listaDeMedico.addFuncionario(funcionario);
                                        } else
                                            System.out.println("Funcionario ja cadastrado");
                                    }
                                    else if(opcao1 == Cargos.Recepcionista.Cargo){
                                        if (listaDeFuncionario.buscar(funcionario) == null) {
                                            listaDeFuncionario.addFuncionario(funcionario);
                                            listaDeRecepcionista.addFuncionario(funcionario);
                                        } else
                                            System.out.println("Funcionario ja cadastrado");
                                    }
                                }
                                case 2 -> {
                                    System.out.println("Cargo: ");
                                    menuCargo();
                                    opcao1 = in.nextInt();
                                    menuMatri();
                                    matricula = in.next();
                                    funcionario = new Funcionario(matricula);
                                    if (opcao1 == Cargos.ADM.Cargo){
                                        if (listaDeADM.buscar(funcionario) != null) {
                                            listaDeFuncionario.deleteFuncionario(funcionario);
                                            listaDeADM.deleteFuncionario(funcionario);
                                        }
                                        else
                                            System.out.println("Funcionario não cadastrado no sistema");
                                    }
                                    else if (opcao1 == Cargos.Medico.Cargo){
                                        if (listaDeMedico.buscar(funcionario) != null) {
                                            listaDeFuncionario.deleteFuncionario(funcionario);
                                            listaDeMedico.deleteFuncionario(funcionario);
                                        }
                                        else
                                            System.out.println("Funcionario não cadastrado no sistema");
                                    }
                                    else if (opcao1 == Cargos.Recepcionista.Cargo){
                                        if (listaDeRecepcionista.buscar(funcionario) != null) {
                                            listaDeFuncionario.deleteFuncionario(funcionario);
                                            listaDeRecepcionista.deleteFuncionario(funcionario);
                                        }
                                        else
                                            System.out.println("Funcionario não cadastrado no sistema");
                                    }
                                }
                                case 3 -> {
                                    while (opcao2 != 0) {
                                        double hora;
                                        menuSalario();
                                        opcao2 = in.nextInt();
                                        switch (opcao2) {
                                            case 1 -> {
                                                System.out.println("Hora extra: ");
                                                hora = in.nextInt();
                                                System.out.println("O salario do Adm é " + isadm.calcularSalario(hora));
                                            }
                                            case 2 -> {
                                                System.out.println("Hora extra: ");
                                                hora = in.nextInt();
                                                System.out.println("O salario do Medico é " + isMedico.calcularSalario(hora));
                                            }
                                            case 3 -> {
                                                System.out.println("Hora extra: ");
                                                hora = in.nextInt();
                                                System.out.println("O salario do Recepcionista é " + isRecepcionista.calcularSalario(hora));
                                            }
                                        }
                                    }
                                }
                                case 4 -> {
                                    listaDeMedico.exibirLista();
                                }
                                case 5 ->{
                                    listaDeADM.exibirLista();
                                }
                                case 6 ->{
                                    listaDeRecepcionista.exibirLista();
                                }
                                case 7 ->{
                                    listaDeFuncionario.exibirLista();
                                }
                            }
                        }
                    }
                }
                case 2 -> {
                    menuMatri();
                    matricula = in.next();
                    funcionario = new Funcionario(matricula);
                    if (listaDeMedico.buscar(funcionario) == null) {
                        System.out.println("Não exite credencial para Medico");
                    } else {
                        menuMedico();
                        opcao2 = in.nextInt();
                        switch (opcao2) {
                            case 1 -> {
                                medico.ConsultaPaci();
                                System.out.println("O paciente entrou na fila de consultas");
                            }
                            case 2 -> {
                                medico.ExamePaci();
                                System.out.println("O paciente entrou na fila de exames");

                            }
                        }
                    }
                }
                case 3 -> {
                    while (opcao1 != 0) {
                        menuRecepcionista();
                        opcao1 = in.nextInt();
                        switch (opcao1) {
                            case 1 -> {
                                System.out.println("Nome: ");
                                nome = in.nextLine();
                                System.out.println("CPF: ");
                                cpf = in.next();
                                System.out.println("Endereço: ");
                                endereco = in.next();
                                System.out.println("Telefone: ");
                                telefone = in.next();
                                System.out.println("Data de nascimento: (dd/MM/yyyy)");
                                nasc = in.next();
                                formatter = new SimpleDateFormat("dd/MM/yyyy");
                                nascimento = formatter.parse(nasc);

                                paciente = new Paciente(nome, cpf, endereco, telefone, nascimento);

                                if (listaDePaciente.buscar(paciente) == null) {
                                    listaDePaciente.addPaciente(paciente);
                                }
                            }
                            case 2 ->{
                                System.out.println("Não é recomentado excluir paciente do banco de dados");
                                System.out.println("Deseja excluir? s/n");
                                char c = in.next().charAt(0);
                                if(c == 's'){
                                    System.out.println("CPF: ");
                                    cpf = in.next();
                                    paciente = new Paciente(cpf);
                                    if(listaDePaciente.buscar(paciente) == null){
                                        System.out.println("Paciente não incluido no sistema");
                                    }
                                    else {
                                        listaDePaciente.deletePaciente(paciente);
                                    }
                                }
                            }
                            case 3 ->{
                                System.out.println("CPF do paciente: ");
                                cpf = in.next();
                                paciente = new Paciente(cpf);

                                if(listaDePaciente.buscar(paciente) == null){
                                    System.out.println("Adicione o paciente antes de marcar uma consulta");
                                }
                                else{
                                    recepcionista.addPaciMedico(paciente);
                                }
                            }
                            case 4 ->{
                                System.out.println("CPF do paciente: ");
                                cpf = in.next();
                                paciente = new Paciente(cpf);

                                if(listaDePaciente.buscar(paciente) == null){
                                    System.out.println("Adicione o paciente antes de marcar um exame");
                                }
                                else{
                                    recepcionista.addPaciExame(paciente);
                                }
                            }
                        }
                    }
                }
                case 0 -> {
                    System.out.println("Bye");
                }
                default -> {
                    menuInvalido();
                }
            }
        }
    }

    public static void menuCargo(){
        System.out.println("1 - Adm");
        System.out.println("2 - Medico");
        System.out.println("3 - Recepcionista");
    }

    public static void menuRecepcionista(){
        System.out.println("1 - Adicionar paciente");
        System.out.println("2 - Excluir paciente");
        System.out.println("3 - Marcar consulta");
        System.out.println("4 - Marcar exame");
        System.out.println("0 - Voltar");
    }

    public static void menuGeral(){
        System.out.println("1 - Adm");
        System.out.println("2 - Medico");
        System.out.println("3 - Recepcionista");
        System.out.println("0 - Sair do sistema");
    }

    public static void menuMatri(){
        System.out.println("Matricula: ");
    }

    public static void menuMedico(){
        System.out.println("1 - Consulta finalizado");
        System.out.println("2 - Exame finalizado");
        System.out.println("0 - Voltar");
    }

    public static void menuADM(){
        System.out.println("1 - Adimitir funcionario");
        System.out.println("2 - Demitir funcionario");
        System.out.println("3 - Calcular salario");
        System.out.println("4 - Visualizar lista de medicos");
        System.out.println("5 - Visualizar lista de adms");
        System.out.println("6 - Visualizar lista de recepcionistas");
        System.out.println("7 - Visualizar funcionarios");
        System.out.println("0 - Voltar");
    }

    public static void menuSalario(){
        System.out.println("1 - Salario de Adm");
        System.out.println("2 - Salario de Medico");
        System.out.println("3 - Salario de Recepcionista");
        System.out.println("0 - Voltar");
    }

    public static void menuInvalido(){
        System.out.println("Opcao invalida");
    }
}
