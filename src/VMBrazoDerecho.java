public class VMBrazoDerecho {
    private ESLaser esLaser;
    private ESLanzaFuego esLanzaFuego;

    // Getter y setter
    
    public SMLaser vmGetEsLaser() {
        return esLaser;
    }

    public void vmSetEsLaser(SMLaser esLaser) {
        this.esLaser = esLaser;
    }

    public ESLanzaFuego vmGetEsLanzaFuego() {
        return esLanzaFuego;
    }

    public void vmSetEsLanzaFuego(ESLanzaFuego esLanzaFuego) {
        this.esLanzaFuego = esLanzaFuego;
    }

    public VMBrazoDerecho() {
    }

    public VMBrazoDerecho(SMLaser vmLaser) {
        this.vmLaser = vmLaser;
    }

    public VMBrazoDerecho(SMLanzaFuego vmLanzaFuego) {
        this.vmLanzaFuego = vmLanzaFuego;
    }   
}
