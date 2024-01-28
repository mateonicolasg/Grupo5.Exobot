import java.util.Hashtable;

public abstract class VEExobot implements FTIAlumnoEspanol, FTIAlumnoIngles {
    private int veCodigoSeguridad; 

    // constructor    
    public VEExobot(int veCodigoSeguridad) {
        this.veCodigoSeguridad = veCodigoSeguridad;
    }

    // metodos
    public void vePotencializarFuerza(){
        System.out.println("potencializando fuerza del soldado");
    }

    public void vePotencializarHabilidad(String VEhabilidad){
        System.out.println("potencializando " + VEhabilidad + " del soldado");
    }

    public void vePotencializarMovimiento(){
        System.out.println("potencializando movimiento del soldado");
    }

    public void veRealizarMision(int veCodigoMision, Hashtable<Integer, String> smMisiones){
        smMisiones.forEach((smK,smV)->{
            if (veCodigoMision == smK)
                System.out.println("Exobot tiene que " + smV);
        });
    }

    @Override
    public String ftAprenderEspanol() {
        return "Aprendiendo el lexico, gramatica y fonetica del espanol";
    }

    @Override
    public String ftAprenderIngles() {
        return "Aprendiendo el lexico, gramatica y fonetica del ingles";
    } 



}
