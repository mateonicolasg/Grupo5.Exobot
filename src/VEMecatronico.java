import java.util.ArrayList;

public class VEMecatronico {

    private ArrayList <String> smLstHabilidades;

    // Getter y setter
    public ArrayList<String> getSmlstHabilidades() {
        return smLstHabilidades;
    }

    public void setSmlstHabilidades(ArrayList<String> smLstHabilidades) {
        this.smLstHabilidades = smLstHabilidades;
    }

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
        VMBrazoDerecho vmBrazoDerecho = new VMBrazoDerecho();
        VMBrazoIzquierdo vmBrazoIzquierdo = new VMBrazoIzquierdo();
        if (smHabilidad.equals("defender")){
            vmBrazoDerecho = new VMBrazoDerecho(new VMLanzaFuego());
            vmBrazoIzquierdo = new VMBrazoIzquierdo(new VMMK61());
        }
        else if (smHabilidad.equals("atacar")){
            vmBrazoDerecho = new VMBrazoDerecho(new VMLaser());
            vmBrazoIzquierdo = new VMBrazoIzquierdo(new VMBazuca());
        }
        else if (smHabilidad.equals("sabotaje")){
            vmBrazoDerecho = new VMBrazoDerecho(new VMLaser());
            vmBrazoIzquierdo = new VMBrazoIzquierdo(new VMMK61());
        }
        else if (smHabilidad.equals("infiltracion")){
            vmBrazoDerecho = new VMBrazoDerecho(new VMLaser());
            vmBrazoIzquierdo = new VMBrazoIzquierdo();
        }
        else if (smHabilidad.equals("rescate")){
            vmBrazoDerecho = new VMBrazoDerecho(new VMLanzaFuego());
            vmBrazoIzquierdo = new VMBrazoIzquierdo(new VMMK61());
        }  
        VEExobot smExobot =  new VEExobot(smCodigo, smSerieUnica, asExtremidadInferior, asTurboReactor, asFuentePoder, vmBrazoDerecho, vmBrazoIzquierdo);
        return smExobot;
    }



    public void asignarCodigo(String codigo){
        System.out.println("asignando" + codigo + " unico a Exobot");
    }

}