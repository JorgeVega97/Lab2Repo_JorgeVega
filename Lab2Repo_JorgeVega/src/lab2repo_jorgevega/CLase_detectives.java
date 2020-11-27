package lab2repo_jorgevega;

/**
Jorge Vega
 */
public class CLase_detectives {
    private String NOMBRE,NACIONALIDAD;
    private int EDAD,ANTIGUEDAD,NIVEL;

    public CLase_detectives(String NOMBRE, String NACI, int EDAD, int ANTIGUEDAD, int LEVEL) {
        this.NOMBRE = NOMBRE;
        this.NACIONALIDAD = NACI;
        this.EDAD = EDAD;
        this.ANTIGUEDAD = ANTIGUEDAD;
        this.NIVEL = LEVEL;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getNACIONALIDAD() {
        return NACIONALIDAD;
    }

    public void setNACIONALIDAD(String NACIONALIDAD) {
        this.NACIONALIDAD = NACIONALIDAD;
    }

    public int getEDAD() {
        return EDAD;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }

    public int getANTIGUEDAD() {
        return ANTIGUEDAD;
    }

    public void setANTIGUEDAD(int ANTIGUEDAD) {
        this.ANTIGUEDAD = ANTIGUEDAD;
    }

    public int getNIVEL() {
        return NIVEL;
    }

    public void setNIVEL(int NIVEL) {
        this.NIVEL = NIVEL;
    }
    
    
    
    @Override
    public String toString(){
        return "NOMBRE: "+NOMBRE+" EDAD: "+EDAD+" NACIONALIDAD: "+NACIONALIDAD+" ANTIGUEDAD LABORAL: "+ANTIGUEDAD+" NIVEL: "+NIVEL;
    }
}
