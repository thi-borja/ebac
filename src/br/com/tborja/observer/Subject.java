package br.com.tborja.observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {

    public void add(Observer observer);

    public void remove(Observer observer);

    public void notifyAll(String titulo);

}
