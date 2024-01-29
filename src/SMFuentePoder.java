public class SMFuentePoder {
    private String smNivelEnergia;

    public SMFuentePoder(String smNivelEnergia) {
        this.smNivelEnergia = smNivelEnergia;
    }

    public String smGetSmNivelEnergia() {
        return smNivelEnergia;
    }

    public void smSetSmNivelEnergia(String smNivelEnergia) {
        this.smNivelEnergia = smNivelEnergia;
    }

    public void smOtogarEnergiaArma(SMIArma smArma){
        System.out.println("Otorgando energia al arma");
    }
    public void smOtorgarEnergiaSistema(){
        System.out.println("Otorgando energia al sistema electrico del exoesqueleto");
    }
}