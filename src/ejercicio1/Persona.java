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

    public String getNombre() {
        return nombre;
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
        //Ordenamos por EDAD
//        if (this.edad < p.getEdad())
//            return -1;
//        else if (this.edad > p.getEdad())
//            return 1;
//        else
//            return 0; 
//        
        
        //Ordenamos por DNI
//        if (this.dni.compareTo(p.getDni())<0){
//             return -1;
//        }    
//        else if (this.dni.compareTo(p.getDni())>0){
//             return 1;
//        }    
//        else {
//            return 0;
//        }


        //Ordenaremos las personas segun su DNI y EDAD
        if (this.dni.compareTo(o.getDni())<0)
              return -1;
        else if (this.dni.compareTo(o.getDni())>0)
              return 1;
        else {

            if (this.edad<o.getEdad()){
                return -1;
            }
            else if (this.edad>o.getEdad()){
                return 1;
            }
            else{
                return 0;
            }
        }      

    }

     //Método por si queremos usar el contains() de ArrayList
    @Override
    public boolean equals (Object obj) {
       if (obj !=null && obj instanceof Persona){
            //Voy a comparar por DNI
            //object sera una Persona que contiene el DNI 
            Persona p=(Persona)obj;
            if(this.dni.equals(p.dni)){
                return true;
            }
       } 
       return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.dni);
        return hash;
    }


    
} //fin class 
    
    
    
