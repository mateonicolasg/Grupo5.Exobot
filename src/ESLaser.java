<<<<<<< HEAD:src/SMLaser.java
public class SMLaser implements FTIDispara, SMIArma {
=======
public class ESLaser implements FTIDispara, ESIArma {

>>>>>>> d04d8ef8107fc54ef3a312c0d4af627e7e3fd85a:src/ESLaser.java
    @Override
    public void ftDisparar() {
        System.out.println("Apuntando con un rayo laser");
        
    }
 
    @Override
<<<<<<< HEAD:src/SMLaser.java
    public void smObtenerEnergia(SMFuentePoder smFuentePoder) {
        System.out.println("Laser obteniendo energia y con potencia " + smFuentePoder.smGetSmNivelEnergia());
    }
}
=======
    public void esObtenerEnergia(ASFuentePoder asFuentePoder) {
        System.out.println("Laser obteniendo energia y con potencia " + asFuentePoder.asGetAsNivelEnergia());
    }
    
}
>>>>>>> d04d8ef8107fc54ef3a312c0d4af627e7e3fd85a:src/ESLaser.java
