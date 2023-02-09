package br.com.tborja;

/**
 * @author Thi
 * @created 09/02/2023 - 00:37
 * @project PadroesDeProjeto1
 */
public class CarroLuxoFabrica extends Fabrica {
    @Override
    public Preco darPreco() {
        return new PrecoLuxo();
    }

    @Override
    public Cor pintarCor() {
        return new CorPreta();
    }

    @Override
    public Combustivel abastecerCombustivel() {
        return new CombustivelLuxo();
    }
}
