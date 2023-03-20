public abstract class Rose implements IVinho{
    String uvas = "produzido a partir de uvas tintas por diferentes estilos de vinificação.";
    String regiaoIdeal = "França";
    @Override
    public void Cheirar() {
        System.out.println("Aroma do vinho rosè avaliado.");
    }

    @Override
    public void Decantar() {
        System.out.println("Vinho rosè decantado.");
    }

    @Override
    public void Servir() {
        System.out.println("Servido o vinho rosè fresco.");
    }

    @Override
    public void ContraLuz() {
        System.out.println("Analizado vinho rosè contra a luz.");
    }

    @Override
    public void Acompanhamentos() {
        System.out.println("Chamando o sommelier.");
    }
}
