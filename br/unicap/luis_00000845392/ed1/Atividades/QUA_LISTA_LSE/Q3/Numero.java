package br.unicap.luis_00000845392.ed1.Atividades.QUA_LISTA_LSE.Q3;

public class Numero {
    private int num;

    public Numero (int n){
        this.num = n;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String toString() {
        return "Numero{" +
                "numero = " + num +
                '}';
    }
}
