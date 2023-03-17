import java.lang.annotation.Annotation;

public class Main {
    @TabelaUm(nomeTabela = "Tabela Um")
    public static void main(String[] args) {

        //Instancio a variavel tab para a classe UseReflection, assim acesso os metodos de reflection.
        UseReflection tab = new UseReflection() {
        };

        System.out.println(tab.nomeTabela()); //Imprime o nome da tabela
    }
}