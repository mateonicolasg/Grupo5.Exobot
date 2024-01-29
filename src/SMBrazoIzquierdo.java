public class SMBrazoIzquierdo {
<<<<<<< HEAD
    private SMBazuca smBazuca;
    private SMMK61 smMk61;
 
    public SMBrazoIzquierdo(SMMK61 smMk61) {
        this.smMk61 = smMk61;
=======
    private ESBazuca esBazuca;
    private ESMK61 esMk61;

    // Constructor 
    public SMBrazoIzquierdo(ESMK61 esMk61) {
        this.esMk61 = esMk61;
>>>>>>> d04d8ef8107fc54ef3a312c0d4af627e7e3fd85a
    }

    public SMBrazoIzquierdo(ESBazuca esBazuca) {
        this.esBazuca = esBazuca;
    }

    public SMBrazoIzquierdo(){}

<<<<<<< HEAD
    public SMBazuca smGetSmBazuca() {
        return smBazuca;
=======
    // Getter y setter
    public ESBazuca smGetEsBazuca() {
        return esBazuca;
>>>>>>> d04d8ef8107fc54ef3a312c0d4af627e7e3fd85a
    }

    public void smSetEsBazuca(ESBazuca esBazuca) {
        this.esBazuca = esBazuca;
    }

    public ESMK61 smGetEsMk61() {
        return esMk61;
    }

    public void smSetEsMk61(ESMK61 esMk61) {
        this.esMk61 = esMk61;
    }
<<<<<<< HEAD
}
=======

    // public void smAdquirirArma(ESBazuca esBazuca){
    //     System.out.println("obteniendo bazuca");
    // }
    // public void smAdquirirArma(ESMK61 esMk61){
    //     System.out.println("obteniendo metralleta");
    // }
}
>>>>>>> d04d8ef8107fc54ef3a312c0d4af627e7e3fd85a
