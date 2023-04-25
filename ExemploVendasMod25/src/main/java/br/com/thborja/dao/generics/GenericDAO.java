package br.com.thborja.dao.generics;

import br.com.thborja.domain.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;

import br.com.thborja.exceptions.TipoChaveNaoEncontradaException;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T> {
	
	private SingletonMap singletonMap;
	
	public abstract Class<T> getTipoClasse();
	
	public abstract void atualizarDados(T entity, T entityCadastrado);
	
	public GenericDAO() {
		this.singletonMap = SingletonMap.getInstance();
	}
	
	public Long getChave(T entity) throws TipoChaveNaoEncontradaException {
		Field[] fields = entity.getClass().getDeclaredFields();
		Long returnValue = null;
		for(Field field : fields) {
			if(field.isAnnotationPresent(TipoChave.class)) {
				TipoChave tipoChave = field.getAnnotation(TipoChave.class);
				String nomeMetodo = tipoChave.value();
				try	{
					Method method = entity.getClass().getMethod(nomeMetodo);
					returnValue = (Long) method.invoke(entity);
					return returnValue;
				} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
					e.printStackTrace();
					throw new TipoChaveNaoEncontradaException("Chave principal do objeto: " + entity.getClass() + " nao encontrada");
				}
			}	
		}
		if (returnValue == null) {
			String msg = "Chave principal do objeto: " + entity.getClass() + " nao encontrada";
			System.out.println("***ERRO***" + msg);
			throw new TipoChaveNaoEncontradaException(msg);
		}
		return null;
	}

	@Override
	public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException {
		//Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
		Map<Long, T> mapaInterno = (Map<Long, T>) this.singletonMap.getMap().get(getTipoClasse());
		Long chave = getChave (entity);
		if (mapaInterno.containsKey(chave)) {
			return false;
		}
		mapaInterno.put(chave, entity); 
		return true;
	}
		
	@Override
	public void excluir(Long valor) {
		//Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
		Map<Long, T> mapaInterno = (Map<Long, T>) this.singletonMap.getMap().get(getTipoClasse());
		T objetoCadastrado = mapaInterno.get(valor);
		if (objetoCadastrado != null) {
			mapaInterno.remove(valor, objetoCadastrado);
		}
	}
	
	@Override
	public void alterar (T entity) throws TipoChaveNaoEncontradaException {
		//Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
		Map<Long, T> mapaInterno = (Map<Long, T>) this.singletonMap.getMap().get(getTipoClasse());
		Long chave = getChave (entity);
		T objetoCadastrado = mapaInterno.get(chave);
		if (objetoCadastrado != null) {
			atualizarDados (entity, objetoCadastrado);
		}
	}
	
	@Override
	public T consultar(Long valor) {
		//Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
		Map<Long, T> mapaInterno = (Map<Long, T>) this.singletonMap.getMap().get(getTipoClasse());
		return mapaInterno.get(valor);
	}
	
	@Override
	public Collection<T> buscarTodos() {
		//Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
		Map<Long, T> mapaInterno = (Map<Long, T>) this.singletonMap.getMap().get(getTipoClasse());
		return mapaInterno.values();
	}
	
}
