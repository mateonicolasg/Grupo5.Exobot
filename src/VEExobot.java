import java.util.Hashtable;

public class VEExobot implements FTIAlumnoEspanol, FTIAlumnoIngles {
    private int veCodigoSeguridad; 

    private int smSerieUnica;
    private ASExtremidadInferior asExtremidadInferior;
    private ASTurboReactor asTurboReactor;
    private ASFuentePoder asFuentePoder;
    private VMBrazoDerecho vmBrazoDerecho;
    private VMBrazoIzquierdo vmBrazoIzquierdo;

    // Getter y setter

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

    public VMBrazoDerecho vmGetVmBrazoDerecho() {
        return vmBrazoDerecho;
    }

    public void vmSetVmBrazoDerecho(VMBrazoDerecho vmBrazoDerecho) {
        this.vmBrazoDerecho = vmBrazoDerecho;
    }

    public VMBrazoIzquierdo vmGetVmBrazoIzquierdo() {
        return vmBrazoIzquierdo;
    }

    public void vmSetVMBrazoIzquierdo(VMBrazoIzquierdo vmBrazoIzquierdo) {
        this.vmBrazoIzquierdo = vmBrazoIzquierdo;
    }

    public int veGetVeCodigoSeguridad() {
        return veCodigoSeguridad;
    }

    public void veSetVeCodigoSeguridad(int veCodigoSeguridad) {
        this.veCodigoSeguridad = veCodigoSeguridad;
    }
    
    // constructor    
    
    public VEExobot(int veCodigoSeguridad, int smSerieUnica, ASExtremidadInferior asExtremidadInferior,
        ASTurboReactor asTurboReactor, ASFuentePoder asFuentePoder, VMBrazoDerecho vmBrazoDerecho,
        VMBrazoIzquierdo vmBrazoIzquierdo) {
        this.veCodigoSeguridad = veCodigoSeguridad;
        this.smSerieUnica = smSerieUnica;
        this.asExtremidadInferior = asExtremidadInferior;
        this.asTurboReactor = asTurboReactor;
        this.asFuentePoder = asFuentePoder;
        this.vmBrazoDerecho = vmBrazoDerecho;
        this.vmBrazoIzquierdo = vmBrazoIzquierdo;
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
