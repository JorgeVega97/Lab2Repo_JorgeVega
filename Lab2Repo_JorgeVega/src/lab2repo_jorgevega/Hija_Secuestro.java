package lab2repo_jorgevega;

/**
Jorge
 */
public class Hija_Secuestro extends Clase_casos {
    int CANT_IMPLICADOS;

    public Hija_Secuestro() {
        super();
    }

    public Hija_Secuestro(int CANT_IMPLICADOS, String TIPO, String ESTADO, String NOMBRE) {
        super(TIPO, ESTADO, NOMBRE);
        this.CANT_IMPLICADOS = CANT_IMPLICADOS;
    }

    public int getCANT_IMPLICADOS() {
        return CANT_IMPLICADOS;
    }

    public void setCANT_IMPLICADOS(int CANT_IMPLICADOS) {
        this.CANT_IMPLICADOS = CANT_IMPLICADOS;
    }

    @Override
    public String toString() {
        return super.toString()+ "CANTIDAD_DE_IMPLICADOS=" + CANT_IMPLICADOS;
    }
    
    
    
    
    
}
