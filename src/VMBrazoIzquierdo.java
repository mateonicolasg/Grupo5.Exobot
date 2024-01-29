public class VMBrazoIzquierdo {
    private VMBazuca vmBazuca;
    private VMMK61 vmMk61;

    // Constructor 
    public VMBrazoIzquierdo(VMMK61 vmMk61) {
        this.vmMk61 = vmMk61;
    }

    public VMBrazoIzquierdo(VMBazuca vmBazuca) {
        this.vmBazuca = vmBazuca;
    }
    public VMBrazoIzquierdo(){}

    // Getter y setter
    public VMBazuca vmGetVmBazuca() {
        return vmBazuca;
    }

    public void vmSetvmBazuca(VMBazuca vmBazuca) {
        this.vmBazuca = vmBazuca;
    }

    public VMMK61 vmGetvmMk61() {
        return vmMk61;
    }

    public void vmSetvmMk61(VMMK61 vmMk61) {
        this.vmMk61 = vmMk61;
    }
}