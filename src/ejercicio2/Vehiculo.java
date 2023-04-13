/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Objects;


/**
 *
 * @author jacuela
 */
public class Vehiculo implements Comparable<Vehiculo> {
    private String matricula;
    private String propietario;

    public Vehiculo(String matricula, String propietario) {
        this.matricula = matricula;
        this.propietario = propietario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", propietario=" + propietario + '}';
    }

   
    @Override
    public int compareTo(Vehiculo o) {
       
          if (this.matricula.compareTo(o.matricula) < 0)
                return -1;
          else if (this.matricula.compareTo(o.matricula) > 0)
                return 1;
          else 
                return 0;
          
          
      // *** Opcion más sencilla, ya que el metodo
      // compareTo de String devuelve lo que necesito
      
      //   int resultado=this.matricula.compareTo(o.matricula);
      // return resultado;
    }

    
    
    //*****   ESTOS DOS MÉTODOS LOS NECESITO PARA PODER USAR EL CONTAINS EN ARRAYLIST *****
    @Override
    public boolean equals (Object obj) {
       
        if (obj !=null && obj instanceof Vehiculo){
            //Voy a comparar por DNI
            //object sera un vehiculo que contiene el DNI 
            Vehiculo v=(Vehiculo)obj;
            if(this.matricula.equals(v.matricula)){
                return true;
            }
       } 
       return false;
    }

   
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.matricula);
        hash = 17 * hash + Objects.hashCode(this.propietario);
        return hash;
    }
    
    //**********************************************************************************
    
 
    
    
    
    
    
    
    
    
    
} //fin clase Vehiculo
