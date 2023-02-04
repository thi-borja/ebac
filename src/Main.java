/**
 * @author ${USER}
 * @created ${DAY}/${MONTH}/${YEAR} - ${TIME}
 * @project ${PROJECT_NAME}
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String resposta = "";
        System.out.println("Ola, por favor insira nomes divididos por vírgulas: ");

        String insercao = sc.next();
        String[] data = insercao.split(",");
        int aux = 0;
        int i = 0;

        Arrays.sort(data);

        for(i=0;i< data.length;i++){
            System.out.println(" "+data[i]);
        }
    }
}