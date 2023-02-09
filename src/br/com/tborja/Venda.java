package br.com.tborja;

/**
 * @author Thi
 * @created 09/02/2023 - 00:40
 * @project PadroesDeProjeto1
 */

public class Venda {

    private static Carro montarCarro(String car){
        Fabrica fc = null;
        switch(car){
            case "popular":
                fc = new CarroPopularFabrica();
            case "esportivo":
                fc = new CarroEsportivoFabrica();
            case "luxo":
                fc = new CarroLuxoFabrica();
        }
        Carro carro = new Carro();
        carro.setCor(fc.pintarCor());
        carro.setCombustivel(fc.abastecerCombustivel());
        carro.setPreco(fc.darPreco());
        return carro;
    }

    public static void main(String[] args) {
        System.out.println("Bem vindo(a) a nossa fabrica de carros!");
        Carro car = montarCarro("esportivo");
        System.out.println("Agradecemos sua visita =]");
        System.out.println(car.toString());

    }

}
