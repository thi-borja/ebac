package br.tborja;

public class ExemploFacade {

    public static void main(String[] args) {
        IApartamentoService sv = new ApartamentoService();
        sv.cadastrarApartamento(new Apartamento(1L, "Rua secreta"));
    }
}
