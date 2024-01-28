public class SMBazuca implements FTIDispara, SMIArma {

    @Override
    public void ftDisparar() {
        System.out.println("Bum! La bazuca ha sido disparada");
    }

    @Override
    public void smObtenerEnergia(SMFuentePoder smFuentePoder) {
        System.out.println("Bazuca obteniendo energia");
    }

}