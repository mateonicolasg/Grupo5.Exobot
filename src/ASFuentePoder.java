public class ASFuentePoder {
    private String asNivelEnergia;
    // Getter y setter
    public String asGetAsNivelEnergia() {
        return asNivelEnergia;
    }
    public void asSetAsNivelEnergia(String asNivelEnergia) {
        this.asNivelEnergia = asNivelEnergia;
    }
    //Constructor
    public ASFuentePoder(String asNivelEnergia) {
        this.asNivelEnergia = asNivelEnergia;
    }
    // Metodos
    public void asOtogarEnergiaArma(ESIArma esArma){
        System.out.println("Otorgando energia al arma");
    }
    public void asOtorgarEnergiaSistema(){
        System.out.println("Otorgando energia al sistema electrico del exoesqueleto");
    }
}
