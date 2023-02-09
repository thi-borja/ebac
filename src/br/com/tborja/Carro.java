package br.com.tborja;

/**
 * @author Thi
 * @created 09/02/2023 - 00:41
 * @project PadroesDeProjeto1
 */
public class Carro {

    Preco preco;
    Cor cor;
    Combustivel combustivel;

    public void setPreco(Preco preco) {
        this.preco = preco;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "preco=" + preco +
                ", cor=" + cor +
                ", combustivel=" + combustivel +
                '}';
    }
}
