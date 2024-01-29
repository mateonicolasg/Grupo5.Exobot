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

    public VEExobot smArmarExobot(int smCodigo, int smSerieUnica, String smHabilidad, SMFuentePoder smFuentePoder){
        SMExtremidadInferior smExtremidadInferior = new SMExtremidadInferior();
        SMTurboReactor smTurboReactor = new SMTurboReactor();
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
        VEExobot smExobot = new VEExobot(smCodigo, smSerieUnica, smExtremidadInferior, smTurboReactor, smFuentePoder, smBrazoDerecho, smBrazoIzquierdo);
        return smExobot;
    }
<<<<<<< HEAD
}   
=======



    public void asignarCodigo(String codigo){
        System.out.println("asignando" + codigo + " unico a Exobot");
    }

}
>>>>>>> d04d8ef8107fc54ef3a312c0d4af627e7e3fd85a
