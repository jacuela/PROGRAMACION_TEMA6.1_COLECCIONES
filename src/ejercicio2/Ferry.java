/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jacuela
 */
public class Ferry {
    private String nombre;
    private ArrayList<Vehiculo> listaVehiculos;

    public Ferry(String nombre) {
        this.nombre = nombre;
        listaVehiculos=new ArrayList();
        
    }
   
    
    public boolean embarcar(String matricula, String propietario){
        
        //****** USANDO MI PROPIO MÉTODO PARA VER SI ESTA EMBARCADO
//        Vehiculo unVehiculo=buscarVehiculo(matricula);
//        if (unVehiculo==null){
//            listaVehiculos.add(new Vehiculo(matricula,propietario));
//            return true;
//        }
//        return false;

      //****** USANDO EL METODO CONTAINS(...)
        Vehiculo v=new Vehiculo(matricula,propietario);
        if (!listaVehiculos.contains(v)){
            listaVehiculos.add(v);
            return true;
        }
        return false;
       
    }
    
    public boolean desembarcar(String matricula){
        
         Vehiculo unVehiculo=buscarVehiculo(matricula);
         if (unVehiculo!=null){
            listaVehiculos.remove(unVehiculo);
            return true;
         }           
         return false;
        
        
//        Vehiculo v=new Vehiculo(matricula,"un propietario");
//        if (listaVehiculos.contains(v)){
//            listaVehiculos.remove(v);
//            return true;
//        }
//        return false;
        
    }
    
    public void listarEmbarcados(){
        
        Collections.sort(listaVehiculos);
        
        for (Vehiculo v:listaVehiculos){
            System.out.println(v);
        }
    }
    
    public Vehiculo buscarVehiculo(String matricula){
        
        for (int i = 0; i < listaVehiculos.size(); i++) {
           if (listaVehiculos.get(i).getMatricula().equals(matricula))
               return listaVehiculos.get(i);
        }
        return null;
        
        //Mismo bucle pero usando un foreach
        //listaVehiculos.get(i) ES LO MISMO QUE v
        
//        for (Vehiculo v:listaVehiculos){
//            if (v.getMatricula().equals(matricula))
//                return v;
//        }
//        return null;
        
        
    }
    
 
    
}
