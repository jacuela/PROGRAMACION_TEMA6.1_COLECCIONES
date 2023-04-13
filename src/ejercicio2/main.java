/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
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
        String matricula, propietario;
        Ferry ferry1=new Ferry("Ferry AMORES");
       
        
        ferry1.embarcar("1111A", "Pedro");
        ferry1.embarcar("2222A", "Celia");
        
        
        
        
        
        
        //Menu principal
        while(!salir){
           
           System.out.println("\n\n\n\n** EJERCICIO 2 - ARRAYLIST FERRY **");
           System.out.println("*********************************");
           
           System.out.println("1. Embarcar vehiculo");
           System.out.println("2. Desembarcar vehiculo");
           System.out.println("3. Datos de un vehiculo embarcado");
           System.out.println("4. Listar vehiculos embarcados");
           System.out.println("5. Salir");
            
           System.out.print("Elige una opcion >");
           opcion = Integer.parseInt(scn.nextLine());
            
           switch(opcion){
               case 1:
                    System.out.println("");
                    System.out.println("Embarcando un nuevo vehiculo....");
                    System.out.print("Matricula: ");
                    matricula=scn.nextLine();
                    System.out.print("Propietario: ");
                    propietario=scn.nextLine();
                    
                    if (ferry1.embarcar(matricula, propietario))
                        System.out.println("\033[32mVehiculo ["+matricula+"] embarcado.\033[30m");
                    else
                        System.out.println("\033[31mVehiculo ["+matricula+"] ya esta embarcado.\033[30m");
                   
                    break;
               
               case 2:
                    System.out.println("");
                    System.out.println("Desembarcando un vehiculo....");
                    System.out.print("Matricula: ");
                    matricula=scn.nextLine();
                    
                    if (ferry1.desembarcar(matricula))
                        System.out.println("\033[32mVehiculo ["+matricula+"] desembarcado.\033[30m");
                    else
                        System.out.println("\033[31mVehiculo ["+matricula+"] no esta embarcado.\033[30m");
                  
                    break;

               
               case 3:
                    System.out.println("");
                    System.out.print("Matricula a buscar: ");
                    matricula=scn.nextLine();
                    
                    Vehiculo unVehiculo=ferry1.buscarVehiculo(matricula);
                    
                    if (unVehiculo!=null)
                        System.out.println(unVehiculo);
                    else
                        System.out.println("\033[31mVehiculo ["+matricula+"] no esta embarcado.\033[30m");
                    break;
               
               case 4:
                    System.out.println("");
                    System.out.println("Lista de vehiculos embarcados");
                    System.out.println("***********************************");
                    
                    ferry1.listarEmbarcados();
                    break;

               
                case 5:
                   salir=true;
                   break;
              
                default:
                   System.out.println("Solo números entre 1 y 5");
           }
            
       } //fin menu 
    
  }
}