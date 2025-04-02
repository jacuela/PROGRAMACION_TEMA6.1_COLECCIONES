/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

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
        
        Agenda agenda = new Agenda();
        
        
        //====== contactos en codigo ===================
        agenda.addContacto("Zamora", "600111111");
        agenda.addContacto("Ayman", "600222222");
        agenda.addContacto("DaVinchi", "600333333");
        
        //===============================================
        
        agenda.listarContactos();
        
        
    }
    
}
