public class VMBrazoDerecho {
    private SMLaser vmLaser;
    private SMLanzaFuego vmLanzaFuego;

    // Getter y setter
    
    public SMLaser vmGetVmLaser() {
        return vmLaser;
    }

    public void vmSetVmLaser(SMLaser vmLaser) {
        this.vmLaser = vmLaser;
    }

    public SMLanzaFuego vmGetVmLanzaFuego() {
        return vmLanzaFuego;
    }

    public void vmSetVmLanzaFuego(SMLanzaFuego vmLanzaFuego) {
        this.vmLanzaFuego = vmLanzaFuego;
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