public class VMBrazoIzquierdo {
    private SMBazuca vmBazuca;
    private SMMK61 vmMk61;
 
    public VMBrazoIzquierdo(SMMK61 vmMk61) {
        this.vmMk61 = vmMk61;
    }

    public VMBrazoIzquierdo(SMBazuca vmBazuca) {
        this.vmBazuca = vmBazuca;
    }

    public VMBrazoIzquierdo(){}

    public SMBazuca vmGetVmBazuca() {
        return vmBazuca;
    }

    public void vmSetVmBazuca(SMBazuca vmBazuca) {
        this.vmBazuca = vmBazuca;
    }

    public SMMK61 vmGetVmMk61() {
        return vmMk61;
    }

    public void vmSetVmMk61(SMMK61 vmMk61) {
        this.vmMk61 = vmMk61;
    }
}
