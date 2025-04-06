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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Almacen mialmacen=new Almacen();
        
        mialmacen.añadirProducto("iphone11",900,50); //cod 1001
        mialmacen.añadirProducto("galaxy12",800,30); //cod 1002
        mialmacen.añadirProducto("ps3",400,100);     //cod 1003
        mialmacen.añadirProducto("Satisfyer",50,300); //cod 1004
        
        mialmacen.modificarPrecio(1001, 950);
       
        mialmacen.añadirUnidades(1003,100);
        
        mialmacen.venderProducto(1002,1);
        
        mialmacen.venderProducto(1002,20);
        
        mialmacen.venderProducto(1004, 500);
        
        mialmacen.listarAlmacen();
       
        
        
    }
    
}
