package br.com.thborja;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.thborja.dao.*;
import br.com.thborja.domain.*;
import br.com.thborja.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDAOTest {
	
	private IClienteDAO clienteDao;
	
	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDao = new ClienteDaoMock();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException{
		cliente = new Cliente();
		cliente.setCpf(11111111111L);
		cliente.setNome("Thiago");
		cliente.setCidade("Ribeirao Pires");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(111);
		cliente.setTel(11999999999L);
		
		clienteDao.cadastrar(cliente);
	}

	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());	
		Assert.assertNotNull(clienteConsultado);
	}

	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException{
		clienteDao.cadastrar(cliente);
	}
	
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Thiago Borja");
		clienteDao.alterar(cliente);	
		Assert.assertEquals("Thiago Borja", cliente.getNome());
	}
	
}
