public class ESLaser implements FTIDispara, ESIArma {

    @Override
    public void ftDisparar() {
        System.out.println("Apuntando con un rayo laser");
    }

    @Override
    public void smObtenerEnergia(ASFuentePoder asFuentePoder) {
        System.out.println("Laser obteniendo energia y con potencia " + asFuentePoder.asGetAsNivelEnergia());
    }
    
}
