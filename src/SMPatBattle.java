import java.util.ArrayList;
import java.util.Hashtable;

public class SMPatBattle {
    private final int smNroSoldados = 5;

    private ArrayList <SMSoldado> smPelotonAtaque;
    private Hashtable <Integer, String > smMisiones;
    private SMExpertoEspanol smExpertoEspanol;
    private SMExpertoIngles smExpertoIngles;
    private VEMecatronico smMecatronico;
    private VEIabot smIabot;
    private VEExobot smExobot;
    private SMSoldado smSoldado;

    // Constructor
    public SMPatBattle() {
        this.smPelotonAtaque = new ArrayList<>();
        this.smMisiones = new Hashtable<>();
        smMisiones.put(1234,"atacar");
        smMisiones.put(5678,"defender");
        smMisiones.put(9101,"sabotaje");
        smMisiones.put(1213,"infiltracion");
        smMisiones.put(1415,"rescate");
        smIabot = new VEIabot(smMisiones);
        smMecatronico = new VEMecatronico();
        smExpertoEspanol = new SMExpertoEspanol();
        smExpertoIngles = new SMExpertoIngles();
    }

    public void smCrearPeloton(){
        for (int smCantidadSoldados = 0; smCantidadSoldados < smNroSoldados; smCantidadSoldados++) {
            smSoldado = new SMSoldado("fuerte","atacar","agilidad");
            smIabot.smSetSmCodigoSeguridad(1234);
            smIabot.smSetSmSerieUnica(smIabot.smGenerarCodigoAleatorio());
            smIabot.smSetSmFuentePoder(new SMFuentePoder("alto"));
            smExobot = smMecatronico.armarExobot(smIabot.smGetSmCodigoSeguridad(),smIabot.smGetSmSerieUnica(), smSoldado.veGetVeHabilidad(), smIabot.smGetSmFuentePoder());
            smSoldado.smSetSmExobot(smExobot);

            smPelotonAtaque.add(smSoldado);
        }
    }
    
    public void smMostrarPeloton(){
        int smNroSoldado = 1;
        smCrearPeloton();
        System.out.println("PELOTON DE ATAQUE:");
        System.out.println("------------------------------------------------");
        for (SMSoldado smSoldadoAtaque : smPelotonAtaque) {
            System.out.println("SOLDADO " + smNroSoldado);
            smNroSoldado++;

            smExpertoEspanol.smEnsenarEspanol(smSoldadoAtaque.smGetSmExobot());
            smExpertoIngles.smEnsenarIngles(smSoldadoAtaque.smGetSmExobot());

            smSoldadoAtaque.smGetSmExobot().veRealizarMision(smSoldadoAtaque.smGetSmExobot().veGetVeCodigoSeguridad(), smMisiones);
            smSoldadoAtaque.smGetSmExobot().vePotencializarFuerza(smSoldadoAtaque.veGetVeFuerza());
            smSoldadoAtaque.smGetSmExobot().vePotencializarHabilidad(smSoldadoAtaque.veGetVeHabilidad());
            smSoldadoAtaque.smGetSmExobot().vePotencializarMovimiento(smSoldadoAtaque.veGetVeMovimientoFisico());     
    
            smSoldadoAtaque.smGetSmExobot().smGetSmExtremidadInferior().ftSaltar(50);
            smSoldadoAtaque.smGetSmExobot().smGetSmExtremidadInferior().ftCorrer(200);
    
    
            smSoldadoAtaque.smGetSmExobot().smGetSmTurboReactor().ftVolar(smExobot.smGetSmFuentePoder());

            smSoldadoAtaque.smGetSmExobot().smGetSmBrazoDerecho().smGetSmLaser().ftDisparar();
            smSoldadoAtaque.smGetSmExobot().smGetSmBrazoIzquierdo().smGetSmBazuca().smObtenerEnergia(smSoldadoAtaque.smGetSmExobot().smGetSmFuentePoder());
            
            smSoldadoAtaque.smRecargarFuentePoder(smIabot);
            smSoldadoAtaque.smReemplazarFuentePoder(smIabot);
            System.out.println("------------------------------------------------");  
        }

    }


    public void smPresentarPeloton(){
        smExpertoEspanol = new SMExpertoEspanol();
        smExpertoIngles = new SMExpertoIngles();
        Hashtable <Integer, String > smMisiones = new Hashtable<>();

        smMisiones.put(1234,"atacar");
        smMisiones.put(5678,"defender");
        smMisiones.put(9101,"sabotaje");
        smMisiones.put(1213,"infiltracion");
        smMisiones.put(1415,"rescate");

        // ArrayList <String> smHabilidadesSoldados = new ArrayList<>();
        // smHabilidadesSoldados.add("defender");
        // smHabilidadesSoldados.add("atacar");
        // smHabilidadesSoldados.add("sabotaje");
        // smHabilidadesSoldados.add("infiltracion");
        // smHabilidadesSoldados.add("rescate");

        smSoldado = new SMSoldado("fuerte","atacar","agilidad");
        smIabot = new VEIabot(smMisiones);
        smMecatronico = new VEMecatronico();


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

        smSoldado.smGetSmExobot().smGetSmExtremidadInferior().ftSaltar(2);
        smSoldado.smGetSmExobot().smGetSmExtremidadInferior().ftCorrer(20);


        smSoldado.smGetSmExobot().smGetSmTurboReactor().ftVolar(smExobot.smGetSmFuentePoder());
        
        smSoldado.smRecargarFuentePoder(smIabot);
        smSoldado.smReemplazarFuentePoder(smIabot);

    }
}