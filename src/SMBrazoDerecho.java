public class SMBrazoDerecho {
    private ESLaser esLaser;
    private ESLanzaFuego esLanzaFuego;

    // Getter y setter
    
    public ESLaser esGetEsLaser() {
        return esLaser;
    }

    public void esSetEsLaser(ESLaser esLaser) {
        this.esLaser = esLaser;
    }

    public ESLanzaFuego esGetEsLanzaFuego() {
        return esLanzaFuego;
    }

    public void esSetEsLanzaFuego(ESLanzaFuego esLanzaFuego) {
        this.esLanzaFuego = esLanzaFuego;
    }

    public SMBrazoDerecho() {
    }

    public SMBrazoDerecho(ESLaser esLaser) {
        this.esLaser = esLaser;
    }
    
    public SMBrazoDerecho(ESLanzaFuego esLanzaFuego) {
        this.esLanzaFuego = esLanzaFuego;
    }
}
