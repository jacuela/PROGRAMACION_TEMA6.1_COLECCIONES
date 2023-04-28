
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class org_json {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JSONObject jo;
        
        JSONArray ja = new JSONArray();
        ja.put(Boolean.TRUE);
        ja.put("otra informacion");
        
        
        jo = new JSONObject();
        jo.put("nombre", "Juan");
        jo.put("edad", 19);
        jo.put("email", "juan@kk.com");
        
        ja.put(jo);
        
        jo = new JSONObject();
        jo.put("nombre", "Pepe");
        jo.put("edad", 66);
        jo.put("email", "pepe@kk.com");
        ja.put(jo);

        
        
        System.out.println(ja.toString(1));
        
        
        
    }
    
}
