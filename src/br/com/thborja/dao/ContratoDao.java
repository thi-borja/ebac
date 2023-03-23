package br.com.thborja.dao;

import br.com.thborja.dao.IContratoDao;

public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Nao funciona com o banco");
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Nao funciona com o banco");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Nao funciona com o banco");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Nao funciona com o banco");
    }
}
