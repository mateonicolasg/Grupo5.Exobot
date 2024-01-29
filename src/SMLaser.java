public class SMLaser implements FTIDispara, SMIArma {

    @Override
    public void ftDisparar() {
        System.out.println("Apuntando con un rayo laser");
    }

    @Override
    public void smObtenerEnergia(ASFuentePoder smFuentePoder) {
        System.out.println("Laser obteniendo energia y con potencia " + smFuentePoder.smGetSmNivelEnergia());
    }
    
}