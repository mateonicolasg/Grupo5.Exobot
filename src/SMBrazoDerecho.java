public class SMBrazoDerecho {
    private ESLaser esLaser;
    private ESLanzaFuego esLanzaFuego;

    public SMBrazoDerecho() {
    }

    public SMBrazoDerecho(SMLaser smLaser) {
        this.smLaser = smLaser;
    }
    
    public SMBrazoDerecho(SMLanzaFuego smLanzaFuego) {
        this.smLanzaFuego = smLanzaFuego;
    }
    
    public ESLaser smGetEsLaser() {
        return esLaser;
    }

    public void smSetEsLaser(ESLaser esLaser) {
        this.esLaser = esLaser;
    }

    public ESLanzaFuego smGetEsLanzaFuego() {
        return esLanzaFuego;
    }

    public void smSetEsLanzaFuego(ESLanzaFuego esLanzaFuego) {
        this.esLanzaFuego = esLanzaFuego;
    }
<<<<<<< HEAD
}
=======

    public SMBrazoDerecho() {
    }

    public SMBrazoDerecho(ESLaser esLaser) {
        this.esLaser = esLaser;
    }
    
    public SMBrazoDerecho(ESLanzaFuego esLanzaFuego) {
        this.esLanzaFuego = esLanzaFuego;
    }
}
>>>>>>> d04d8ef8107fc54ef3a312c0d4af627e7e3fd85a
