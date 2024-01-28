import java.util.ArrayList;

public class Mecatronico {


    public void armarExobot(String instruccion, int smSerieUnica){
        System.out.println("armando exobot con la " + instruccion + " de IAbot");
    }

    public void personalizarExobot(String habilidad, ArrayList <SMIArma> smArmas){
        System.out.println("personalizando traje de exobot con la " + habilidad + " correspondiente del soladado");
    }

    public void asignarCodigo(String codigo){
        System.out.println("asignando" + codigo + " unico a Exobot");
    }

}