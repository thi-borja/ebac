public class Barolo2017 extends Tinto {

    public Barolo2017(int safra, String vinicola, String uvas) {
        Avaliar(safra, vinicola, uvas);
    }

    String uvas = "Nebbiolo";

    @Override
    public void Servir() {
        super.Servir();
        System.out.println("Este é um Antiche Cantine Dei Marchesi Di Barolo Barolo DOCG 2017");
    }
}
