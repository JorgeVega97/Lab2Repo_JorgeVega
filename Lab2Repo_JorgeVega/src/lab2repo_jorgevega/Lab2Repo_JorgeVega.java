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

                break;

                case 3:

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
