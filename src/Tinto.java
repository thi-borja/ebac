public abstract class Tinto implements IVinho{
    //String uvas = "Cabernet Sauvignon, Carménère, Malbec, Merlot, Tempranillo, Pinot Noir, Syrah";
    String regiaoIdeal = "Italia";

    public void Avaliar(int safra, String vinicola, String uvas){
        System.out.println(vinicola);
        System.out.println(safra);
        Cheirar();
        Decantar();
        Servir();
        ContraLuz();
        System.out.println("Região: " + this.regiaoIdeal);
        System.out.println("Uvas: " + uvas);
        Acompanhamentos();
    }

    @Override
    public void Cheirar() {
        System.out.println("Aroma do vinho branco avaliado.");
    }

    @Override
    public void Decantar() {
        System.out.println("Vinho tinto decantado.");
    }

    @Override
    public void Servir() {
        System.out.println("Servido o vinho tinto fresco.");
    }

    @Override
    public void ContraLuz() {
        System.out.println("Analizado vinho tinto contra a luz.");
    }

    @Override
    public void Acompanhamentos() {
        System.out.println("Chamando o sommelier.");
    }
}
