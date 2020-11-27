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

                break;

                case 5:

                break;

                case 6:

                break;

                case 7:
                
                break;
  
                case 8:
                 
                break;

                case 9:
               
                break;
                default: System.out.println("LA OPCION NO ES VALIDA, VUELVA A INTENTAR");
            }}}}
