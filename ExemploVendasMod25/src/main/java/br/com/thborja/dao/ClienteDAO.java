package br.com.thborja.dao;

import br.com.thborja.dao.generics.GenericDAO;
import br.com.thborja.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente>	implements IClienteDAO {

	public ClienteDAO() {
		super();
	}

	@Override
	public Class<Cliente> getTipoClasse() {
		// TODO Auto-generated method stub
		return Cliente.class;
	}

	@Override
	public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
		// TODO Auto-generated method stub
		
	}
	
}
