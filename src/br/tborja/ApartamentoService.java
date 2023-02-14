package br.tborja;

public class ApartamentoService implements IApartamentoService{
    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isCadastrado = isApartamentoCadastrado(apartamento);
        Boolean isCamposValidos = isCamposValidos(apartamento);
        if (isCadastrado && isCamposValidos) {
            return false;
        }

        return cadastrarNoBanco(apartamento);

    }

    private Boolean cadastrarNoBanco(Apartamento apartamento) {
        //logica de cadastro
        return true;
    }

    private Boolean isApartamentoCadastrado(Apartamento apartamento) {
        //verificar no banco de dados se esta cadastrado
        return false;
    }

    private Boolean isCamposValidos(Apartamento apartamento) {
        //validar cada campo (por exemplo CPF)
        return false;
    }






}
