package br.com.thborja;

/**
 * @author Thi
 * @created 30/01/2023 - 23:44
 * @project ExemplosMod9
 */

import java.util.Scanner;
public class ExercicioMod9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor tipo int:");

        int valorint = sc.nextInt();
        System.out.printf("\n%s%d\n", "PRIMITIVO -> int: ", valorint);
        Integer valorinteger = (Integer) valorint;
        System.out.printf("%s%d\n","WRAPPED -> Integer: ", valorinteger);

    }

}
