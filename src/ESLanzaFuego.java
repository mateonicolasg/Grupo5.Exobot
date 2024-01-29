public class ESLanzaFuego implements FTIDispara, ESIArma {

    @Override
    public void ftDisparar() {
        System.out.println("Lanzando fuego");
    }

    @Override
    public void esObtenerEnergia(ASFuentePoder smFuentePoder) {
        System.out.println("Lanza fuego obteniendo energia y con potencia " + smFuentePoder.asGetAsNivelEnergia());
    }

}
