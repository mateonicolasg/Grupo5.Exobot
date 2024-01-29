<<<<<<< HEAD:src/SMLanzaFuego.java
public class SMLanzaFuego implements FTIDispara, SMIArma {
=======
public class ESLanzaFuego implements FTIDispara, ESIArma {

>>>>>>> d04d8ef8107fc54ef3a312c0d4af627e7e3fd85a:src/ESLanzaFuego.java
    @Override
    public void ftDisparar() {
        System.out.println("Lanzando fuego");
    }

    @Override
<<<<<<< HEAD:src/SMLanzaFuego.java
    public void smObtenerEnergia(SMFuentePoder smFuentePoder) {
        System.out.println("Lanza fuego obteniendo energia y con potencia " + smFuentePoder.smGetSmNivelEnergia());
    }
}
=======
    public void esObtenerEnergia(ASFuentePoder smFuentePoder) {
        System.out.println("Lanza fuego obteniendo energia y con potencia " + smFuentePoder.asGetAsNivelEnergia());
    }

}
>>>>>>> d04d8ef8107fc54ef3a312c0d4af627e7e3fd85a:src/ESLanzaFuego.java
