package br.com.tborja.observer;

public class Demo {

    public static void main(String[] args) {
        Jornalista j = new Jornalista();
        j.add(new TV());
        j.add(new Radio());
        j.add(new Jornal());
        j.notifyAll("Teste");
    }

}
