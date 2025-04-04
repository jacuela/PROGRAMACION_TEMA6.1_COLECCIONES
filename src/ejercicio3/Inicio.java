/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        String nombre, telefono, nuevoTelefono;
        int opcion;

        
        Agenda agenda = new Agenda();
        
        //====== contactos en codigo ===================
        agenda.addContacto("Zamora", "600111111");
        agenda.addContacto("Ayman", "600222222");
        agenda.addContacto("DaVinchi", "600333333");
        //===============================================
       
        //Menu principal
        while(!salir){
           
           System.out.println("\n\n\n\n== EJERCICIO 3 - AGENDA ==");
           System.out.println("==================================");
           
           agenda.listarContactos();
           
           System.out.println("==================================");

           System.out.println("1. Añadir contacto");
           System.out.println("2. Eliminar contacto");
           System.out.println("3. Modificar contacto");
           System.out.println("4. Ver contacto");
           System.out.println("5. Salir");
           
            
           System.out.print("Elige una opcion >");
           opcion = Integer.parseInt(teclado.nextLine());
            
           switch(opcion){
               case 1:
                    System.out.println("");
                    System.out.println("Añadiendo contacto....");
                    System.out.print("Nombre: ");
                    nombre=teclado.nextLine();
                    System.out.print("Telefono: ");
                    telefono=teclado.nextLine();
                    agenda.addContacto(nombre, telefono);
                    break;
               
               case 2:
                    System.out.println("");
                    System.out.print("Nombre del contacto a aliminar: ");
                    nombre=teclado.nextLine();
                    agenda.eliminarContacto(nombre);
                    break;

               case 3:
                    System.out.println("");
                    System.out.print("Nombre del contacto a modificar: ");
                    nombre=teclado.nextLine();
                    System.out.print("Nuevo telefono: ");
                    nuevoTelefono=teclado.nextLine();
                    agenda.modificarContacto(nombre, nuevoTelefono);
                    break;
               
               case 4:
                    System.out.print("Nombre: ");
                    nombre=teclado.nextLine();
                    agenda.mostrarDetalles(nombre);
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
