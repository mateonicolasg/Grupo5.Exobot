public class SMBrazoDerecho {
    private ESLaser esLaser;
    private ESLanzaFuego esLanzaFuego;

    // Getter y setter
    
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

    public SMBrazoDerecho() {
    }

    public SMBrazoDerecho(ESLaser esLaser) {
        this.esLaser = esLaser;
    }
    
    public SMBrazoDerecho(ESLanzaFuego esLanzaFuego) {
        this.esLanzaFuego = esLanzaFuego;
    }
}
