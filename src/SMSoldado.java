public class SMSoldado {
    private String veFuerza; 
    private String veHabilidad; 
    private String veMovimientoFisico;


    // Getter y Setter
    public String getFuerza() {
        return veFuerza;
    }
    public void setFuerza(String veFuerza) {
        this.veFuerza = veFuerza;
    }
    public String getHabilidad() {
        return veHabilidad;
    }
    public void setHabilidad(String veHabilidad) {
        this.veHabilidad = veHabilidad;
    }
    public String getMovimientoFisico() {
        return veMovimientoFisico;
    }
    public void setMovimientoFisico(String veMovimientoFisico) {
        this.veMovimientoFisico = veMovimientoFisico;
    } 

    // metodos
    public void smRecargarFuentePoder(VEIabot veIabot){
        System.out.println("recargando fuente de poder agotada de exobot");
    }

    public void smReemplazarFuentePoder(VEIabot veIabot){
        System.out.println("reemplazando fuente de poder deteriorada de exobot");
    }

    public void veSacrificarExtremidad(){
        System.out.println("sacrificar extremidades inferiores ");
    }
     

}
