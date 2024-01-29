import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class VEIabot {
    // private ArrayList<String> lstCodigoAccion;
    // private ArrayList<String> lstCodigoUnico;

    private Hashtable<Integer, String> smMisiones;
    private int smCodigoSeguridad;
    private int smSerieUnica;
    private ASFuentePoder asFuentePoder;
    private Set<Integer> smSeriesUnicas;

    // Getter y setter
    public ASFuentePoder asGetAsFuentePoder() {
        return asFuentePoder;
    }

    public void asSetAsFuentePoder(ASFuentePoder asFuentePoder) {
        this.asFuentePoder = asFuentePoder;
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
        smSeriesUnicas = new HashSet<>();
    }


    // metodos                  
    
    public ArrayList <SMIArma> smAsignarArmas(ArrayList <SMIArma> smArmas){
        return smArmas;
    }

    public int smGenerarCodigoAleatorio() {
        Random smRandom = new Random();
        int smNumero = 0;
        while (smNumero == 0){
            for (int i = 0; i < 4; i++) {
                int digitoAleatorio = smRandom.nextInt(10); // Generar un dígito aleatorio entre 0 y 9
                smNumero = smNumero * 10 + digitoAleatorio;
            }
            for (int smSerie : smSeriesUnicas) {
                if (smSerie == smNumero){
                    smNumero = 0;
                    break;
                }
            }
        }
        smSeriesUnicas.add(smNumero);
        return smNumero;
    }

}
