import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {
        ArrayList<Pessoa> pessoas = Pessoa.criarDez();

        Stream<Pessoa> streamMulheres = pessoas.stream().filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("Feminino"));

        streamMulheres.forEach(pessoa -> Assert.assertTrue(pessoa.getSexo().equalsIgnoreCase("Feminino")));
    }
}