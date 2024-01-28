public class SMLanzaFuego implements FTIDispara, SMIArma {

    @Override
    public void ftDisparar() {
        System.out.println("Lanzando fuego");
    }

    @Override
    public void smObtenerEnergia() {
        System.out.println("Lanza fuego obteniendo energia");
    }
    
}