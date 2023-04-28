
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */




/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class emulando_json_prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //JsonObject object = Json.createObjectBuilder().build();
        
        
        //**** INTENTO CON HASHMAP, PERO NO PUEDO
        ArrayList<HashMap<String,String>> datos = new ArrayList();
        HashMap<String,String> objeto;
        
        
        objeto = new HashMap();
        objeto.put("nombre", "Juan");
        objeto.put("edad", "19");
        objeto.put("email", "juan@kk.com");
        datos.add(objeto);
        
        objeto = new HashMap();
        objeto.put("nombre", "Pepe");
        objeto.put("edad", "66");
        objeto.put("email", "pepe@kk.com");
        datos.add(objeto);
       
        for (int i = 0; i < datos.size(); i++) {
            System.out.println(datos.get(i));
        }
        
        
    }
    
}
