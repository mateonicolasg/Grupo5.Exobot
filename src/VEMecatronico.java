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
        SMBrazoDerecho smBrazoDerecho = new SMBrazoDerecho();
        SMBrazoIzquierdo smBrazoIzquierdo = new SMBrazoIzquierdo();
        if (smHabilidad.equals("defender")){
            smBrazoDerecho = new SMBrazoDerecho(new ESLanzaFuego());
            smBrazoIzquierdo = new SMBrazoIzquierdo(new ESMK61());
        }
        else if (smHabilidad.equals("atacar")){
            smBrazoDerecho = new SMBrazoDerecho(new ESLaser());
            smBrazoIzquierdo = new SMBrazoIzquierdo(new ESBazuca());
        }
        else if (smHabilidad.equals("sabotaje")){
            smBrazoDerecho = new SMBrazoDerecho(new ESLaser());
            smBrazoIzquierdo = new SMBrazoIzquierdo(new ESMK61());
        }
        else if (smHabilidad.equals("infiltracion")){
            smBrazoDerecho = new SMBrazoDerecho(new ESLaser());
            smBrazoIzquierdo = new SMBrazoIzquierdo();
        }
        else if (smHabilidad.equals("rescate")){
            smBrazoDerecho = new SMBrazoDerecho(new ESLanzaFuego());
            smBrazoIzquierdo = new SMBrazoIzquierdo(new ESMK61());
        }  
        VEExobot smExobot = new VEExobot(smCodigo, smSerieUnica, asExtremidadInferior, asTurboReactor, asFuentePoder, smBrazoDerecho, smBrazoIzquierdo);
        return smExobot;
    }



    public void asignarCodigo(String codigo){
        System.out.println("asignando" + codigo + " unico a Exobot");
    }

}
