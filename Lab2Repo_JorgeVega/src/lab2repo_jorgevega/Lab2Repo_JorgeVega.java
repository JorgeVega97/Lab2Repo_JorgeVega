package lab2repo_jorgevega;

import java.util.ArrayList;
import java.util.Scanner;

/**
Jorge Vega
 */
public class Lab2Repo_JorgeVega {
public static void main(String[] args) {
        boolean op = true;
        Scanner sc = new Scanner(System.in);
        ArrayList list_detec = new ArrayList();
        ArrayList list_caso = new ArrayList();

        
        
        
        
        
        
        
        
        while (op) {
            System.out.println("1)AGREGAR UN DETECTIVE");
            System.out.println("2)ELIMINAR DETECTIVE");
            System.out.println("3)MODIFICAR DETECTIVE");
            System.out.println("4)LISTAR DTECTIVE");
            System.out.println("5)AGREGAR CASOS");
            System.out.println("6)MODIFICAR CASOS");
            System.out.println("7)LISTAR CASOS");
            System.out.println("8)LISTAR LOS CASOS RESUELTOS");
            System.out.println("9)LISTAR LOS CASOS EN PROCESO");
            System.out.println("10)SALIR");
            System.out.println("         ");
            System.out.print("ELIJA LA OPCION: ");
            int OP1 = sc.nextInt();
            switch (OP1) {
                case 1:
                    
                    
                    
                    
                    System.out.println("INGRESE NOMBRE: ");
                    String NOM = sc.next();
                    System.out.println("INGRESE EDAD: ");
                    int EDAD = sc.nextInt();
                    while(EDAD<0){
                        System.out.println("SOLO SE ACEPTAN NUMEROS POSITIVOS\n"
                                + "INTRODUZCA DE NUEVO:");
                        EDAD= sc.nextInt();
                    }System.out.println("INGRESE NACIONALIDAD: ");
                    String NACI = sc.next();
                    System.out.println("INGRSE ANTIGUEDAD LABORAL: ");
                    int ANTI = sc.nextInt();
                    while(ANTI<0){
                        System.out.println("SOLO SE ACEPTAN NUMEROS POSITIVOS\n"
                                + "INTRODUZCA DE NUEVO:");
                        ANTI= sc.nextInt();
                    }
                    System.out.println("INGRESE NIVEL: \n"
                            + "(EL RANGO ES DE 1 A 10)");
                    int ESCALA = sc.nextInt();
                    while (ESCALA < 0 || ESCALA > 10) {
                        System.out.println("ELIJA UN NUMERO ENTRE 1 Y 10: ");
                        ESCALA = sc.nextInt();
                    }
                    list_detec.add(new CLase_detectives(NOM, NACI, EDAD, ANTI, ESCALA));
                    System.out.println("SE AGREGO EL DETECTIVE DE FORMA CORRECTA");
                    break;
                    
                    
                    
                    
                    
                    
                    
                    
                case 2:
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    if(!list_detec.isEmpty()){
                        String acu="";
                        for (int i = 0; i < list_detec.size(); i++) {
                            acu += "DETECTIVES:\n" + list_detec.indexOf(list_detec.get(i)) + " - " + list_detec.get(i);
                        }System.out.print("INGRESE EL INDICE DE LA POSICION DEL DETECTIVE: ");
                        int ppp = sc.nextInt();
                        if (ppp >= 0 && ppp < list_detec.size()) {
                            String nom = ((CLase_detectives) list_detec.get(ppp)).getNOMBRE();
                            for (int i = 0; i < list_caso.size(); i++) {
                                if (((Clase_casos) list_caso.get(i)).getNOMBRE().equals(nom)) {
                                    String tipoo = ((Clase_casos) list_caso.get(i)).getTIPO();
                                    int second_Level = 1;
                                    if (tipoo == "HOMICIDIO") {
                                        int level = 1;
                                        CLase_detectives kk = ((CLase_detectives) list_detec.get(0));
                                        for (int j = 0; j < list_detec.size(); j++) {
                                            if (((CLase_detectives) list_detec.get(j)).getNIVEL() > level) {
                                                level = ((CLase_detectives) list_detec.get(j)).getNIVEL();
                                                kk = ((CLase_detectives) list_detec.get(j));
                                            }
                                        }
                                        second_Level = kk.getNIVEL() - 1;
                                        String nomm = kk.getNOMBRE();
                                        ((Clase_casos) list_caso.get(i)).setNOMBRE(nomm);
                                    }
                                    if (tipoo == "ROBO") {
                                        int level = 1;
                                        CLase_detectives D = ((CLase_detectives) list_detec.get(0));
                                        for (int j = 0; j < list_detec.size(); j++) {
                                            if (((CLase_detectives) list_detec.get(j)).getNIVEL() <= level) {
                                                level = ((CLase_detectives) list_detec.get(j)).getNIVEL();
                                                D = ((CLase_detectives) list_detec.get(j));
                                            }
                                        }
                                        String name = D.getNOMBRE();
                                        ((Clase_casos) list_caso.get(i)).setNOMBRE(name);
                                    }
                                    if (tipoo == "SECUESTRO") {
                                        boolean second = false;
                                        CLase_detectives D = ((CLase_detectives) list_detec.get(0));
                                        while (!second) {
                                            for (int j = 0; j < list_detec.size(); j++) {
                                                if (((CLase_detectives) list_detec.get(j)).getNIVEL() == second_Level) {
                                                    D = ((CLase_detectives) list_detec.get(j));
                                                    second = true;
                                                }
                                            }
                                            second_Level--;
                                        }
                                        String namm = D.getNOMBRE();
                                        ((Clase_casos) list_caso.get(i)).setNOMBRE(namm);
                                    }
                                }
                            }
                            list_detec.remove(ppp);
                            System.out.println("SE ELIMINO DE MANERA CORRECTA");
                        } else {
                            System.out.println("LA POSICION NO EXISTE");
                        }
                    }
                    if(list_detec.isEmpty()){
                        System.out.println("NO HAY DATOS EN LA LISTA, AGREGUE ELEMENTO PORFAVOR");
                    }
                    break;
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                case 3:
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    if(!list_detec.isEmpty()){
                    String lll="";
                    for (int i = 0; i < list_detec.size(); i++) {
                        lll += "DECTECTIVES:\n" + list_detec.indexOf(list_detec.get(i)) + " - " + list_detec.get(i);
                    }
                    System.out.println("1. NOMBRE\n"
                            + "2. EDAD\n"
                            + "3.NACIONALIDAD\n"
                            + "4.ANTIGUEDAD LABORAL\n"
                            + "5.Nivel\n"
                            +"ELIJA LA OPCION A MODIFICAR: ");
                    int MODIFICAR = sc.nextInt();
                    switch (MODIFICAR) {
                        case 1:
                            System.out.println("INGRESE POSICION A MODIFICAR:");
                            int posii = sc.nextInt();
                            if (posii >= 0 && posii < list_detec.size()) {
                                System.out.println("IINGRESE NOMBRE: ");
                                NOM = sc.next();
                                ((CLase_detectives) list_detec.get(posii)).setNOMBRE(NOM);
                                System.out.println("EL NOMBRE SE MODIFICO DE MANERA CORRECTA");
                            } else {
                                System.out.println("LA POSICION NO EXITE");
                            }
                        break;
                        case 2:
                            System.out.println("INGRESE EL INDICE DE LA POSICION A MODIFICAR:");
                            int po = sc.nextInt();
                            if (po >= 0 && po < list_detec.size()) {
                                System.out.println("INGRESE EDAD: ");
                                EDAD = sc.nextInt();
                                while(EDAD<0){
                                    System.out.println("SOLO SE ACEPTAN NUMEROS POSITIVOS\n"
                                + "INTRODUZCA DE NUEVO:");
                                    EDAD= sc.nextInt();
                                }
                                ((CLase_detectives) list_detec.get(po)).setEDAD(EDAD);
                                System.out.println("LA EDAD DE MODIFICO DE MANERA CORRECTA");
                            } else {
                                System.out.println("LA POSICION NO EXISTE");
                            }
                        break;
                        case 3:
                            System.out.println("INGRESE EL INDICE DE LA POSICION A MODIFICAR:");
                            int posc = sc.nextInt();
                            if (posc >= 0 && posc < list_detec.size()) {
                                System.out.println("INGRESE NACIONALIDAD: ");
                                NACI = sc.next();
                                ((CLase_detectives) list_detec.get(posc)).setNACIONALIDAD(NACI);
                                System.out.println("LA NACIONALIDAD SE MODIFICO DE FORMA CORRECTA");
                            } else {
                                System.out.println("LA POSICION NO EXISTE");
                            }
                            break;
                        case 4:
                            System.out.println("INGRESE EL INDICE DE LA POSICION A MODIFICAR:");
                            int posicion = sc.nextInt();
                            if (posicion >= 0 && posicion < list_detec.size()) {
                                System.out.println("INGRESE LA CANTIDAD DE ANOS DE ANTIGUEDAD: ");
                                ANTI = sc.nextInt();
                                while(ANTI<0){
                                    System.out.println("SOLO SE ACEPTAN NUMEROS POSITIVOS\n"
                                + "INTRODUZCA DE NUEVO:");
                                    ANTI= sc.nextInt();
                                }
                                ((CLase_detectives) list_detec.get(posicion)).setANTIGUEDAD(ANTI);
                                System.out.println("LA ANTIGUEDAD LABORAL SE MODIFICO DE MANERA CORRECTA");
                            } else {
                                System.out.println("LA POSICION NO EXISTE");
                            }
                        break;
                        case 5:
                            System.out.println("INGRESE EL INDICE DE LA POSICION QUE DESEA MODIFICAR:");
                            int poscio = sc.nextInt();
                            if (poscio >= 0 && poscio < list_detec.size()) {
                                System.out.println("INGRESE UN NIVEL DETECTIVE: ");
                                ESCALA = sc.nextInt();
                                ((CLase_detectives) list_detec.get(poscio)).setNIVEL(ESCALA);
                                System.out.println("NIVEL DE DETECTIVE SE MODIFICO DE FORMA CORRECTA");
                            } else {
                                System.out.println("LA POSICION NO EXISTE");
                            }
                        break;
                        }
                    }
                    if (list_detec.isEmpty()) {
                        System.out.println("NO HAY DATOS EN LA LISTA, AGREGUE PORFAVOR ELEMENTOS A LA LISTA");
                    }
                break;
                
                
                
                
                
                
                
                
                
                
                
                case 4:
                    
                    
                    
                    
                    
                    
                    
                    
      
                    
                    
    
                    if(!list_detec.isEmpty()){
                        String VACI = "";
                        for (int i = 0; i < list_detec.size(); i++) {
                            VACI += "DETECTIVES:\n" + list_detec.indexOf(list_detec.get(i)) + " - " + list_detec.get(i);
                        }
                        System.out.println(VACI);
                    }
                    if (list_detec.isEmpty()) {
                        System.out.println("NO HAY DATOS EN LA LISTA, AGREGUE PORFAVOR ELEMENTOS A LA LISTA");
                    }
                    break;
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                case 5:
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    System.out.println("1. HOMICIDIO\n"
                            + "2. ROBO\n"
                            + "3. SECUESTRO\n\n"
                            +"ELIJA LA EL TIPO DE CASO: ");
                    int TIPO = sc.nextInt();
                    while (TIPO<0 || TIPO>3){
                        System.out.println("POR FAVOR INGRESE UNA OPCION QUE SEA VALIDA: ");
                        TIPO = sc.nextInt();
                    }
                    String tipo = "";
                    switch (TIPO) {
                        case 1:
                            tipo = "HOMICIDIO";
                            break;
                        case 2:
                            tipo = "ROBO";
                            break;
                        case 3:
                            tipo = "SECUESTRO";
                            break;
                    }
                    System.out.println(
                            "1)EN PROCESO\n"
                            + "2)RESUELTO\n"+
                            "ELIJAN EL ESTADO DEL CASO:\n");
                    int LUGAR = sc.nextInt();
                    while (LUGAR<0 || LUGAR>2){
                        System.out.println("LA OPCION ES INCORRECTA, INGRESE UNA VALIDA");
                        LUGAR = sc.nextInt();
                    }
                    String STATUS = "";
                    switch (LUGAR) {
                        case 1:
                            STATUS = "EN PROCESO";
                            break;
                        case 2:
                            STATUS = "RESUELTO";
                            break;
                    }
                    String CARGO;
                    System.out.println("INGRESE EL INDICE DE LA POSICION DEL DETECTIVE ENCARGADO DEL CASO:    ");
                    int elemento = sc.nextInt();
                    if (elemento >= 0 && elemento < list_detec.size()) {
                        CARGO = ((CLase_detectives) list_detec.get(elemento)).getNOMBRE();
                        list_caso.add(new Clase_casos(tipo, STATUS, CARGO));
                    } else {
                        System.out.println("LA POSICION NO EXISTE");
                    }
                break;
                
                
                
                
                
                
                
                
                
                case 6:
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    if(!list_caso.isEmpty()){
                        for (int i = 0; i < list_caso.size(); i++) {
                            System.out.println((i+1)+") "+(Clase_casos)list_caso.get(i));
                        }
                        System.out.println("INGRESE EL INDICE DE LA POSICION DEL CASO QUE DESEA MODIFICAR");
                        int OP3 = sc.nextInt();
                        while(OP3<0||OP3>list_caso.size()){
                            System.out.println("LA POSICION NO EXISTE");
                            for (int i = 0; i < list_caso.size(); i++) {
                                System.out.println((i+1)+") "+(Clase_casos)list_caso.get(i));
                            }
                            System.out.println("INGRESE POSICION VALIDA");
                            OP3 = sc.nextInt();
                        }
                        System.out.println("1. TIPO DE CASO\n"
                                + "2. ESTADO\n"
                                + "3. DETECTIVE A CARGO\n"
                                + "ELIJA LA OPCION A MODIFICAR");
                        int mod = sc.nextInt();
                        switch(mod){
                            case 1:
                                for (int i = 0; i < list_detec.size(); i++) {
                                    System.out.println((i+1)+") "+list_detec.get(i));
                                }
                                System.out.println("INGRESE LA POSICION DEL ESTADO QUE QUIERE ASIGNAR");
                                int CENTI = sc.nextInt()-1;
                                while(CENTI<0||CENTI>list_detec.size()){
                                    System.out.println("LA POSICION NO EXISTE, INTENTE DE OTRA VEZ"); 
                                    CENTI = sc.nextInt()-1;
                                }
                                System.out.println("1. HOMICIDIO\n"
                                + "2. ROBO\n"
                                + "3. SECUESTRO\n"
                                + "INGRESE TIPO DE CASO");
                                int TIPE = sc.nextInt();
                                while (TIPE<0 || TIPE>3){
                                    System.out.println("ERROR, INGRESE UNA OPCION VALIDA: ");
                                    TIPE = sc.nextInt();
                                }
                                switch(TIPE){
                                    case 1:
                                        ((Clase_casos)list_caso.get(TIPE)).setTIPO("HOMICIDIO");
                                    break;
                                    case 2:
                                        ((Clase_casos)list_caso.get(TIPE)).setTIPO("ROBO");
                                    break;
                                    case 3:
                                        ((Clase_casos)list_caso.get(TIPE)).setTIPO("SECUESTRO");
                                    break;
                                }
                            break;
                            case 2:
                                for (int i = 0; i < list_detec.size(); i++) {
                                    System.out.println((i+1)+") "+list_detec.get(i));
                                }
                                System.out.println("INGRESE POSICION DEL ESTADO QUE QUIERE ASIGNAR");
                                int POSIS = sc.nextInt()-1;
                                while(POSIS<0||POSIS>list_detec.size()){
                                    System.out.println("LA POSICION NO EXISTE, INTENTE DE NUEVO");
                                    POSIS = sc.nextInt()-1;
                                }
                                System.out.println("1. EN PROCESO\n"
                                + "2. RESUELTO\n"
                                + "ELIJA EL ESTADO DEL CASO: ");
                                int NEWP = sc.nextInt();
                                if (NEWP<0 || NEWP>2){
                                    System.out.println("LA OPCION ES INVALIDA,PORFAVOR INGRESE UNA VALIDA");
                                    NEWP = sc.nextInt();
                                }
                                switch (NEWP) {
                                    case 1:
                                        ((Clase_casos)list_caso.get(NEWP)).setESTADO("EN PROCESO");
                                    break;
                                    case 2:
                                        ((Clase_casos)list_caso.get(NEWP)).setESTADO("RESUELTO");
                                    break;
                                }
                            break;
                            case 3:
                                for (int i = 0; i < list_detec.size(); i++) {
                                    System.out.println((i+1)+") "+list_detec.get(i));
                                }
                                System.out.println("INGRESE LA POSICION DEL NUEVO DETECTIVE QUE VA A ASIGANAR: ");
                                int P = sc.nextInt()-1;
                                while(P<0||P>list_detec.size()){
                                    System.out.println("LA POSICION NO EXISTE");
                                    for (int i = 0; i < list_detec.size(); i++) {
                                        System.out.println((i+1)+") "+list_detec.get(i));
                                    }
                                    System.out.println("INTRODUZCA LA POSICION OTRA VEZ");
                                    P = sc.nextInt()-1;
                                }
                                String nuevoN = ((CLase_detectives)list_detec.get(P)).getNOMBRE();
                                ((Clase_casos)list_caso.get(OP3)).setNOMBRE(nuevoN);
                                System.out.println("DETECTIVE ASIGANDO DE FORMA CORRECTA");
                            break;
                        }
                    }
                    if(list_caso.isEmpty()){
                        System.out.println("NO HAY DATOS EN LA LISTA, POR FAVOR INGRESE ELEMENTOS");
                    }
                break;
                
                
                
                
                
                
                
                
                
                
 
                

                
                
                
                
                
                case 7:
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    if(!list_caso.isEmpty()){  
                        System.out.println("HOMICIDIOS: ");
                        for (int i = 0; i < list_caso.size(); i++) {
                            if (((Clase_casos) list_caso.get(i)).getTIPO().equals("HOMICIDIO")) {
                                System.out.println(list_caso);
                            }
                        }
                        System.out.println("SECUESTROS: ");
                        for (int i = 0; i < list_caso.size(); i++) {
                            if (((Clase_casos) list_caso.get(i)).getTIPO().equals("SECUESTRO")) {
                                System.out.println(list_caso);
                            }
                        }
                        System.out.println("ROBOS: ");
                        for (int i = 0; i < list_caso.size(); i++) {
                            if (((Clase_casos) list_caso.get(i)).getTIPO().equals("ROBO")) {
                                System.out.println(list_caso);
                            }
                        }
                    }
                    if(list_caso.isEmpty()){
                        System.out.println("NO HAY DATOS EN LA LISTA, POR FAVOR INGRESE ELEMENTOS");
                    }
                break;
                
                
                
                
                
                
                
                
                
                
                
                
                case 8:
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    if (!list_caso.isEmpty()){ 
                        ArrayList<Clase_casos> RESUELTOS = new ArrayList();
                        for (int i = 0; i < list_caso.size(); i++) {
                            if (((Clase_casos)list_caso.get(i)).getESTADO().equals("RESUELTO")){
                                RESUELTOS.add((Clase_casos)list_caso.get(i));
                            }
                        }
                        System.out.println("HOMICIDIOS RESUELTOS: ");
                        int C0=1;
                        for (int i = 0; i < RESUELTOS.size(); i++) {
                            if (((Clase_casos) list_caso.get(i)).getTIPO().equals("HOMICIDIO")) {
                                System.out.println(C0+") "+list_caso);
                            }
                        }
                        System.out.println("SECUESTROS RESULTOS: ");
                        int C1=1;
                        for (int i = 0; i < RESUELTOS.size(); i++) {
                            if (((Clase_casos) list_caso.get(i)).getTIPO().equals("SECUESTRO")) {
                                System.out.println(C1+") "+list_caso);
                            }
                        }
                        System.out.println("ROBOS RESUELTOS: ");
                        int C2=1;
                        for (int i = 0; i < RESUELTOS.size(); i++) {
                            if (((Clase_casos) list_caso.get(i)).getTIPO().equals("ROBO")) {
                                System.out.println(C2+") "+list_caso);
                            }
                        }
                    }
                    if(list_caso.isEmpty()){
                        System.out.println("NO HAY DATOS EN LA LISTA, POR FAVOR INGRESE ELEMENTOS");
                    }
                break;
                
                
                
                
                
                
                
                
                
                
                case 9:
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    

                    if(!list_caso.isEmpty()){ 
                        ArrayList<Clase_casos> FALTAN = new ArrayList();
                        for (int i = 0; i < list_caso.size(); i++) {
                            if (((Clase_casos)list_caso.get(i)).getESTADO().equals("En proceso")){
                                FALTAN.add((Clase_casos)list_caso.get(i));
                            }
                        }
                        System.out.println("HOMICIDIOS EN PROCESO: ");
                        int CENTI=1;
                        for (int i = 0; i < FALTAN.size(); i++) {
                            if (((Clase_casos) list_caso.get(i)).getTIPO().equals("HOMICIDIO")) {
                                System.out.println(CENTI+") "+list_caso);
                            }
                        }
                        System.out.println("SECUESTROS EN PROCESO: ");
                        int CENTI2=1;
                        for (int i = 0; i < FALTAN.size(); i++) {
                            if (((Clase_casos) list_caso.get(i)).getTIPO().equals("SECUESTRO")) {
                                System.out.println(CENTI2+") "+list_caso);
                            }
                        }
                        System.out.println("ROBOS EN PROCESO: ");
                        int CENTI3=1;
                        for (int i = 0; i < FALTAN.size(); i++) {
                            if (((Clase_casos) list_caso.get(i)).getTIPO().equals("ROBO")) {
                                System.out.println(CENTI3+") "+list_caso);
                            }
                        }
                        if(list_caso.isEmpty()){
                            System.out.println("NO HAY DATOS EN LA LISTA, POR FAVOR INGRESE ELEMENTOS");
                        }
                    }
                    if(list_caso.isEmpty()){
                        System.out.println("NO HAY DATOS EN LA LISTA, POR FAVOR INGRESE ELEMENTOS");
                    }
                break;
                
                
                
                
                
                
                

                case 10:
                    
                    op=false;
                break;
                default: System.out.println("LA OPCION NO ES VALIDA, VUELVA A INTENTAR");
            }}}}
