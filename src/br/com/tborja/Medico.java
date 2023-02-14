package br.com.tborja;

public class Medico extends Trabalhador{
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como medico");
    }
}
