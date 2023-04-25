/**
 * 
 */
package br.com.thborja;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.thborja.domain.*;
import br.com.thborja.exceptions.TipoChaveNaoEncontradaException;
import br.com.thborja.services.*;
import br.com.thborja.dao.*;

/**
 * @author thigr
 *
 */
public class ClienteServiceTest {

	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(11111111111L);
		cliente.setNome("Thiago");
		cliente.setCidade("Ribeirao Pires");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(111);
		cliente.setTel(11999999999L);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());	
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente(){
		Cliente retorno = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());		
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException{
		cliente.setNome("Thiago Borja");
		clienteService.alterar(cliente);	
		Assert.assertEquals("Thiago Borja", cliente.getNome());
	}
	
	
}
