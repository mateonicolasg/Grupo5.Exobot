public class VMBrazoDerecho {
    private VMLaser vmLaser;
    private VMLanzaFuego vmLanzaFuego;

    // Getter y setter
    
    public VMLaser vmGetVmLaser() {
        return vmLaser;
    }

    public void vmSetVmLaser(VMLaser vmLaser) {
        this.vmLaser = vmLaser;
    }

    public VMLanzaFuego vmGetVmLanzaFuego() {
        return vmLanzaFuego;
    }

    public void vmSetvmLanzaFuego(VMLanzaFuego vmLanzaFuego) {
        this.vmLanzaFuego = vmLanzaFuego;
    }

    public VMBrazoDerecho() {
    }

    public VMBrazoDerecho(VMLaser vmLaser) {
        this.vmLaser = vmLaser;
    }

    public VMBrazoDerecho(VMLanzaFuego vmLanzaFuego) {
        this.vmLanzaFuego = vmLanzaFuego;
    }   
}