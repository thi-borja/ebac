/**
 * @author ${USER}
 * @created ${DAY}/${MONTH}/${YEAR} - ${TIME}
 * @project ${PROJECT_NAME}
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Pessoa> lista = new ArrayList<Pessoa>();

        String resposta = "";
        System.out.println("Ola, por favor insira um nome-sexo: ");

        do {
            String sexo="";
            String nome="";
            Pessoa p = new Pessoa(nome, sexo);
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
        System.out.println(lista);

    }
}