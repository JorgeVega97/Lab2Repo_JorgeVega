package lab2repo_jorgevega;

/**
Jorge Vega
 */
public class Clase_casos {
    private String TIPO,ESTADO, NOMBRE;

    public Clase_casos(String TIPO, String ESTADO, String NOMBRE) {
        this.TIPO = TIPO;
        this.ESTADO = ESTADO;
        this.NOMBRE = NOMBRE;
    }

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    @Override
    public String toString(){
        return "TIPO: "+TIPO+" DETECTIVE A CARGO: "+NOMBRE+" ESTADO: "+ESTADO;
    }
}
