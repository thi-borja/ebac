package br.com.tborja;

public class Demo {

    //Este e um exemplo de Template method
    public static void main(String[] args) {
        Trabalhador tb = new Bombeiro();
        Trabalhador tm = new Medico();
        Trabalhador tp = new Policial();
        tb.executar();
        tm.executar();
        tp.executar();
    }

}
