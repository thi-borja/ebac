public abstract class Branco implements IVinho {

    String uvas = "Chardonnay, Sauvignon Blanc";
    String regiaoIdeal = "Italia";

    @Override
    public void Cheirar() {
        System.out.println("Aroma do vinho branco avaliado.");
    }

    @Override
    public void Decantar() {
        System.out.println("Vinho branco decantado.");
    }

    @Override
    public void Servir() {
        System.out.println("Servido o vinho branco gelado.");
    }

    @Override
    public void ContraLuz() {
        System.out.println("Analizado vinho branco contra a luz.");
    }

    @Override
    public void Acompanhamentos() {
        System.out.println("Chamando o sommelier.");
    }
}
