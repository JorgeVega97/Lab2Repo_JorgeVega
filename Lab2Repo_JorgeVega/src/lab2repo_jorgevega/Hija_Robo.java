package lab2repo_jorgevega;

/**
Jorge Vega
 */
public class Hija_Robo extends Clase_casos {
    String TIPO_ARMA;

    public Hija_Robo() {
        super();
    }

    public Hija_Robo(String TIPO_ARMA, String TIPO, String ESTADO, String NOMBRE) {
        super(TIPO, ESTADO, NOMBRE);
        this.TIPO_ARMA = TIPO_ARMA;
    }

    public String getTIPO_ARMA() {
        return TIPO_ARMA;
    }

    public void setTIPO_ARMA(String TIPO_ARMA) {
        this.TIPO_ARMA = TIPO_ARMA;
    }

    @Override
    public String toString() {
        return super.toString()+ "TIPO_ARMA=" + TIPO_ARMA;
    }
    
    
    
    
}
