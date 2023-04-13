/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jacuela
 */
public class Almacen {
    private HashMap<Integer,Producto> mapaProductos;
    private int ultimoCodigo;
    
    
    
    public Almacen(){
        mapaProductos=new HashMap();
        ultimoCodigo=1001;
    }
  
    
    public void añadirProducto(Producto p){
        mapaProductos.put(ultimoCodigo,p);
        ultimoCodigo++;
    }
  
    public void modificarPrecio(Integer codigo,double precio){
        
        Producto p=mapaProductos.get(codigo);
        p.setPrecio(precio);
    }
   
    public void añadirUnidades(Integer codigo,int unidades){
         Producto p=mapaProductos.get(codigo);
         p.añadirUnidades(unidades);
        
    }
    
    public Producto obtenerProducto(Integer codigo){
        Producto p=mapaProductos.get(codigo);
        return p;      
        
    }
    
    public void venderProducto(Integer codigo,int unidades){
         Producto p=mapaProductos.get(codigo);
         
         if (p.getUnidades()>unidades){
             p.restarUnidades(unidades);
             System.out.print("\033[32mVendidas "+unidades+" de "+p.getDescripcion()+"\033[30m");
             
             if (p.getUnidades()<10) 
                 System.out.println("\033[35m  WARNING!! menos de 10 unidades\033[30m");
             
         }
         else{
             System.out.println("\033[31mERROR!!. Unidades insuficientes de "+p.getDescripcion()+"\033[30m");
         }
         
         System.out.println("");
    }//fin venderProducto
    
    public void listarAlmacen(){
        System.out.println("LISTA DEL ALMACEN");
        System.out.println("***************************");
        Integer codigo;
        Producto p;
        
        
        for(Map.Entry<Integer, Producto> elemento: mapaProductos.entrySet()){
                        codigo=elemento.getKey();
                        p=elemento.getValue();
                        System.out.println("---------------------------------");
                        System.out.println("Codigo:"+codigo);
                        p.imprimir();
        }
        
        System.out.println("***************************");
        
        
    }
    


    
}
