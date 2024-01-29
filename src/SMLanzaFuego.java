public class SMLanzaFuego implements FTIDispara, SMIArma {
    @Override
    public void ftDisparar() {
        System.out.println("Lanzando fuego");
    }

    @Override
    public void smObtenerEnergia(SMFuentePoder smFuentePoder) {
        System.out.println("Lanza fuego obteniendo energia y con potencia " + smFuentePoder.smGetSmNivelEnergia());
    }
}
