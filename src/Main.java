import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = Pessoa.criarDez();

        Stream<Pessoa> streamMulheres = pessoas.stream().filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("Feminino"));

        streamMulheres.forEach(System.out::println);

    }
}