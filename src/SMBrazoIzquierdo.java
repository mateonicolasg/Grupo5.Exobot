public class SMBrazoIzquierdo {
    private SMBazuca smBazuca;
    private SMMK61 smMk61;

    // Constructor 
    public SMBrazoIzquierdo(SMMK61 smMk61) {
        this.smMk61 = smMk61;
    }

    public SMBrazoIzquierdo(SMBazuca smBazuca) {
        this.smBazuca = smBazuca;
    }
    public SMBrazoIzquierdo(){}

    // public void smAdquirirArma(SMBazuca smBazuca){
    //     System.out.println("obteniendo bazuca");
    // }
    // public void smAdquirirArma(SMMK61 smMk61){
    //     System.out.println("obteniendo metralleta");
    // }
}