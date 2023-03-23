package br.com.thborja.service;

import br.com.thborja.dao.IClienteDAO;
import br.com.thborja.dao.ClienteDao;

public class ClienteService {

    private IClienteDAO clienteDao;

    public ClienteService(IClienteDAO clienteDao){
        this.clienteDao = clienteDao;
    }

    public String salvar(){
        clienteDao.salvar();
        return "Sucesso";
    }


}
