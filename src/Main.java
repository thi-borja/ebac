/**
 <<<<<<< HEAD
 * @author ${USER}
 * @created ${DAY}/${MONTH}/${YEAR} - ${TIME}
 * @project ${PROJECT_NAME}
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Notas nota = new Notas();

        System.out.println("Insira a nota um:");
        nota.setNotaUm(sc.nextDouble());

        System.out.println("Insira a nota dois:");
        nota.setNotaDois(sc.nextDouble());

        System.out.println("Insira a nota tres:");
        nota.setNotaTres(sc.nextDouble());

        System.out.println("Insira a nota quatro:");
        nota.setNotaQuatro(sc.nextDouble());

        nota.setMediaNotas((nota.getNotaUm() + nota.getNotaDois() + nota.getNotaTres() + nota.getNotaQuatro()) / 4);

        System.out.printf("\n%s%.1f%s%.1f%s%.1f%s%.1f\n", "Sua notas foram: ", nota.getNotaUm(), " | ", nota.getNotaDois(), " | ", nota.getNotaTres(), " | ", nota.getNotaQuatro());
        System.out.printf("\n%s%.1f\n", "Sua media foi: ", nota.getMediaNotas());
    }
}
