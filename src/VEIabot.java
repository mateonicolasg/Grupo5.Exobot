import java.util.ArrayList;
import java.util.Hashtable;

public class VEIabot {
    // private ArrayList<String> lstCodigoAccion;
    // private ArrayList<String> lstCodigoUnico;

    private Hashtable<Integer, String> smMisiones;
    private String smCodigoSeguridad;

    // Getter y setter
    public String smGetSmCodigoSeguridad() {
        return smCodigoSeguridad;
    }

    public void smSetSmCodigoSeguridad(String smCodigoSeguridad) {
        this.smCodigoSeguridad = smCodigoSeguridad;
    }
    public Hashtable<Integer, String> getSmMisiones() {
        return smMisiones;
    }

    public void setSmMisiones(Hashtable<Integer, String> smMisiones) {
        this.smMisiones = smMisiones;
    }

    // Constructor
    public VEIabot(Hashtable<Integer, String> smMisiones) {
        this.smMisiones = new Hashtable<>();

        // Va en el App
        smMisiones.put(1234,"atacar");
        smMisiones.put(5678,"defender");
        smMisiones.put(9101,"sabotaje");
        smMisiones.put(1213,"infiltracion");
        smMisiones.put(1415,"rescate");
    }


    // metodos
    public int smOtorgarCodigoSeguridad(int smCodigo){
        return smCodigo;
    }
                                    

    
    public void implementarIdioma() {

    }



}
