package Seguna_Lista_LSE;

import java.util.Scanner;

public class LSEAluno {
    private LSENode primeiro;

    // Métodos públicos
    public boolean isEmpty() {
        // Testa se a lista está vazia
        if (this.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }
    public void remover (String matr) {
        Aluno aux = new Aluno (matr);
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        }
        else if (this.primeiro.getProx() == null) {
            if (aux.compareTo(this.primeiro.getInfo()) == 0) {
                this.primeiro = null;
                System.out.println("Remoção efetuada");
            }
            else {
                System.out.println("Aluno não encontrado!");
            }
        }
        else {
            // INCOMPLETO - FICOU PARA OS ALUNOS TERMINAREM DE IMPLEMENTAR
        }
    }

    private LSENode buscar(Aluno al) { // Busca sequencial simples
        LSENode aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfo().compareTo(al) == 0) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void exibirAluno (String m) {
        Aluno aux = new Aluno (m);
        LSENode result = this.buscar(aux);
        if (result == null) {
            System.out.println("Aluno não encontrado!");
        }
        else {
            System.out.println("Dados do aluno");
            System.out.println(result.getInfo());
        }
    }

    public void alterarMedia (String m) {
        Scanner in = new Scanner (System.in);
        Aluno aux = new Aluno (m);
        double novaMedia;
        LSENode result = this.buscar(aux);
        if (result == null) {
            System.out.println("Aluno não encontrado!");
        }
        else {
            System.out.print("Informe a nova média do aluno: ");
            novaMedia = in.nextDouble();
            result.getInfo().setMedia(novaMedia);
            System.out.println("Média alterada!");
        }
    }

    public void inserirAluno(Aluno al) {
        LSENode novo;
        // Verifica, usando a função "buscar" se o aluno já é cadastrado
        LSENode result = this.buscar(al);
        if (result != null) {
            System.out.println("Aluno já existe na lista!");
        } else {
            // Cria e preenche um novo nó com o aluno que foi passado como parâmetro
            novo = new LSENode(al);
            // Insere um novo aluno no início da lista de alunos
            if (this.isEmpty()) {
                this.primeiro = novo;
            } else {
                novo.setProx(this.primeiro);
                this.primeiro = novo;
            }
            System.out.println("Inserção efetuada!");
        }
    }

    public void inserirAlunoFinal(Aluno al) {
        LSENode novo, aux;
        // Verifica, usando a função "buscar" se o aluno já é cadastrado
        LSENode result = this.buscar(al);
        if (result != null) {
            System.out.println("Aluno já existe na lista!");
        } else {
            // Cria e preenche um novo nó com o aluno que foi passado como parâmetro
            novo = new LSENode(al);
            // Insere um novo aluno no final da lista de alunos
            if (this.isEmpty()) {
                this.primeiro = novo;
            } else {
                aux = this.primeiro;
                while (aux.getProx() != null) {
                    aux = aux.getProx();
                }
                aux.setProx(novo);
            }
            System.out.println("Inserção efetuada!");
        }
    }

    public void exibir() {
        // Exibe o conteúdo de todos os nós da lista
        LSENode aux;
        if (this.isEmpty()) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }
}
