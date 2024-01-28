public abstract class VEExobot implements FTIAlumnoEspanol, FTIAlumnoIngles {
    private String veCodigo;

    // getter y setter
    public String getCodigo() {
        return veCodigo;
    }
    
    public void setCodigo(String veCodigo) {
        this.veCodigo = veCodigo;
    }    

    // constructor    
    public VEExobot(String veCodigo) {
        this.veCodigo = veCodigo;
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

    public void veRealizarMision(String veCodigoMision){
        
        
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
