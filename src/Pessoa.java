/**
 * @author Thi
 * @created 05/02/2023 - 17:03
 * @project Tarefa-Mod13
 */

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Pessoa {

    private String nome;

    private String sobrenome;

    private Set<PessoaFisica> pessoasFisicas;

    private Set<PessoaJuridica> pessoasJuridicas;

    public Pessoa() {
        this.pessoasFisicas = new HashSet<>();
        this.pessoasJuridicas = new HashSet<>();
    }

    public void add(PessoaFisica pf) {
        this.pessoasFisicas.add(pf);
    }

    public void add(PessoaJuridica pj) {
        this.pessoasJuridicas.add(pj);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
