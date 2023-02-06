package br.com.tborja.dao;
import br.com.tborja.domain.Cliente;

import java.util.*;
/**
 * @author Thi
 * @created 06/02/2023 - 00:52
 * @project Projeto1
 */
public class ClienteMapDAO implements IClienteDAO {

    private Map<Long, Cliente> map;

    public ClienteMapDAO() {
        map = new TreeMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (map.containsKey(cliente.getCpf())){
            return false;
        }

        map.put(cliente.getCpf(), cliente);
        return true;
    }

    public void excluir(Long cpf) {
        Cliente clienteCadastrado = map.get(cpf);
        map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
    }

    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = map.get(cliente.getCpf());
        clienteCadastrado.setNome(cliente.getNome());
        clienteCadastrado.setTel(cliente.getTel());
        clienteCadastrado.setNumero(cliente.getNumero());
        clienteCadastrado.setEnd(cliente.getEnd());
        clienteCadastrado.setCidade(cliente.getCidade());
        clienteCadastrado.setEstado(cliente.getEstado());
    }

    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }

}
