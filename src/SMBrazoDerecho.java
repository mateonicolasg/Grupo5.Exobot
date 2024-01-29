public class SMBrazoDerecho {
    private SMLaser smLaser;
    private SMLanzaFuego smLanzaFuego;

    public SMBrazoDerecho() {
    }

    public SMBrazoDerecho(SMLaser smLaser) {
        this.smLaser = smLaser;
    }
    
    public SMBrazoDerecho(SMLanzaFuego smLanzaFuego) {
        this.smLanzaFuego = smLanzaFuego;
    }
    
    public SMLaser smGetSmLaser() {
        return smLaser;
    }

    public void smSetSmLaser(SMLaser smLaser) {
        this.smLaser = smLaser;
    }

    public SMLanzaFuego smGetSmLanzaFuego() {
        return smLanzaFuego;
    }

    public void smSetSmLanzaFuego(SMLanzaFuego smLanzaFuego) {
        this.smLanzaFuego = smLanzaFuego;
    }
}