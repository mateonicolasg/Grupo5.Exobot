public class VMLanzaFuego implements FTIDispara, SMIArma {

    @Override
    public void ftDisparar() {
        System.out.println("Lanzando fuego");
    }

    @Override
    public void smObtenerEnergia(ASFuentePoder smFuentePoder) {
        System.out.println("Lanza fuego obteniendo energia y con potencia " + smFuentePoder.asGetAsNivelEnergia());
    }

}