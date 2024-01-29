import java.util.ArrayList;
public class VEMecatronico {

    private ArrayList <String> smLstHabilidades;

    public VEMecatronico(){}

    public ArrayList<String> getSmlstHabilidades() {
        return smLstHabilidades;
    }

    public void setSmlstHabilidades(ArrayList<String> smLstHabilidades) {
        this.smLstHabilidades = smLstHabilidades;
    }

<<<<<<< HEAD
    public VEExobot smArmarExobot(int smCodigo, int smSerieUnica, String smHabilidad, SMFuentePoder smFuentePoder){
        SMExtremidadInferior smExtremidadInferior = new SMExtremidadInferior();
        SMTurboReactor smTurboReactor = new SMTurboReactor();
=======
    // Constructor
    public VEMecatronico(ArrayList<String> smLstHabilidades) {
        this.smLstHabilidades = smLstHabilidades;
    }
    public VEMecatronico(){}

    // Metodos

    public VEExobot armarExobot(int smCodigo, int smSerieUnica, String smHabilidad, ASFuentePoder asFuentePoder){
        ASExtremidadInferior asExtremidadInferior = new ASExtremidadInferior();
        ASTurboReactor asTurboReactor = new ASTurboReactor();
        // SMFuentePoder smFuentePoder = new SMFuentePoder("alto");
>>>>>>> 72580bf0ff6779fd7caa7936dc4649d931eaa70e
        SMBrazoDerecho smBrazoDerecho = new SMBrazoDerecho();
        SMBrazoIzquierdo smBrazoIzquierdo = new SMBrazoIzquierdo();
        if (smHabilidad.equals("defender")){
            smBrazoDerecho = new SMBrazoDerecho(new SMLanzaFuego());
            smBrazoIzquierdo = new SMBrazoIzquierdo(new SMMK61());
        }
        else if (smHabilidad.equals("atacar")){
            smBrazoDerecho = new SMBrazoDerecho(new SMLaser());
            smBrazoIzquierdo = new SMBrazoIzquierdo(new SMBazuca());
        }
        else if (smHabilidad.equals("sabotaje")){
            smBrazoDerecho = new SMBrazoDerecho(new SMLaser());
            smBrazoIzquierdo = new SMBrazoIzquierdo(new SMMK61());
        }
        else if (smHabilidad.equals("infiltracion")){
            smBrazoDerecho = new SMBrazoDerecho(new SMLaser());
            smBrazoIzquierdo = new SMBrazoIzquierdo();
        }
        else if (smHabilidad.equals("rescate")){
            smBrazoDerecho = new SMBrazoDerecho(new SMLanzaFuego());
            smBrazoIzquierdo = new SMBrazoIzquierdo(new SMMK61());
        }  
        VEExobot smExobot = new VEExobot(smCodigo, smSerieUnica, asExtremidadInferior, asTurboReactor, asFuentePoder, smBrazoDerecho, smBrazoIzquierdo);
        return smExobot;
    }
}   