public abstract class Exobot implements IAprendeEspanol, IAprendeIngles {
    private String VEcodigo;



    // getter y setter
    public String getCodigo() {
        return VEcodigo;
    }

    public void setCodigo(String VEcodigo) {
        this.VEcodigo = VEcodigo;
    }    

    // metodos
    public void VEpotencializarFuerza(){
        System.out.println("potencializando fuerza del soldado");
    }

    public void VEpotencializarHabilidad(String VEhabilidad){
        System.out.println("potencializando " + VEhabilidad + " del soldado");
    }

    public void VEpotencializarMovimiento(){
        System.out.println("potencializando movimiento del soldado");
    }

    public void VErealizarMision(String VEcodigoMision){
        
        
    } 



}
