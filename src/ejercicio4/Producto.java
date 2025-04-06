/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author jacuela
 */
public class Producto {
    private int codigo;
    private String descripcion;
    private double precio;
    private int unidades;
    
    public Producto (int cod, String descripcion, double precio, int uni){
       this.codigo = cod;
       this.descripcion=descripcion;
       this.precio=precio;
       this.unidades=uni;
    }
    
    public void setPrecio(double precio){
        this.precio=precio;
    }
  
    public int getUnidades(){
        return unidades;
    }
  
    public String getDescripcion(){
        return descripcion;
    }
  
    
    
    public void añadirUnidades(int uni){
        this.unidades=this.unidades+uni;
    }
    
    public void restarUnidades(int uni){
        this.unidades=this.unidades-uni;
    }
    
    
    @Override
    public String toString(){
        return String.format("[%4d] %-10s %8.2f€  %3d unidades",codigo,descripcion,precio,unidades);
        
    }
    
    
    
}
