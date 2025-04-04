/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Agenda {
    
    private HashMap<String, Contacto> contactos;
    
    public Agenda(){
        contactos = new HashMap();
    }
    
    
    public void addContacto(String nombre, String telefono){
        
        //Primero, compruebo que el nombre (que es la key) no este ya
        if (contactos.containsKey(nombre)){
            //Ya existe esa key
            System.out.println("  ERROR: el contacto "+nombre+" ya existe.");
        }
        else{
            //Nombre nuevo (Key nueva) 
            
            //Me creo el objeto (va a ser el value)
            Contacto c = new Contacto (nombre, telefono);
                
            //Añadimos el contacto al mapa
            contactos.put(nombre, c);
        
        }
    }    
    
    public void eliminarContacto(String nombre){
        
//        //Opcion1
//        Contacto c = contactos.remove(nombre);
//        
//        if (c==null){
//            //ni existe dicho nombre
//            System.out.println("  ERROR: no existe el contacto "+nombre);
//        }
//        else{
//            System.out.println(" EXITO al borrar contacto");
//            System.out.println("Contacto borrado: "+c.getNombre());
//            System.out.println("Telefono asiciado: "+c.getTelefono());
//        }
         
              
        //Opcion2
        if (contactos.remove(nombre)==null){
            //ni existe dicho nombre
            System.out.println("  ERROR: no existe el contacto "+nombre);
            
        }
//        else{
//            System.out.println(" EXITO al borrar contacto");
//        }
        
    }
    
    
    public void modificarContacto(String nombre, String nuevoTelefono){
        
        //Primero, compruebo que el nombre (que es la key) existe
        if (contactos.containsKey(nombre)){
            Contacto c = contactos.get(nombre);
            c.setTelefono(nuevoTelefono);
        }
        else{
            System.out.println("  ERROR: el contacto "+nombre+" no existe.");
        }
        
    }
    
    public void mostrarDetalles(String nombre){
        //Primero, compruebo que el nombre (que es la key) existe
        if (contactos.containsKey(nombre)){
            //Existe 
            Contacto c = contactos.get(nombre); 
            
            //Muestro detalles
            this.detalles(c);
            
        }
        else{
            System.out.println("  ERROR: el contacto "+nombre+" no existe.");
        }
        
    }
    
    private void detalles(Contacto c){
        System.out.println("");
       
        System.out.println("------------------------------------");
        System.out.println("ID:       "+c.getId());
        System.out.println("Nombre:   "+c.getNombre());
        System.out.println("Telefono: "+c.getTelefono());
        System.out.println("------------------------------------");
        
        
        
        
        
    }
    
    
    
    
    public void listarContactos(){
        
        //Con un iterador. OJO, no está ordenado
        Iterator it = contactos.keySet().iterator();
        
        while (it.hasNext()){
            String key = (String)it.next(); //Obtengo la Key (el nombre)
            Contacto c = contactos.get(key); //con la key, obtengo el value (el objeto)
            System.out.println(c); //imprimo el objeto Contacto
        }
        
        System.out.println("\n - - - ORDENADO CON TREE MAP - - -\n ");
        
        //Si quisiera mostrar al HashMap ordenado, una forma sencilla es crear
        //un TreeMap copia del HashMap. Los TreeMap están implementados de tal
        //forma que están ordenados por la clave
        
        TreeMap <String, Contacto> contactosOrdenados = new TreeMap(contactos);
        
        //Con un iterador
        Iterator it2 = contactosOrdenados.keySet().iterator();
        
        while (it2.hasNext()){
            String key = (String)it2.next(); //Obtengo la Key (el nombre)
            Contacto c = contactos.get(key); //con la key, obtengo el value (el objeto)
            System.out.println(c); //imprimo el objeto Contacto
        }
        
        
        
        
        
        
    }
    
    
    
    
    
}
