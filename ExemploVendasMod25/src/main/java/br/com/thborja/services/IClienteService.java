package br.com.thborja.services;

import br.com.thborja.domain.Cliente;
import br.com.thborja.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService{

	Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
