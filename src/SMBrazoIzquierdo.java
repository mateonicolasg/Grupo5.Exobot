public class SMBrazoIzquierdo {
    private SMBazuca smBazuca;
    private SMMK61 smMk61;
 
    public SMBrazoIzquierdo(SMMK61 smMk61) {
        this.smMk61 = smMk61;
    }

    public SMBrazoIzquierdo(SMBazuca smBazuca) {
        this.smBazuca = smBazuca;
    }

    public SMBrazoIzquierdo(){}

    public SMBazuca smGetSmBazuca() {
        return smBazuca;
    }

    public void smSetSmBazuca(SMBazuca smBazuca) {
        this.smBazuca = smBazuca;
    }

    public SMMK61 smGetSmMk61() {
        return smMk61;
    }

    public void smSetSmMk61(SMMK61 smMk61) {
        this.smMk61 = smMk61;
    }
}