/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jacuela
 */
public class main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scn = new Scanner(System.in);
        boolean salir=false;
        int opcion;
        String nombre,telefono;
        
        HashMap <String, String> agenda=new HashMap();
        
        //Contacto inicial para pruebas
        agenda.put("Emergencias","112");
        agenda.put("Violencia Genero","016");
        agenda.put("AA Carmen","660112233");
        
        //Menu principal
        while(!salir){
           
           System.out.println("\n\n\n\n** EJERCICIO 3 - AGENDA **");
           System.out.println("*********************************");
           
           //Listamos la agenda con foreach
//           for(Map.Entry<String, String> elemento: agenda.entrySet()){
//                        nombre=elemento.getKey();
//                        telefono=elemento.getValue();
//                        
//                        System.out.printf("%20s --> %s\n",nombre,telefono);
//           }
           
           //Listamos con iterador
           Iterator<String> it=agenda.keySet().iterator();
           while(it.hasNext()){
               String keyNombre = it.next();
               String valueTelefono = agenda.get(keyNombre);
               System.out.printf("%20s --> %s\n",keyNombre,valueTelefono);
               
           }
           
           System.out.println("*********************************");

           System.out.println("1. Añadir contacto");
           System.out.println("2. Eliminar contacto");
           System.out.println("3. Modificar contacto");
           System.out.println("4. Ver contacto");
           System.out.println("5. Salir");
           
            
           System.out.print("Elige una opcion >");
           opcion = Integer.parseInt(scn.nextLine());
            
           switch(opcion){
               case 1:
                    System.out.println("");
                    System.out.println("Añadiendo contacto....");
                    System.out.print("Nombre: ");
                    nombre=scn.nextLine();
                    System.out.print("Telefono: ");
                    telefono=scn.nextLine();
                    agenda.put(nombre,telefono);
                    break;
               
               case 2:
                    System.out.println("");
                    System.out.print("Nombre del contacto a aliminar: ");
                    nombre=scn.nextLine();
                    agenda.remove(nombre);
                    break;

               
               case 3:
                    System.out.println("");
                    System.out.print("Nombre del contacto a modificar: ");
                    nombre=scn.nextLine();
                    if (agenda.containsKey(nombre)){
                        System.out.print("Nuevo telefono: ");
                        telefono=scn.nextLine();
                        agenda.put(nombre, telefono);
                    }
                    else {
                        System.out.println("Nombre no encontrado en la agenda");
                    } 
                    
                    break;
               
               case 4:
                    System.out.print("Nombre: ");
                    nombre=scn.nextLine();
                    telefono=agenda.get(nombre);
                    System.out.println("El telefono de <"+nombre+"> es:"+telefono); 
                    break;
             
               
                case 5:
                   salir=true;
                   break;
              
                default:
                   System.out.println("Solo números entre 1 y 6");
           }
            
       } //fin menu
        
       
        
        
        
    }
    
}
