/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Juan Antonio Cuello Alarcon <juanantonio.cuello@murciaeduca.es>
 */
public class Contacto {
    private int id;
    private String nombre;
    private String telefono;
    
    private static int contadorId = 1;
    
    
    public Contacto(String nombre, String telefono){
        this.id = Contacto.contadorId;
        Contacto.contadorId++;
        
        this.nombre = nombre;
        this.telefono = telefono;
        
    }
    
    @Override
    public String toString(){
        String cadena;
        
        cadena = String.format("%20s --> %s", this.nombre,this.telefono);
        
        return cadena;
    }
    
    
    
    
    //Getter ans Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
    
    
}
