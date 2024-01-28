public class SMFuentePoder {
    private String smNivelEnergia;
    // Getter y setter
    public String smGetSmNivelEnergia() {
        return smNivelEnergia;
    }
    public void smSetSmNivelEnergia(String smNivelEnergia) {
        this.smNivelEnergia = smNivelEnergia;
    }
    //Constructor
    public SMFuentePoder(String smNivelEnergia) {
        this.smNivelEnergia = smNivelEnergia;
    }
    // Metodos
    public void smOtogarEnergiaArma(SMIArma smArma){
        System.out.println("Otorgando energia al arma");
    }
    public void smOtorgarEnergiaSistema(){
        System.out.println("Otorgando energia al sistema electrico del exoesqueleto");
    }
}