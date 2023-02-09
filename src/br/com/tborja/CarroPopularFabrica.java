package br.com.tborja;

/**
 * @author Thi
 * @created 09/02/2023 - 00:34
 * @project PadroesDeProjeto1
 */
public class CarroPopularFabrica extends Fabrica{

    @Override
    public Preco darPreco() {
        return new PrecoPopular();
    }

    @Override
    public Cor pintarCor() {
        return new CorBranca();
    }

    @Override
    public Combustivel abastecerCombustivel() {
        return new CombustivelPopular();
    }
}
