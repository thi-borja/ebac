package br.com.tborja.dao;

import br.com.tborja.domain.Cliente;

import java.util.Collection;
import java.util.List;

/**
 * @author Thi
 * @created 06/02/2023 - 00:52
 * @project Projeto1
 */
public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();

}


