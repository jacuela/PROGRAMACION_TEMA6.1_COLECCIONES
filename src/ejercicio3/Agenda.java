/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.HashMap;
import java.util.Iterator;

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
        
        //Me creo el objeto (va a ser el value)
        Contacto c = new Contacto (nombre, telefono);
        
        //Añadimos el contacto al mapa
        contactos.put(nombre, c);
        
        
        
    }
    
    
    
    public void listarContactos(){
        
        //Con un iterador
        Iterator it = contactos.keySet().iterator();
        
        while (it.hasNext()){
            String key = (String)it.next(); //Obtengo la Key (el nombre)
            Contacto c = contactos.get(key); //con la key, obtengo el value (el objeto)
            System.out.println(c); //imprimo el objeto Contacto
        }
        
    }
    
    
    
    
    
}
