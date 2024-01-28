public class Soldado {
    private String fuerza; 
    private String habilidad; 
    private String movimientoFisico;


    // Getter y Setter
    public String getFuerza() {
        return fuerza;
    }
    public void setFuerza(String fuerza) {
        this.fuerza = fuerza;
    }
    public String getHabilidad() {
        return habilidad;
    }
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
    public String getMovimientoFisico() {
        return movimientoFisico;
    }
    public void setMovimientoFisico(String movimientoFisico) {
        this.movimientoFisico = movimientoFisico;
    } 

    // metodos
    public void recargarFuentePoder(){
        System.out.println("recargando fuente de poder agotada de exobot");
    }

    public void reemplazarFuentePoder(){
        System.out.println("reemplazando fuente de poder deteriorada de exobot");
    }

    public void sacrificarExtremidad(String extremidad){
        System.out.println("sacrificar extremidad " + extremidad);
    }
     

}
