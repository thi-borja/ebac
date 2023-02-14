package br.com.tborja;

public abstract class  Trabalhador {


    public void executar(){
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();
    }

    protected abstract void trabalhar();

    private void iniciarRotina() {
        System.out.println("Iniciando a rotina");
    }

    private void irAoTrabalho() {
        System.out.println("Indo para o trabalho");
    }

    private void voltarParaCasa() {
        System.out.println("Voltando para casa");
    }

    private void levantar() {
        System.out.println("Levantando da cama");
    }


}
