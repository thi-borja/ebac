package br.com.tborja.observer;

public class Radio implements Observer{
    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo a noticia via Radio" + subject.toString());
    }
}
