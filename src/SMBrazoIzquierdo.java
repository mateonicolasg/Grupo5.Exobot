public class SMBrazoIzquierdo {
    private ESBazuca esBazuca;
    private ESMK61 esMk61;

    // Constructor 
    public SMBrazoIzquierdo(ESMK61 esMk61) {
        this.esMk61 = esMk61;
    }

    public SMBrazoIzquierdo(ESBazuca esBazuca) {
        this.esBazuca = esBazuca;
    }
    public SMBrazoIzquierdo(){}

    // Getter y setter
    public ESBazuca esGetEsBazuca() {
        return esBazuca;
    }

    public void esSetEsBazuca(ESBazuca esBazuca) {
        this.esBazuca = esBazuca;
    }

    public ESMK61 esGetEsMk61() {
        return esMk61;
    }

    public void esSetEsMk61(ESMK61 esMk61) {
        this.esMk61 = esMk61;
    }

    // public void smAdquirirArma(ESBazuca esBazuca){
    //     System.out.println("obteniendo bazuca");
    // }
    // public void smAdquirirArma(ESMK61 esMk61){
    //     System.out.println("obteniendo metralleta");
    // }
}
