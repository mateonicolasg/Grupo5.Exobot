public class SMExtremidadInferior implements FTICorre, FTISalta{
    private int smCapacidadSalto;
    private int smCapacidadCorrrida;

    public SMExtremidadInferior() {
        this.smCapacidadSalto = 50;
        this.smCapacidadCorrrida = 200;
    }

    public int getSmCapacidadSalto() {
        return smCapacidadSalto;
    }

    public void setSmCapacidadSalto(int smCapacidadSalto) {
        this.smCapacidadSalto = smCapacidadSalto;
    }

    public int getSmCapacidadCorrrida() {
        return smCapacidadCorrrida;
    }

    public void setSmCapacidadCorrrida(int smCapacidadCorrrida) {
        this.smCapacidadCorrrida = smCapacidadCorrrida;
    }

    @Override
    public void ftSaltar(int smSaltoRequerido) {
        if (smSaltoRequerido > smSaltoRequerido)
            System.out.println("Me es imposible saltar " + smSaltoRequerido + " m");
        else
            System.out.println("Estoy saltando " + smSaltoRequerido + " m");
    }

    @Override
    public void ftCorrer(int smVelocidadRequerida) {
        if (smVelocidadRequerida > smCapacidadCorrrida)
            System.out.println("Me es imposible correr a " + smVelocidadRequerida + " km/h");
        else
            System.out.println("Estoy corriendo a " + smVelocidadRequerida + " km/h");
    }
}
