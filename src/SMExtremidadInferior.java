public class SMExtremidadInferior implements FTICorre, FTISalta{
    private int smCapacidadSalto;
    private int smCapacidadCorrida;
    //Getter y setter
    public int smGetSmCapacidadSalto() {
        return smCapacidadSalto;
    }

    public void smSetSmCapacidadSalto(int smCapacidadSalto) {
        this.smCapacidadSalto = smCapacidadSalto;
    }

    public int smGetSmCapacidadCorrida() {
        return smCapacidadCorrida;
    }

    public void smSetSmCapacidadCorrida(int smCapacidadCorrida) {
        this.smCapacidadCorrida = smCapacidadCorrida;
    }

    public SMExtremidadInferior(int smCapacidadSalto, int smCapacidadCorrida) {
        this.smCapacidadSalto = smCapacidadSalto;
        this.smCapacidadCorrida = smCapacidadCorrida;
    }

    @Override
    public void ftSaltar() {
        if (smCapacidadSalto > 50)
            System.out.println("Me es imposible saltar " + smGetSmCapacidadSalto() + " m");
        else
            System.out.println("Estoy saltando " + smGetSmCapacidadSalto()+ " m");
    }

    @Override
    public void ftCorrer() {
        if (smCapacidadSalto > 200)
            System.out.println("Me es imposible correr a" + smGetSmCapacidadSalto() + " km/h");
        else
            System.out.println("Estoy corriendo a " + smGetSmCapacidadCorrida() + " km/h");
    }

}
