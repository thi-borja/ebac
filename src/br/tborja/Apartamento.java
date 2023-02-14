package br.tborja;

public class Apartamento {

    private Long codigo;

    private String end;

    public Apartamento(Long codigo, String end){
        this.codigo = codigo;
        this.end = end;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return end;
    }

    public void setEndereco(String endereco) {
        this.end = endereco;
    }
}
