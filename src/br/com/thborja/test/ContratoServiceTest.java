package br.com.thborja.test;

import br.com.thborja.dao.ContratoDao;
import br.com.thborja.dao.ContratoDaoMock;
import br.com.thborja.dao.IContratoDao;
import br.com.thborja.service.*;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest(){
        IContratoDao mock2 = new ContratoDaoMock();
        IContratoService service = new ContratoService(mock2);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoExcecaoSalvar(){
        IContratoDao mock2 = new ContratoDao();
        IContratoService service = new ContratoService(mock2);
        String retorno = service.salvar();
    }

    @Test
    public void buscarTest(){
        IContratoDao mock2 = new ContratoDaoMock();
        IContratoService service = new ContratoService(mock2);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoExcecaoBuscar(){
        IContratoDao mock2 = new ContratoDao();
        IContratoService service = new ContratoService(mock2);
        String retorno = service.buscar();
    }

    @Test
    public void excluirTest(){
        IContratoDao mock2 = new ContratoDaoMock();
        IContratoService service = new ContratoService(mock2);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoExcecaoExcluir(){
        IContratoDao mock2 = new ContratoDao();
        IContratoService service = new ContratoService(mock2);
        String retorno = service.excluir();
    }

    @Test
    public void atualizarTest(){
        IContratoDao mock2 = new ContratoDaoMock();
        IContratoService service = new ContratoService(mock2);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoExcecaoAtualizar(){
        IContratoDao mock2 = new ContratoDao();
        IContratoService service = new ContratoService(mock2);
        String retorno = service.atualizar();
    }

}
