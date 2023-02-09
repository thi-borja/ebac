package br.com.tborja;

/**
 * @author Thi
 * @created 09/02/2023 - 00:34
 * @project PadroesDeProjeto1
 */
public class CarroEsportivoFabrica extends Fabrica{

    @Override
    public Preco darPreco() {
        return new PrecoEsportivo();
    }

    @Override
    public Cor pintarCor() {
        return new CorVermelha();
    }

    @Override
    public Combustivel abastecerCombustivel() {
        return new CombustivelEsportivo();
    }
}
