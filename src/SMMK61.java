public class SMMK61 implements FTIDispara, SMIArma {

    @Override
    public void ftDisparar() {
        System.out.println("disparando una rafaga de balas");
    }

    @Override
    public void smObtenerEnergia(SMFuentePoder smFuentePoder) {
        System.out.println("MK61 obteniendo energia");
    }

}