import java.util.ArrayList;
import java.util.Hashtable;

public class SMPatBattle {
    private final int smNroSoldados = 5;

    private ArrayList <SMSoldado> smPelotonAtaque;
    private ArrayList <SMSoldado> VEPelotonDefensa;
    private ArrayList <SMSoldado> VEPelotonSabotaje;
    private ArrayList <SMSoldado> VEPelotonInfiltracion;
    private ArrayList <SMSoldado> VEPelotonRescate;
    private Hashtable <Integer, String > smMisiones;
    private SMExpertoEspanol smExpertoEspanol;
    private SMExpertoIngles smExpertoIngles;
    private VEMecatronico smMecatronico;
    private VEIabot smIabot;
    private VEExobot smExobot;
    private SMSoldado smSoldado;

    // Constructor
    public SMPatBattle() {
        // pelotones
        this.smPelotonAtaque = new ArrayList<>();
        this.VEPelotonDefensa = new ArrayList<>();
        this.VEPelotonSabotaje = new ArrayList<>();
        this.VEPelotonInfiltracion = new ArrayList<>();
        this.VEPelotonRescate = new ArrayList<>();

        this.smMisiones = new Hashtable<>();

        // misiones
        smMisiones.put(1234,"atacar");
        smMisiones.put(5678,"defender");
        smMisiones.put(9101,"sabotear");
        smMisiones.put(1213,"infiltrarse");
        smMisiones.put(1415,"rescatar");

        smIabot = new VEIabot(smMisiones);
        smMecatronico = new VEMecatronico();
        smExpertoEspanol = new SMExpertoEspanol();
        smExpertoIngles = new SMExpertoIngles();
    }

    // metodos
    public void smCrearPelotonAtacar(){
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
        smCrearPelotonAtacar();
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
    
    
    // public void smPresentarPeloton(){
    //         smExpertoEspanol = new SMExpertoEspanol();
    //         smExpertoIngles = new SMExpertoIngles();
    //         Hashtable <Integer, String > smMisiones = new Hashtable<>();
        
    //         smMisiones.put(1234,"atacar");
    //         smMisiones.put(5678,"defender");
    //         smMisiones.put(9101,"sabotaje");
    //         smMisiones.put(1213,"infiltracion");
    //         smMisiones.put(1415,"rescate");
        
    //         // ArrayList <String> smHabilidadesSoldados = new ArrayList<>();
    //         // smHabilidadesSoldados.add("defender");
    //         // smHabilidadesSoldados.add("atacar");
    //         // smHabilidadesSoldados.add("sabotaje");
    //         // smHabilidadesSoldados.add("infiltracion");
    //         // smHabilidadesSoldados.add("rescate");
        
    //         smSoldado = new SMSoldado("fuerte","atacar","agilidad");
    //         smIabot = new VEIabot(smMisiones);
    //     smMecatronico = new VEMecatronico();
    
        
    //     smIabot.smSetSmCodigoSeguridad(1234);
    //     smIabot.smSetSmSerieUnica(3456);
    //     smIabot.smSetSmFuentePoder(new SMFuentePoder("alto"));
    
    //     smExobot = smMecatronico.armarExobot(smIabot.smGetSmCodigoSeguridad(),smIabot.smGetSmSerieUnica(), smSoldado.veGetVeHabilidad(), smIabot.smGetSmFuentePoder());
    
    //     smExpertoEspanol.smEnsenarEspanol(smExobot);
    
    //     smSoldado.smSetSmExobot(smExobot);
    
    //     smSoldado.smGetSmExobot().veRealizarMision(smSoldado.smGetSmExobot().veGetVeCodigoSeguridad(), smMisiones);
    //     smSoldado.smGetSmExobot().vePotencializarFuerza(smSoldado.veGetVeFuerza());
    //     smSoldado.smGetSmExobot().vePotencializarHabilidad(smSoldado.veGetVeHabilidad());
    //     smSoldado.smGetSmExobot().vePotencializarMovimiento(smSoldado.veGetVeMovimientoFisico());     
    
    //     smSoldado.smGetSmExobot().smGetSmExtremidadInferior().ftSaltar(2);
    //     smSoldado.smGetSmExobot().smGetSmExtremidadInferior().ftCorrer(20);
    
    
    //     smSoldado.smGetSmExobot().smGetSmTurboReactor().ftVolar(smExobot.smGetSmFuentePoder());
    
    //     smSoldado.smRecargarFuentePoder(smIabot);
    //     smSoldado.smReemplazarFuentePoder(smIabot);
    
    // }
    
    // haciendo
    public void VEcrearPelotonDefender(){
        for (int smCantidadSoldados = 0; smCantidadSoldados < smNroSoldados; smCantidadSoldados++) {
            smSoldado = new SMSoldado("fuerte","defender","agilidad");
            smIabot.smSetSmCodigoSeguridad(5678);
            smIabot.smSetSmSerieUnica(smIabot.smGenerarCodigoAleatorio());
            smIabot.smSetSmFuentePoder(new SMFuentePoder("alto"));
            smExobot = smMecatronico.armarExobot(smIabot.smGetSmCodigoSeguridad(),smIabot.smGetSmSerieUnica(), smSoldado.veGetVeHabilidad(), smIabot.smGetSmFuentePoder());
            smSoldado.smSetSmExobot(smExobot);
            
            VEPelotonDefensa.add(smSoldado);
        }
    }

    public void VEmostrarPelotonDefender(){
        int smNroSoldado = 1;
        VEcrearPelotonDefender();
        System.out.println("PELOTON DE DEFENSA:");
        System.out.println("------------------------------------------------");
        for (SMSoldado VESoldadoDefensa : VEPelotonDefensa) {
            System.out.println("SOLDADO " + smNroSoldado);
            smNroSoldado++;

            // aprendiendo idiomas
            smExpertoEspanol.smEnsenarEspanol(VESoldadoDefensa.smGetSmExobot());
            smExpertoIngles.smEnsenarIngles(VESoldadoDefensa.smGetSmExobot());

            // 
            VESoldadoDefensa.smGetSmExobot().veRealizarMision(VESoldadoDefensa.smGetSmExobot().veGetVeCodigoSeguridad(), smMisiones);
            VESoldadoDefensa.smGetSmExobot().vePotencializarFuerza(VESoldadoDefensa.veGetVeFuerza());
            VESoldadoDefensa.smGetSmExobot().vePotencializarHabilidad(VESoldadoDefensa.veGetVeHabilidad());
            VESoldadoDefensa.smGetSmExobot().vePotencializarMovimiento(VESoldadoDefensa.veGetVeMovimientoFisico());     
    
            VESoldadoDefensa.smGetSmExobot().smGetSmExtremidadInferior().ftSaltar(50);
            VESoldadoDefensa.smGetSmExobot().smGetSmExtremidadInferior().ftCorrer(200);
            
            
            VESoldadoDefensa.smGetSmExobot().smGetSmTurboReactor().ftVolar(smExobot.smGetSmFuentePoder());

            VESoldadoDefensa.smGetSmExobot().smGetSmBrazoDerecho().smGetSmLanzaFuego().ftDisparar();
            VESoldadoDefensa.smGetSmExobot().smGetSmBrazoIzquierdo().smGetSmMk61().smObtenerEnergia(VESoldadoDefensa.smGetSmExobot().smGetSmFuentePoder());
            
            VESoldadoDefensa.smRecargarFuentePoder(smIabot);
            VESoldadoDefensa.smReemplazarFuentePoder(smIabot);
            System.out.println("------------------------------------------------");  
        }

    }

    public void VEcrearPelotonSabotear(){
        for (int smCantidadSoldados = 0; smCantidadSoldados < smNroSoldados; smCantidadSoldados++) {
            smSoldado = new SMSoldado("fuerte","sabotaje","agilidad");
            smIabot.smSetSmCodigoSeguridad(9101);
            smIabot.smSetSmSerieUnica(smIabot.smGenerarCodigoAleatorio());
            smIabot.smSetSmFuentePoder(new SMFuentePoder("alto"));
            smExobot = smMecatronico.armarExobot(smIabot.smGetSmCodigoSeguridad(),smIabot.smGetSmSerieUnica(), smSoldado.veGetVeHabilidad(), smIabot.smGetSmFuentePoder());
            smSoldado.smSetSmExobot(smExobot);
            
            VEPelotonSabotaje.add(smSoldado);
        }
    }

    public void VEmostrarPelotonSabotear(){
        int smNroSoldado = 1;
        VEcrearPelotonSabotear();
        System.out.println("PELOTON DE SABOTAJE:");
        System.out.println("------------------------------------------------");
        for (SMSoldado VESoldadoSabotaje : VEPelotonSabotaje) {
            System.out.println("SOLDADO " + smNroSoldado);
            smNroSoldado++;

            // aprendiendo idiomas
            smExpertoEspanol.smEnsenarEspanol(VESoldadoSabotaje.smGetSmExobot());
            smExpertoIngles.smEnsenarIngles(VESoldadoSabotaje.smGetSmExobot());

            // 
            VESoldadoSabotaje.smGetSmExobot().veRealizarMision(VESoldadoSabotaje.smGetSmExobot().veGetVeCodigoSeguridad(), smMisiones);
            VESoldadoSabotaje.smGetSmExobot().vePotencializarFuerza(VESoldadoSabotaje.veGetVeFuerza());
            VESoldadoSabotaje.smGetSmExobot().vePotencializarHabilidad(VESoldadoSabotaje.veGetVeHabilidad());
            VESoldadoSabotaje.smGetSmExobot().vePotencializarMovimiento(VESoldadoSabotaje.veGetVeMovimientoFisico());     
    
            VESoldadoSabotaje.smGetSmExobot().smGetSmExtremidadInferior().ftSaltar(50);
            VESoldadoSabotaje.smGetSmExobot().smGetSmExtremidadInferior().ftCorrer(200);
            
            
            VESoldadoSabotaje.smGetSmExobot().smGetSmTurboReactor().ftVolar(smExobot.smGetSmFuentePoder());

            // VESoldadoSabotaje.smGetSmExobot().smGetSmBrazoDerecho().smGetSmLaser().ftDisparar();
            // VESoldadoSabotaje.smGetSmExobot().smGetSmBrazoIzquierdo().smGetSmMk61().smObtenerEnergia(VESoldadoSabotaje.smGetSmExobot().smGetSmFuentePoder());
            
            VESoldadoSabotaje.smRecargarFuentePoder(smIabot);
            VESoldadoSabotaje.smReemplazarFuentePoder(smIabot);
            System.out.println("------------------------------------------------");  
        }

    }
    public void VEcrearPelotonInfiltracion(){
        for (int smCantidadSoldados = 0; smCantidadSoldados < smNroSoldados; smCantidadSoldados++) {
            smSoldado = new SMSoldado("fuerte","infiltracion","agilidad");
            smIabot.smSetSmCodigoSeguridad(1213);
            smIabot.smSetSmSerieUnica(smIabot.smGenerarCodigoAleatorio());
            smIabot.smSetSmFuentePoder(new SMFuentePoder("alto"));
            smExobot = smMecatronico.armarExobot(smIabot.smGetSmCodigoSeguridad(),smIabot.smGetSmSerieUnica(), smSoldado.veGetVeHabilidad(), smIabot.smGetSmFuentePoder());
            smSoldado.smSetSmExobot(smExobot);
            
            VEPelotonInfiltracion.add(smSoldado);
        }
    }

    public void VEmostrarPelotonInfiltracion(){
        int smNroSoldado = 1;
        VEcrearPelotonInfiltracion();
        System.out.println("PELOTON DE INFILTRACION:");
        System.out.println("------------------------------------------------");
        for (SMSoldado VESoldadoInfiltracion : VEPelotonInfiltracion) {
            System.out.println("SOLDADO " + smNroSoldado);
            smNroSoldado++;

            // aprendiendo idiomas
            smExpertoEspanol.smEnsenarEspanol(VESoldadoInfiltracion.smGetSmExobot());
            smExpertoIngles.smEnsenarIngles(VESoldadoInfiltracion.smGetSmExobot());

            // 
            VESoldadoInfiltracion.smGetSmExobot().veRealizarMision(VESoldadoInfiltracion.smGetSmExobot().veGetVeCodigoSeguridad(), smMisiones);
            VESoldadoInfiltracion.smGetSmExobot().vePotencializarFuerza(VESoldadoInfiltracion.veGetVeFuerza());
            VESoldadoInfiltracion.smGetSmExobot().vePotencializarHabilidad(VESoldadoInfiltracion.veGetVeHabilidad());
            VESoldadoInfiltracion.smGetSmExobot().vePotencializarMovimiento(VESoldadoInfiltracion.veGetVeMovimientoFisico());     
    
            VESoldadoInfiltracion.smGetSmExobot().smGetSmExtremidadInferior().ftSaltar(50);
            VESoldadoInfiltracion.smGetSmExobot().smGetSmExtremidadInferior().ftCorrer(200);
            
            
            VESoldadoInfiltracion.smGetSmExobot().smGetSmTurboReactor().ftVolar(smExobot.smGetSmFuentePoder());

            VESoldadoInfiltracion.smGetSmExobot().smGetSmBrazoDerecho().smGetSmLaser().ftDisparar();
            VESoldadoInfiltracion.smGetSmExobot().smGetSmBrazoIzquierdo();
            
            VESoldadoInfiltracion.smRecargarFuentePoder(smIabot);
            VESoldadoInfiltracion.smReemplazarFuentePoder(smIabot);
            System.out.println("------------------------------------------------");  
        }

    }
    public void VEcrearPelotonRescate(){
        for (int smCantidadSoldados = 0; smCantidadSoldados < smNroSoldados; smCantidadSoldados++) {
            smSoldado = new SMSoldado("fuerte","rescate","agilidad");
            smIabot.smSetSmCodigoSeguridad(1415);
            smIabot.smSetSmSerieUnica(smIabot.smGenerarCodigoAleatorio());
            smIabot.smSetSmFuentePoder(new SMFuentePoder("alto"));
            smExobot = smMecatronico.armarExobot(smIabot.smGetSmCodigoSeguridad(),smIabot.smGetSmSerieUnica(), smSoldado.veGetVeHabilidad(), smIabot.smGetSmFuentePoder());
            smSoldado.smSetSmExobot(smExobot);
            
            VEPelotonRescate.add(smSoldado);
        }
    }

    public void VEmostrarPelotonRescate(){
        int smNroSoldado = 1;
        VEcrearPelotonRescate();
        System.out.println("PELOTON DE RESCATE:");
        System.out.println("------------------------------------------------");
        for (SMSoldado VESoldadoRescate : VEPelotonRescate) {
            System.out.println("SOLDADO " + smNroSoldado);
            smNroSoldado++;

            // aprendiendo idiomas
            smExpertoEspanol.smEnsenarEspanol(VESoldadoRescate.smGetSmExobot());
            smExpertoIngles.smEnsenarIngles(VESoldadoRescate.smGetSmExobot());

            // 
            VESoldadoRescate.smGetSmExobot().veRealizarMision(VESoldadoRescate.smGetSmExobot().veGetVeCodigoSeguridad(), smMisiones);
            VESoldadoRescate.smGetSmExobot().vePotencializarFuerza(VESoldadoRescate.veGetVeFuerza());
            VESoldadoRescate.smGetSmExobot().vePotencializarHabilidad(VESoldadoRescate.veGetVeHabilidad());
            VESoldadoRescate.smGetSmExobot().vePotencializarMovimiento(VESoldadoRescate.veGetVeMovimientoFisico());     
    
            VESoldadoRescate.smGetSmExobot().smGetSmExtremidadInferior().ftSaltar(50);
            VESoldadoRescate.smGetSmExobot().smGetSmExtremidadInferior().ftCorrer(200);
            
            
            VESoldadoRescate.smGetSmExobot().smGetSmTurboReactor().ftVolar(smExobot.smGetSmFuentePoder());

            VESoldadoRescate.smGetSmExobot().smGetSmBrazoDerecho().smGetSmLanzaFuego().ftDisparar();
            VESoldadoRescate.smGetSmExobot().smGetSmBrazoIzquierdo().smGetSmMk61().smObtenerEnergia(VESoldadoRescate.smGetSmExobot().smGetSmFuentePoder());
            
            VESoldadoRescate.smRecargarFuentePoder(smIabot);
            VESoldadoRescate.smReemplazarFuentePoder(smIabot);
            System.out.println("------------------------------------------------");  
        }

    }
}