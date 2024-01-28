import java.util.Hashtable;

public class VEExobot implements FTIAlumnoEspanol, FTIAlumnoIngles {
    private int veCodigoSeguridad; 

    private int smSerieUnica;
    private SMExtremidadInferior smExtremidadInferior;
    private SMTurboReactor smTurboReactor;
    private SMFuentePoder smFuentePoder;
    private SMBrazoDerecho smBrazoDerecho;
    private SMBrazoIzquierdo smBrazoIzquierdo;

    // Getter y setter

    public SMExtremidadInferior smGetSmExtremidadInferior() {
        return smExtremidadInferior;
    }

    public void smSetSmExtremidadInferior(SMExtremidadInferior smExtremidadInferior) {
        this.smExtremidadInferior = smExtremidadInferior;
    }

    public SMTurboReactor smGetSmTurboReactor() {
        return smTurboReactor;
    }

    public void smSetSmTurboReactor(SMTurboReactor smTurboReactor) {
        this.smTurboReactor = smTurboReactor;
    }

    public SMFuentePoder smGetSmFuentePoder() {
        return smFuentePoder;
    }

    public void smSetSmFuentePoder(SMFuentePoder smFuentePoder) {
        this.smFuentePoder = smFuentePoder;
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
    
    // constructor    
    
    public VEExobot(int veCodigoSeguridad, int smSerieUnica, SMExtremidadInferior smExtremidadInferior,
        SMTurboReactor smTurboReactor, SMFuentePoder smFuentePoder, SMBrazoDerecho smBrazoDerecho,
        SMBrazoIzquierdo smBrazoIzquierdo) {
        this.veCodigoSeguridad = veCodigoSeguridad;
        this.smSerieUnica = smSerieUnica;
        this.smExtremidadInferior = smExtremidadInferior;
        this.smTurboReactor = smTurboReactor;
        this.smFuentePoder = smFuentePoder;
        this.smBrazoDerecho = smBrazoDerecho;
        this.smBrazoIzquierdo = smBrazoIzquierdo;
    }

    // metodos
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
