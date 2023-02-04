/**
 * @author Thi
 * @created 04/02/2023 - 00:26
 * @project tarefa_colecoes
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parte2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Pessoa> lista = new ArrayList<Pessoa>();
        String sexo="";
        String nome="";
        Pessoa p = new Pessoa(nome, sexo);

        String resposta = "";
        System.out.println("Ola, por favor insira um nome-sexo: ");

        do {
            String insercao = sc.next();
            String[] novaInsercao = new String[1];
            novaInsercao = insercao.split("-");

            p.setNome(novaInsercao[0]);
            p.setSexo(novaInsercao[1]);

            System.out.println(p.getNome());
            System.out.println(p.getSexo());

            Pessoa nova = new Pessoa(p.getNome(), p.getSexo());
            lista.add(nova);

            System.out.println("\nDeseja inserir outro registro? [Sim/Nao]\n");
            resposta = sc.next();

            if (resposta.equalsIgnoreCase("nao")){
                continue;
            } else {
                System.out.println("Ok, por favor insira outro nome-sexo: ");
            }

        } while(resposta.equalsIgnoreCase("sim"));

        System.out.println("Ok, finalizado. ");
        int i = 0;
        System.out.println(" "+ "             NOME   |   SEXO");
        for(i=0;i< lista.size();i++){
            System.out.println(" "+ lista.get(i));
        }

    }
}
