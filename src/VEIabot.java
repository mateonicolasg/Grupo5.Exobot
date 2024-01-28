import java.util.ArrayList;
import java.util.Hashtable;

public class VEIabot {
    // private ArrayList<String> lstCodigoAccion;
    // private ArrayList<String> lstCodigoUnico;

    private Hashtable<Integer, String> smMisiones;
    private int smCodigoSeguridad;
    private int smSerieUnica;
    private SMFuentePoder smFuentePoder;

    // Getter y setter
    public SMFuentePoder smGetSmFuentePoder() {
        return smFuentePoder;
    }

    public void smSetSmFuentePoder(SMFuentePoder smFuentePoder) {
        this.smFuentePoder = smFuentePoder;
    }

    public int smGetSmSerieUnica() {
        return smSerieUnica;
    }

    public void smSetSmSerieUnica(int smSerieUnica) {
        this.smSerieUnica = smSerieUnica;
    }
    public int smGetSmCodigoSeguridad() {
        return smCodigoSeguridad;
    }

    public void smSetSmCodigoSeguridad(int smCodigoSeguridad) {
        this.smCodigoSeguridad = smCodigoSeguridad;
    }

    public Hashtable<Integer, String> smGetSmMisiones() {
        return smMisiones;
    }

    public void smSetSmMisiones(Hashtable<Integer, String> smMisiones) {
        this.smMisiones = smMisiones;
    }

    // Constructor
    public VEIabot(Hashtable<Integer, String> smMisiones) {
        this.smMisiones = smMisiones;
    }


    // metodos                  
    
    public ArrayList <SMIArma> smAsignarArmas(ArrayList <SMIArma> smArmas){
        return smArmas;
    }

}
