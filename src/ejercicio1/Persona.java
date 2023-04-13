/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Objects;

/**
 *
 * @author jacuela
 */
public class Persona implements Comparable<Persona> {
    private String dni;
    private String nombre;
    private int edad;
    
    public Persona(String DNI,String nombre, int edad){
      
        this.dni=DNI;
        this.nombre=nombre;
        this.edad=edad;
    }
    
    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    
    @Override
    public String toString(){
        return String.format("[%7s] %s %d años.",dni,nombre,edad);
        
    }    
    
    public void imprimirDetalles(){
        System.out.println("------- detalles -------");
        System.out.println("DNI:    "+this.dni);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad:   "+this.edad);
        System.out.println("-------------------------");

    }
    
    @Override
    public int compareTo(Persona o) {
      
      //Ordenaremos las personas segun su DNI
      if (this.dni.compareTo(o.getDni())<0)
            return -1;
      else if (this.dni.compareTo(o.getDni())>0)
            return 1;
      else
            return 0;
    
        //En realidad, el método compareTo de String ya me devuelve exactamente
        //lo que necesito, por lo que lo podría programar como
        //        return this.dni.compareTo(o.dni);
        
        

//        //Ordenamos las personas segun EDAD
//        if (this.edad < o.getEdad())
//            return -1;
//        else if (this.edad > o.getEdad())
//            return 1;
//        else
//            return 0;
    
    }

   
    
      //Método por si queremos usar el contains() de ArrayList
//    @Override
//    public boolean equals (Object obj) {
//       if (obj !=null && obj instanceof Persona){
//            //Voy a comparar por DNI
//            //object sera una Persona que contiene el DNI 
//            Persona p=(Persona)obj;
//            if(this.dni.equals(p.dni)){
//                return true;
//            }
//       } 
//       return false;
//    }

    
    
}
