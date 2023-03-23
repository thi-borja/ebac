package br.com.thborja.dao;

public class ClienteDao implements IClienteDAO {

    @Override
    public String salvar(){
        throw new UnsupportedOperationException("Nao funciona sem configuracao de banco");
        //return "Sucesso";
    }

}
