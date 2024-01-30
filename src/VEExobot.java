import java.util.Hashtable;

public class VEExobot implements FTIAlumnoEspanol, FTIAlumnoIngles {
    private int veCodigoSeguridad; 
    private int smSerieUnica;
    private SAExtremidadInferior smExtremidadInferior;
    private SATurboReactor smTurboReactor;
    private SAFuentePoder smFuentePoder;
    private SMBrazoDerecho smBrazoDerecho;
    private SMBrazoIzquierdo smBrazoIzquierdo;

    public VEExobot(int veCodigoSeguridad, int smSerieUnica, SAExtremidadInferior smExtremidadInferior,
        SATurboReactor smTurboReactor, SAFuentePoder smFuentePoder, SMBrazoDerecho smBrazoDerecho,
        SMBrazoIzquierdo smBrazoIzquierdo) {
        this.veCodigoSeguridad = veCodigoSeguridad;
        this.smSerieUnica = smSerieUnica;
        this.smExtremidadInferior = smExtremidadInferior;
        this.smTurboReactor = smTurboReactor;
        this.smFuentePoder = smFuentePoder;
        this.smBrazoDerecho = smBrazoDerecho;
        this.smBrazoIzquierdo = smBrazoIzquierdo;
    }

    public int smGetSmSerieUnica() {
        return smSerieUnica;
    }

    public void smSetSmSerieUnica(int smSerieUnica) {
        this.smSerieUnica = smSerieUnica;
    }

    public SAExtremidadInferior smGetSmExtremidadInferior() {
        return smExtremidadInferior;
    }

    public void asSetSmExtremidadInferior(SAExtremidadInferior asExtremidadInferior) {
        this.smExtremidadInferior = asExtremidadInferior;
    }

    public SATurboReactor smGetSmTurboReactor() {
        return smTurboReactor;
    }

    public void smSetSmTurboReactor(SATurboReactor smTurboReactor) {
        this.smTurboReactor = smTurboReactor;
    }

    public SAFuentePoder smGetSmFuentePoder() {
        return smFuentePoder;
    }

    public void smSetSmFuentePoder(SAFuentePoder asFuentePoder) {
        this.smFuentePoder = asFuentePoder;
    }

    public SMBrazoDerecho smGetSmBrazoDerecho() {
        return smBrazoDerecho;
    }

    public void smSetSmBrazoDerecho(SMBrazoDerecho smBrazoDerecho) {
        this.smBrazoDerecho = smBrazoDerecho;
    }

    public SMBrazoIzquierdo smGetSmBrazoIzquierdo() {
        return smBrazoIzquierdo;
    }

    public void smSetSmBrazoIzquierdo(SMBrazoIzquierdo smBrazoIzquierdo) {
        this.smBrazoIzquierdo = smBrazoIzquierdo;
    }

    public int veGetVeCodigoSeguridad() {
        return veCodigoSeguridad;
    }

    public void veSetVeCodigoSeguridad(int veCodigoSeguridad) {
        this.veCodigoSeguridad = veCodigoSeguridad;
    }

    public void vePotencializarFuerza(String veFuerza){
        System.out.println("potencializando fuerza del soldado");
    }

    public void vePotencializarHabilidad(String veHabilidad){
        System.out.println("potencializando " + veHabilidad + " del soldado");
    }

    public void vePotencializarMovimiento(String veMovimiento){
        System.out.println("potencializando " + veMovimiento + " del soldado");
    }

    public void veRealizarMision(int veCodigoMision, Hashtable<Integer, String> smMisiones){
        smMisiones.forEach((smK,smV)->{
            if (veCodigoMision == smK)
                System.out.println("Exobot tiene que " + smV);
        });
    }

    @Override
    public String ftAprenderEspanol() {
        return "Aprendiendo el lexico, gramatica y fonetica del espanol";
    }

    @Override
    public String ftAprenderIngles() {
        return "Aprendiendo el lexico, gramatica y fonetica del ingles";
    } 
}
