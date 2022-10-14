/*
package Primeira_Lista_LSE;

public class LSEAluno {

    private LSENode primeiro;

    //insere no inicio da lista
    public void inserirInicio(Aluno a1) {
        LSENode novo;
        novo = new LSENode(a1);
        if (this.isEmpty())
            this.primeiro = novo;
        else {
            novo.setProx(this.primeiro);
            this.primeiro = novo;
        }
    }

    //insere no final da lista
    public void inserirFinal(Aluno a1) {

        LSENode novo;
        LSENode aux;
        novo = new LSENode(a1);

        if (this.isEmpty()) {
            this.primeiro = novo;
        } else {
            aux = this.primeiro;
            while(aux.getProx() != null ){
                aux = aux.getProx();
            }
            aux.setProx(novo);
        }
    }

    //ve se a lista ta vazia ou nao
    public boolean isEmpty(){
        if(this.primeiro == null)
            return true;
        else
            return false;
    }

    //exibe todos os alunos da lista
    public void exibirGeral() {
        LSENode aux;
        if (this.isEmpty())
            System.out.println("Lista vazia!");
        else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    //remove o aluno no inicio
    public void removerInicio(){
        LSENode aux = this.primeiro;
        if (this.isEmpty())
            System.out.println("Lista vazia!");
        else {
            aux = this.primeiro;
            this.primeiro = aux;
        }
    }

    //remove o aluno do final da lista
    public void removerFinal(){
        LSENode aux = this.primeiro;
        LSENode pen = null;
        if(this.isEmpty())
            System.out.println("Lista vazia!");
        else{
            while(aux.getProx() != null){
                pen = aux;
                aux = aux.getProx();
            }
            pen.setProx(null);
        }
    }

    //busca que recebe tipo aluno
    public LSENode buscar(Aluno a1){
        LSENode aux;
        if(this.isEmpty())
            return null;
        else{
            aux = this.primeiro;
            while(aux != null){
                if(aux.getInfo().compareTo(a1) == 0)
                    return aux;
                else
                    aux = aux.getProx();
            }
            return null;
        }
    }

    //exibe aluno recebendo a matricula
    public void exibirALuno(String mat){
        LSENode aux;
        aux = buscar(mat);
        if (aux == null)
            System.out.println("Aluno nao encontrado!!");
        else
            System.out.println(aux.getInfo());

    }

    //busca recebendo a matricula
    public LSENode buscar(String mat){
        LSENode aux;
        if(this.isEmpty())
            return null;
        else{
            aux = this.primeiro;
            while(aux != null) {
                if (aux.getInfo().compareToAluno(mat) == 0)
                    return aux;
                else
                    aux = aux.getProx();
            }
            return null;
        }
    }

    //alterar media de um aluno
    public void mediaAluno(String mat, double med){
        LSENode aux;
        aux = buscar(mat);
        if (aux == null)
            System.out.println("Aluno nao encontrado!!");
        else
            aux.setInfo(med);

    }

    //alterar faltas de um aluno
    public void faltaAluno(String mat, int fal){
        LSENode aux;
        aux = buscar(mat);
        if (aux == null)
            System.out.println("Aluno nao encontrado!!");
        else
            aux.setInfo(fal);

    }

    //remover aluno especifico
    public void removerAluno (String mat){
        LSENode aux;
        aux = buscar(mat);
        if (aux == null)
            System.out.println("Aluno nao encontrado!!");
        else{
            //se o no for o primeiro chama o metodo removerInicio
            if(){}
            //se o no for o ultimo chama o metodo removerFinal
            else if(){}
            //se nao o no que referencia o no que vai ser excluido (n -1) referencia agora o no depois do no (n + 1)
            else{}
        }


    }

}
*/
