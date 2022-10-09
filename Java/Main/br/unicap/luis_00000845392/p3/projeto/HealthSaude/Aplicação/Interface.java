package Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Aplicação;

import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Exceptions.CredencialAdmException;
import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Exceptions.CredencialMedicoException;
import Java.Main.br.unicap.luis_00000845392.p3.projeto.HealthSaude.Exceptions.CredencialRecepcionistaException;
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
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Interface {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);

        Paciente paciente;
        Funcionario funcionario;
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
        int opcao1;
        int opcao2;

        String matricula;
        String nome;
        String cpf;
        String telefone;
        String endereco;
        String nasc;
        Date nascimento;

        SimpleDateFormat formatter;

        //criacao de uma credencial funcionario principal
        //inical para adicionar os outros funcionarios
        matricula = "M000";
        funcionario = new Funcionario(matricula);
        listaDeFuncionario.addFuncionario(funcionario);
        listaDeADM.addFuncionario(funcionario);

        for(int i = 0; i < 50; i++){
            System.out.println();
        }
        System.out.println("Welcome to HealthSaude");

        while (opcao0 != 0) {
            try {
                opcao0 = menuGeral();

                switch (opcao0) {
                    case 1 -> {
                        opcao1 = 1;
                        opcao2 = 1;
                        matricula = menuMatri();
                        funcionario = new Funcionario(matricula);
                        if (listaDeADM.buscar(funcionario) == null) {
                            throw new CredencialAdmException();
                        } else {
                            while (opcao1 != 0) {
                                try {
                                    opcao1 = menuADM();
                                    switch (opcao1) {
                                        case 1 -> {
                                            System.out.println("Cargo: ");
                                            try {
                                                opcao1 = menuCargo();
                                                System.out.println("Nome: ");
                                                nome = in.next();
                                                System.out.println("CPF: ");
                                                cpf = in.next();
                                                System.out.println("Telefone: ");
                                                telefone = in.next();
                                                matricula = menuMatri();
                                                funcionario = new Funcionario(nome, cpf, telefone, matricula);
                                                if (opcao1 == Cargos.ADM.Cargo) {
                                                    if (listaDeFuncionario.buscar(funcionario) == null) {
                                                        listaDeFuncionario.addFuncionario(funcionario);
                                                        listaDeADM.addFuncionario(funcionario);
                                                    } else
                                                        System.out.println("Funcionario ja cadastrado");

                                                } else if (opcao1 == Cargos.Medico.Cargo) {
                                                    if (listaDeFuncionario.buscar(funcionario) == null) {
                                                        listaDeFuncionario.addFuncionario(funcionario);
                                                        listaDeMedico.addFuncionario(funcionario);
                                                    } else
                                                        System.out.println("Funcionario ja cadastrado");
                                                } else if (opcao1 == Cargos.Recepcionista.Cargo) {
                                                    if (listaDeFuncionario.buscar(funcionario) == null) {
                                                        listaDeFuncionario.addFuncionario(funcionario);
                                                        listaDeRecepcionista.addFuncionario(funcionario);
                                                    } else
                                                        System.out.println("Funcionario ja cadastrado");
                                                }
                                            }
                                            catch (InputMismatchException inputMismatchException){
                                                System.out.println("ERRO - Valor incorreto");
                                            }
                                        }
                                        case 2 -> {
                                            System.out.println("Cargo: ");
                                            opcao1 = menuCargo();
                                            matricula = menuMatri();
                                            funcionario = new Funcionario(matricula);

                                            if (opcao1 == Cargos.ADM.Cargo) {
                                                int x = listaDeADM.buscarInt(funcionario);

                                                if (x != -1) {
                                                    listaDeFuncionario.deleteFuncionario(funcionario, x);
                                                    listaDeADM.deleteFuncionario(funcionario, x);
                                                } else
                                                    System.out.println("Funcionario não cadastrado no sistema");

                                            } else if (opcao1 == Cargos.Medico.Cargo) {
                                                int x = listaDeMedico.buscarInt(funcionario);

                                                if (x != -1) {
                                                    listaDeFuncionario.deleteFuncionario(funcionario, x);
                                                    listaDeMedico.deleteFuncionario(funcionario, x);

                                                } else
                                                    System.out.println("Funcionario não cadastrado no sistema");

                                            } else if (opcao1 == Cargos.Recepcionista.Cargo) {
                                                int x = listaDeRecepcionista.buscarInt(funcionario);

                                                if (x != -1) {
                                                    listaDeFuncionario.deleteFuncionario(funcionario, x);
                                                    listaDeRecepcionista.deleteFuncionario(funcionario, x);
                                                } else
                                                    System.out.println("Funcionario não cadastrado no sistema");
                                            }
                                        }
                                        case 3 -> {
                                            while (opcao2 != 0) {
                                                double hora;
                                                opcao2 = menuSalario();
                                                switch (opcao2) {
                                                    case 1 -> {
                                                        if (!listaDeADM.getAdms().isEmpty()) {
                                                            System.out.println("Hora extra: ");
                                                            hora = in.nextDouble();
                                                            System.out.println("O salario do Adm é " + isadm.calcularSalario(hora));
                                                        } else
                                                            System.out.println("Lista de administraçao esta vazia para calcular o salario");
                                                    }
                                                    case 2 -> {
                                                        if (!listaDeMedico.getMedicos().isEmpty()) {
                                                            System.out.println("Hora extra: ");
                                                            hora = in.nextDouble();
                                                            System.out.println("O salario do Medico é " + isMedico.calcularSalario(hora));
                                                        } else
                                                            System.out.println("Lista de medico esta vazia para calcular o salario");
                                                    }
                                                    case 3 -> {
                                                        if (!listaDeRecepcionista.getRecepcionistas().isEmpty()) {
                                                            System.out.println("Hora extra: ");
                                                            hora = in.nextDouble();
                                                            System.out.println("O salario do Recepcionista é " + isRecepcionista.calcularSalario(hora));
                                                        } else
                                                            System.out.println("Lista de recepcionista esta vazia para calcular o salario");
                                                    }
                                                }
                                            }
                                        }
                                        case 4 ->
                                            listaDeMedico.exibirLista();

                                        case 5 ->
                                            listaDeADM.exibirLista();

                                        case 6 ->
                                            listaDeRecepcionista.exibirLista();

                                        case 7 ->
                                            listaDeFuncionario.exibirLista();

                                    }
                                }
                                catch (InputMismatchException inputMismatchException){
                                    System.out.println("ERRO - Valor incorreto");
                                }
                            }
                        }
                    }
                    case 2 -> {
                        opcao0 = 1;
                        opcao1 = 1;
                        matricula = menuMatri();
                        funcionario = new Funcionario(matricula);
                        if (listaDeMedico.buscar(funcionario) == null) {
                           throw new CredencialMedicoException();
                        } else {
                            while (opcao1 != 0) {
                                try {
                                    opcao1 = menuMedico();
                                    switch (opcao1) {
                                        case 1 -> {
                                            recepcionista.deletePaciMedico();
                                            System.out.println("O paciente foi atendido");
                                        }
                                        case 2 -> {
                                            recepcionista.deletePaciExame();
                                            System.out.println("O paciente foi atendido");

                                        }
                                        case 3 ->
                                            System.out.println(recepcionista.getPacisMedico().getFirst());

                                        case 4 ->
                                            System.out.println(recepcionista.getPacisExame().getFirst());

                                    }
                                }
                                catch (InputMismatchException inputMismatchException){
                                    System.out.println("ERRO - Valor incorreto");
                                }
                                catch (NoSuchElementException noSuchElementException){
                                    System.out.println("ERRO - Sem paciente na fila");
                                }
                            }
                        }
                    }
                    case 3 -> {
                        opcao0 = 1;
                        opcao1 = 1;
                        matricula = menuMatri();
                        funcionario = new Funcionario(matricula);
                        if (listaDeRecepcionista.buscar(funcionario) == null) {
                            throw new CredencialRecepcionistaException();
                        }
                        else {
                            while (opcao1 != 0) {
                                try {
                                    opcao1 = menuRecepcionista();
                                    switch (opcao1) {
                                        case 1 -> {
                                            System.out.println("Nome: ");
                                            nome = in.nextLine();
                                            System.out.println("CPF: ");
                                            cpf = in.nextLine();
                                            System.out.println("Endereço: ");
                                            endereco = in.nextLine();
                                            System.out.println("Telefone: ");
                                            telefone = in.nextLine();
                                            System.out.println("Data de nascimento: (dd/MM/yyyy)");
                                            nasc = in.nextLine();
                                            formatter = new SimpleDateFormat("dd/MM/yyyy");
                                            nascimento = formatter.parse(nasc);

                                            paciente = new Paciente(nome, cpf, endereco, telefone, nascimento);

                                            if (listaDePaciente.buscar(paciente) == null) {
                                                listaDePaciente.addPaciente(paciente);
                                            }
                                        }
                                        case 2 -> {
                                            System.out.println("Não é recomentado excluir paciente do banco de dados");
                                            System.out.println("Deseja excluir? s/n");
                                            char c = in.next().charAt(0);
                                            if (c == 's') {
                                                System.out.println("CPF: ");
                                                cpf = in.next();
                                                paciente = new Paciente(cpf);
                                                int x = listaDePaciente.buscarInt(paciente);
                                                if (x != -1) {
                                                    System.out.println("Paciente não incluido no sistema");
                                                } else {
                                                    listaDePaciente.deletePaciente(paciente, x);
                                                }
                                            }
                                        }
                                        case 3 -> {
                                            System.out.println("Nome do paciente: ");
                                            nome = in.nextLine();
                                            System.out.println("CPF do paciente: ");
                                            cpf = in.nextLine();
                                            paciente = new Paciente(nome, cpf);

                                            if (listaDePaciente.buscar(paciente) == null) {
                                                System.out.println("Adicione o paciente antes de marcar uma consulta");
                                            } else {
                                                recepcionista.addPaciMedico(paciente);
                                                System.out.println("Adicionado na fila para consulta");
                                            }
                                        }
                                        case 4 -> {
                                            System.out.println("Nome do paciente: ");
                                            nome = in.nextLine();
                                            System.out.println("CPF do paciente: ");
                                            cpf = in.nextLine();
                                            paciente = new Paciente(nome, cpf);

                                            if (listaDePaciente.buscar(paciente) == null) {
                                                System.out.println("Adicione o paciente antes de marcar um exame");
                                            } else {
                                                recepcionista.addPaciExame(paciente);
                                                System.out.println("Adicionado na fila para exames");
                                            }
                                        }
                                        case 5 -> {
                                            if (!recepcionista.getPacisMedico().isEmpty())
                                                System.out.println(recepcionista.getPacisMedico().getFirst());
                                            else
                                                System.out.println("Lista de paciente para consulta esta vazia");
                                        }
                                        case 6 -> {
                                            if (!recepcionista.getPacisExame().isEmpty())
                                                System.out.println(recepcionista.getPacisExame().getFirst());
                                            else
                                                System.out.println("Lista de paciente para exame esta vazia");
                                        }
                                        case 7 ->
                                            listaDePaciente.exibirLista();

                                    }
                                }
                                catch (InputMismatchException inputMismatchException){
                                    System.out.println("ERRO - Valor incorreto");
                                }
                                catch (NoSuchElementException noSuchElementException){
                                    System.out.println("ERRO - Sem paciente na fila");
                                }
                                catch (ParseException parseException) {
                                    System.out.println("ERRO - Data inserida incorretamente");
                                }
                            }
                        }
                    }
                    case 0 ->
                        System.out.println("Bye");

                    default ->
                        menuInvalido();

                }
            }
            catch (NumberFormatException numberFormatException){
                System.out.println("ERRO - O número não foi selecionado de forma correta");
            }
            catch (CredencialMedicoException credencialMedicoException) {
                System.out.println("ERRO - Não exite credencial para Medico");
            }
            catch (CredencialAdmException credencialAdmException) {
                System.out.println("ERRO - Não exite credencial para Adm");
            }
            catch (CredencialRecepcionistaException credencialRecepcionistaException){
                System.out.println("ERRO - Não exite credencial para Recepcionista");
            }
            catch (InputMismatchException inputMismatchException){
                System.out.println("ERRO - Valor incorreto");
            }
            catch (NoSuchElementException noSuchElementException){
                System.out.println("ERRO - Sem paciente na fila");
            }
        }
    }

    public static int menuCargo(){
        Scanner in = new Scanner(System.in);
        int aux = 1;
        int result = 10;

        while(aux != 0) {
            System.out.println("\n==============================");
            System.out.println("||    1 - Administração     ||");
            System.out.println("||    2 - Medico            ||");
            System.out.println("||    3 - Recepcionista     ||");
            System.out.println("==============================");
            try{
                result = in.nextInt();
                aux = 0;
            }
            catch (NumberFormatException numberFormatException){
                System.out.println("Numero invalido");
            }
        }

        return result;
    }

    public static int menuRecepcionista(){
        Scanner in = new Scanner(System.in);
        int aux = 1;
        int result = 10;

        while(aux != 0) {
            System.out.println("\n======================================================");
            System.out.println("||  1 - Adicionar paciente                          ||");
            System.out.println("||  2 - Excluir paciente                            ||");
            System.out.println("||  3 - Marcar consulta                             ||");
            System.out.println("||  4 - Marcar exame                                ||");
            System.out.println("||  5 - Visualizar o proximo paciente para consulta ||");
            System.out.println("||  6 - Visualizar o proximo paciente para exame    ||");
            System.out.println("||  7 - Visualizar lista de paciente ja cadastrado  ||");
            System.out.println("||  0 - Voltar                                      ||");
            System.out.println("======================================================");
            try{
                result = in.nextInt();
                aux = 0;
            }
            catch (NumberFormatException numberFormatException){
                System.out.println("Numero invalido");
            }
        }
        return result;
    }

    public static int menuGeral(){
        Scanner in = new Scanner(System.in);
        int aux = 1;
        int result = 10;

        while(aux != 0) {
            System.out.println("\n=============================");
            System.out.println("||  1 - Administração      ||");
            System.out.println("||  2 - Medico             ||");
            System.out.println("||  3 - Recepcionista      ||");
            System.out.println("||  0 - Sair do sistema    ||");
            System.out.println("=============================");
            try{
                result = in.nextInt();
                aux = 0;
            }
            catch (NumberFormatException numberFormatException){
                System.out.println("Numero invalido");
            }
        }
        return result;
    }

    public static String menuMatri(){
        Scanner in = new Scanner(System.in);

        System.out.println("Matricula: ");

        return in.next();
    }

    public static int menuMedico(){
        Scanner in = new Scanner(System.in);

        int aux = 1;
        int result = 10;

        while(aux != 0){
            System.out.println("\n======================================================");
            System.out.println("||  1 - Consulta finalizado                         ||");
            System.out.println("||  2 - Exame finalizado                            ||");
            System.out.println("||  3 - Visualizar o proximo paciente para consulta ||");
            System.out.println("||  4 - Visualizar o proximo paciente para exame    ||");
            System.out.println("||  0 - Voltar                                      ||");
            System.out.println("======================================================");
            try{
                result = in.nextInt();
                aux = 0;
            }
            catch (NumberFormatException numberFormatException){
                System.out.println("Numero invalido");
            }
        }
        return result;
    }

    public static int menuADM(){
        Scanner in = new Scanner(System.in);

        int aux = 1;
        int result = 10;

        while(aux != 0){
            System.out.println("\n=============================================");
            System.out.println("||  1 - Adimitir funcionario               ||");
            System.out.println("||  2 - Demitir funcionario                ||");
            System.out.println("||  3 - Calcular salario                   ||");
            System.out.println("||  4 - Visualizar lista de medicos        ||");
            System.out.println("||  5 - Visualizar lista de adms           ||");
            System.out.println("||  6 - Visualizar lista de recepcionistas ||");
            System.out.println("||  7 - Visualizar funcionarios            ||");
            System.out.println("||  0 - Voltar                             ||");
            System.out.println("=============================================");
            try{
                result = in.nextInt();
                aux = 0;
            }
            catch (NumberFormatException numberFormatException){
                System.out.println("Numero invalido");
            }
        }
        return result;
    }

    public static int menuSalario(){
        Scanner in = new Scanner(System.in);

        int aux = 1;
        int result = 10;

        while(aux != 0){
            System.out.println("\n====================================");
            System.out.println("||  1 - Salario de Administração  ||");
            System.out.println("||  2 - Salario de Medico         ||");
            System.out.println("||  3 - Salario de Recepcionista  ||");
            System.out.println("||  0 - Voltar                    ||");
            System.out.println("====================================");
            try{
                result = in.nextInt();
                aux = 0;
            }
            catch (NumberFormatException numberFormatException){
                System.out.println("Numero invalido");
            }
        }
        return result;
    }

    public static void menuInvalido(){
        System.out.println("Opcao invalida");
    }
}
