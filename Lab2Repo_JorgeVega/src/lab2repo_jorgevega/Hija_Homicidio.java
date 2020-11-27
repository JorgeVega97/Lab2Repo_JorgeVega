package lab2repo_jorgevega;
/**
Jorge Vega
 */
public class Hija_Homicidio extends Clase_casos{
    
    String LUGAR= "";

    public Hija_Homicidio() {
        super();
    }

    public Hija_Homicidio(String LUGAR,String TIPO, String ESTADO, String NOMBRE) {
        super(TIPO, ESTADO, NOMBRE);
        this.LUGAR=LUGAR;
    }

    public String getLUGAR() {
        return LUGAR;
    }

    public void setLUGAR(String LUGAR) {
        this.LUGAR = LUGAR;
    }

    @Override
    public String toString() {
        return super.toString()+ "LUGAR=" + LUGAR;
    }

    
    
    
   
    
}
