package br.com.thborja.services;

import br.com.thborja.dao.IClienteDAO;
import br.com.thborja.domain.Cliente;
import br.com.thborja.exceptions.TipoChaveNaoEncontradaException;

public class ClienteService implements IClienteService{

	private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO dao) {
		this.clienteDAO = dao;
	}

	@Override
	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		return clienteDAO.cadastrar(cliente);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return clienteDAO.consultar(cpf);
	}

	@Override
	public void excluir(Long cpf) {
		clienteDAO.excluir(cpf);
		
	}

	@Override
	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		clienteDAO.alterar(cliente);
	}
	
	
	
}
