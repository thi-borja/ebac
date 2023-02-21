import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Fiat<String> fiat = new Fiat<>();
        Mitsubishi<String> mit = new Mitsubishi<>();
        Nissan<String> nis = new Nissan<>();

        String r1;
        String r2;
        String decisao;

        do {
            System.out.println("[F]IAT / [M]ITSUBISHI / [N]ISSAN ?");
            decisao = sc.nextLine();
            do {
                if (decisao.equalsIgnoreCase("F")) {
                    System.out.println("Ok! Insira o veiculo");
                    fiat.add(sc.nextLine());
                } else if (decisao.equalsIgnoreCase("M")) {
                    System.out.println("Ok! Insira o veiculo");
                    mit.add(sc.nextLine());
                } else if (decisao.equalsIgnoreCase("N")) {
                    System.out.println("Ok! Insira o veiculo");
                    nis.add(sc.nextLine());
                }

                System.out.println("Deseja adicionar carros da mesma marca? S/N");
                r1 = sc.nextLine();

            } while (r1.equalsIgnoreCase("S"));

            System.out.println("Deseja [T]rocar de marca ou [I]mprimir as listas? T/I");
            r2 = sc.nextLine();

        } while (r2.equalsIgnoreCase("T"));

        System.out.println("FIAT:\n" + fiat + '\n');
        System.out.println("MITSUBISHI:\n" + mit + '\n');
        System.out.println("NISSAN:\n" + nis + '\n');

    }
}