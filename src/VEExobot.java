import java.util.Hashtable;

public class VEExobot implements FTIAlumnoEspanol, FTIAlumnoIngles {
    private int veCodigoSeguridad; 
    private int smSerieUnica;
    private ASExtremidadInferior asExtremidadInferior;
    private ASTurboReactor asTurboReactor;
    private ASFuentePoder asFuentePoder;
    private SMBrazoDerecho smBrazoDerecho;
    private SMBrazoIzquierdo smBrazoIzquierdo;

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

    public int smGetSmSerieUnica() {
        return smSerieUnica;
    }

    public void smSetSmSerieUnica(int smSerieUnica) {
        this.smSerieUnica = smSerieUnica;
    }

    public ASExtremidadInferior asGetAsExtremidadInferior() {
        return asExtremidadInferior;
    }

    public void asSetAsExtremidadInferior(ASExtremidadInferior asExtremidadInferior) {
        this.asExtremidadInferior = asExtremidadInferior;
    }

    public ASTurboReactor asGetAsTurboReactor() {
        return asTurboReactor;
    }

    public void asSetAsTurboReactor(ASTurboReactor asTurboReactor) {
        this.asTurboReactor = asTurboReactor;
    }

    public ASFuentePoder asGetAsFuentePoder() {
        return asFuentePoder;
    }

    public void asSetAsFuentePoder(ASFuentePoder asFuentePoder) {
        this.asFuentePoder = asFuentePoder;
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
<<<<<<< HEAD
=======
    
    // constructor    
    
    public VEExobot(int veCodigoSeguridad, int smSerieUnica, ASExtremidadInferior asExtremidadInferior,
        ASTurboReactor asTurboReactor, ASFuentePoder asFuentePoder, SMBrazoDerecho smBrazoDerecho,
        SMBrazoIzquierdo smBrazoIzquierdo) {
        this.veCodigoSeguridad = veCodigoSeguridad;
        this.smSerieUnica = smSerieUnica;
        this.asExtremidadInferior = asExtremidadInferior;
        this.asTurboReactor = asTurboReactor;
        this.asFuentePoder = asFuentePoder;
        this.smBrazoDerecho = smBrazoDerecho;
        this.smBrazoIzquierdo = smBrazoIzquierdo;
    }
>>>>>>> 72580bf0ff6779fd7caa7936dc4649d931eaa70e

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
