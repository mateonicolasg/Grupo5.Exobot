import java.util.ArrayList;
import java.util.Hashtable;

public class SMPatBattle {
    private VEMecatronico smMecatronico;
    private VEIabot smIabot;
    private VEExobot smExobot;
    private SMSoldado smSoldado;
    private SMExpertoEspanol smExpertoEspanol;
    private SMExpertoIngles smExpertoIngles;
    
    public void smMostrarPeloton(){
        smExpertoEspanol = new SMExpertoEspanol();
        smExpertoIngles = new SMExpertoIngles();
        Hashtable <Integer, String > smMisiones = new Hashtable<>();

        smMisiones.put(1234,"atacar");
        smMisiones.put(5678,"defender");
        smMisiones.put(9101,"sabotaje");
        smMisiones.put(1213,"infiltracion");
        smMisiones.put(1415,"rescate");

        ArrayList <String> smHabilidadesSoldados = new ArrayList<>();
        smHabilidadesSoldados.add("defender");
        smHabilidadesSoldados.add("atacar");
        smHabilidadesSoldados.add("sabotaje");
        smHabilidadesSoldados.add("infiltracion");
        smHabilidadesSoldados.add("rescate");

        smSoldado = new SMSoldado("fuerte","atacar","agil");
        smIabot = new VEIabot(smMisiones);
        smMecatronico = new VEMecatronico(smHabilidadesSoldados);


        smIabot.smSetSmCodigoSeguridad(1234);
        smIabot.smSetSmSerieUnica(3456);
        smIabot.smSetSmFuentePoder(new SMFuentePoder("alto"));

        smExobot = smMecatronico.armarExobot(smIabot.smGetSmCodigoSeguridad(),smIabot.smGetSmSerieUnica(), smSoldado.veGetVeHabilidad(), smIabot.smGetSmFuentePoder());
        
        smExpertoEspanol.smEnsenarEspanol(smExobot);

        smSoldado.smSetSmExobot(smExobot);

        smSoldado.smGetSmExobot().veRealizarMision(smSoldado.smGetSmExobot().veGetVeCodigoSeguridad(), smMisiones);
        smSoldado.smGetSmExobot().vePotencializarFuerza(smSoldado.veGetVeFuerza());
        smSoldado.smGetSmExobot().vePotencializarHabilidad(smSoldado.veGetVeHabilidad());
        smSoldado.smGetSmExobot().vePotencializarMovimiento(smSoldado.veGetVeMovimientoFisico());     

        smSoldado.smGetSmExobot().smGetSmExtremidadInferior().ftSaltar(50);
        smSoldado.smGetSmExobot().smGetSmExtremidadInferior().ftCorrer(210);
        
        smSoldado.smRecargarFuentePoder(smIabot);
        smSoldado.smReemplazarFuentePoder(smIabot);

    }
}