public class SMExtremidadInferior implements FTICorre, FTISalta{
    private int smCapacidadSalto;
    private int smCapacidadCorrida;

    //Getter y setter
    // public int smGetSmCapacidadSalto() {
    //     return smCapacidadSalto;
    // }

    // public void smSetSmCapacidadSalto(int smCapacidadSalto) {
    //     this.smCapacidadSalto = smCapacidadSalto;
    // }

    // public int smGetSmCapacidadCorrida() {
    //     return smCapacidadCorrida;
    // }

    // public void smSetSmCapacidadCorrida(int smCapacidadCorrida) {
    //     this.smCapacidadCorrida = smCapacidadCorrida;
    // }

    // Constructor
    public SMExtremidadInferior() {
        this.smCapacidadSalto = 50;
        this.smCapacidadCorrida = 200;
    }

    @Override
    public void ftSaltar(int smSaltoRequerido) {
        if (smSaltoRequerido > 50)
            System.out.println("Me es imposible saltar " + smSaltoRequerido + " m");
        else
            System.out.println("Estoy saltando " + smSaltoRequerido + " m");
    }

    @Override
    public void ftCorrer(int smVelocidadRequerida) {
        if (smVelocidadRequerida > 200)
            System.out.println("Me es imposible correr a " + smVelocidadRequerida + " km/h");
        else
            System.out.println("Estoy corriendo a " + smVelocidadRequerida + " km/h");
    }

}
