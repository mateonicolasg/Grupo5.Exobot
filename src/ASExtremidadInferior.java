public class ASExtremidadInferior implements FTICorre, FTISalta{

    private int asCapacidadSalto;
    private int asCapacidadCorrida;


    // Constructor
    
//Constructor instanciando los atributos
    public ASExtremidadInferior() {
        this.asCapacidadSalto = 50;
        this.asCapacidadCorrida = 200;
    }

//Metodos
    @Override
    public void ftSaltar(int asSaltoRequerido) {
        if (asSaltoRequerido > 50)
            System.out.println("Me es imposible saltar " + asSaltoRequerido + " m");
        else
            System.out.println("Estoy saltando " + asSaltoRequerido + " m");
    }

    @Override
    public void ftCorrer(int asVelocidadRequerida) {
        if (asVelocidadRequerida > 200)
            System.out.println("Me es imposible correr a " + asVelocidadRequerida + " km/h");
        else
            System.out.println("Estoy corriendo a " + asVelocidadRequerida + " km/h");
    }


     //Getters y setters
     public int getAsCapacidadSalto() {
		return asCapacidadSalto;
	}
	public void setAsCapacidadSalto(int asCapacidadSalto) {
		this.asCapacidadSalto = asCapacidadSalto;
	}
	public int getAsCapacidadCorrida() {
		return asCapacidadCorrida;
	}
	public void setAsCapacidadCorrida(int asCapacidadCorrida) {
		this.asCapacidadCorrida = asCapacidadCorrida;
	}
   

}
