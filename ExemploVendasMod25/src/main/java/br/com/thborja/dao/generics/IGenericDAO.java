package br.com.thborja.dao.generics;

import java.util.Collection;

import br.com.thborja.domain.Persistente;
import br.com.thborja.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericDAO <T extends Persistente> {
	
	public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;
	
	public void excluir(Long valor);
	
	public void alterar(T entity) throws TipoChaveNaoEncontradaException;
	
	public T consultar(Long valor);
	
	public Collection<T> buscarTodos();
}
