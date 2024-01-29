import java.util.HashSet;
import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class VEIabot {

    private Hashtable<Integer, String> smMisiones;
    private Set<Integer> smSeriesUnicas;
    private int smCodigoSeguridad;
    private int smSerieUnica;
<<<<<<< HEAD
    private SMFuentePoder smFuentePoder;

    public VEIabot(Hashtable<Integer, String> smMisiones) {
        this.smMisiones = smMisiones;
        smSeriesUnicas = new HashSet<>();
    }

    public SMFuentePoder smGetSmFuentePoder() {
        return smFuentePoder;
=======
    private ASFuentePoder asFuentePoder;
    private Set<Integer> smSeriesUnicas;

    // Getter y setter
    public ASFuentePoder asGetAsFuentePoder() {
        return asFuentePoder;
>>>>>>> 72580bf0ff6779fd7caa7936dc4649d931eaa70e
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
    // metodos                  
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
