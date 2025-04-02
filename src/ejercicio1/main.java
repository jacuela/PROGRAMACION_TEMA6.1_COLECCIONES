/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author jacuela
 */
public class main {

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn = new Scanner(System.in);
        
        boolean salir=false;
        int opcion;
        String dni, nombre;
        int edad;
        
        ArrayList <Persona> listaPersonas=new ArrayList();
        
        //meto algunos datos de prueba
        listaPersonas.add(new Persona("5555A","Mortadelo",18));
        listaPersonas.add(new Persona("4444A","Filemon",17));
        listaPersonas.add(new Persona("1111A","Abad",30));

        
      
        //Para poder usar este método, antes tiene la clase Persona que implementar
        //la interfaz Comparable
        Collections.sort(listaPersonas);
        
        
        //Menu principal
        while(!salir){
           
           System.out.println("\n\n    EJERCICIO 1 - ARRAYLIST PERSONAS ");
           System.out.println("============================================");
           //Ordeno la lista. Para poder hacer esto, Persona tiene que
           //implementar el método compareTo()
           Collections.sort(listaPersonas);

           //Imprimo la lista personas con foreach. Al estar el método
           //toString() implementado, puedo imprimir directamente
           //la persona con el System.out.println(p)
           for (Persona p : listaPersonas) {
                System.out.println(p);
           }
           System.out.println("============================================");
           System.out.println("1. Añadir Persona");
           System.out.println("2. Eliminar Persona");
           System.out.println("3. Salir");
            
           System.out.print("Elige una opcion >");
           opcion = Integer.parseInt(scn.nextLine());
            
           switch(opcion){
               case 1:
                    System.out.println("");
                    System.out.println("Añadiendo una nueva persona....");
                    System.out.print("DNI: ");
                    dni=scn.nextLine();
                    System.out.print("Nombre: ");
                    nombre=scn.nextLine();
                    System.out.print("Edad: ");
                    edad=Integer.parseInt(scn.nextLine());
                    
                    //Compruebo si existe
                    boolean existe = false;
                    for (Persona p : listaPersonas) {
                       if (p.getDni().equalsIgnoreCase(dni)){
                           existe = true;
                           System.out.println("ERROR: ya existe dicho DNI");
                       }
                    }
                    if (!existe){
                        listaPersonas.add(new Persona(dni,nombre,edad));
                    }
                    break;
               
               case 2:
                    System.out.println("");
                    System.out.println("Eliminar persona....");
                    System.out.print("DNI de la persona a eliminar: ");
                    dni=scn.nextLine();
                    
                    Boolean ok=eliminarPersona(dni, listaPersonas);
                    
                    if (ok) System.out.println("\033[32mPersona eliminada.\033[30m");
                    else System.out.println("\033[31mNo se encuentra dicha persona. \033[30m");
                    
                    break;

               
               case 3:
                    System.out.println("");
                    System.out.println("Mostrando datos de persona....");
                    System.out.print("DNI de la persona a buscar: ");
                    boolean encontrado=false;
                    dni=scn.nextLine();
                    
                    for (int i = 0; i < listaPersonas.size(); i++) {
                     
                        if (listaPersonas.get(i).getDni().equals(dni)){
                            listaPersonas.get(i).imprimirDetalles();
                            encontrado=true;
                        }
                    }
                   
                    if (!encontrado) 
                        System.out.println("\033[31mNo se encuentra dicha persona. \033[30m");
                    
                    break;
               
                case 4:
                   salir=true;
                   break;
              
                default:
                   System.out.println("Solo números entre 1 y 5");
           }
            
       } //fin menu
        
        
    }
    
    
    private static boolean eliminarPersona(String dni,ArrayList<Persona> listaPersonas){
                    
        for (int i = 0; i < listaPersonas.size(); i++) {
                     
                        if (listaPersonas.get(i).getDni().equals(dni)){
                            listaPersonas.remove(i);
                            return true; //cuando elimino, tengo que irme.
                            
                        }
                    
        }
        return false;
        
        
        
        
    }
    
    
    
    
    
}
