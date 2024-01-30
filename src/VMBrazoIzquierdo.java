public class VMBrazoIzquierdo {
    private ESBazuca esBazuca;
    private ESMK61 esMk61;
 
    public VMBrazoIzquierdo(ESMK61 esMk61) {
        this.esMk61 = esMk61;
    }

    public VMBrazoIzquierdo(ESBazuca esBazuca) {
        this.esBazuca = esBazuca;
    }

    public VMBrazoIzquierdo(){}

    public ESBazuca vmGetEsBazuca() {
        return esBazuca;
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
