import java.util.HashMap;
import java.util.Map;

public class Mapas {


    @SuppressWarnings("rawtypes")
    public static void main (String[] arg){
        HashMap<String, Integer> mapas = new HashMap<>();
        mapas.put("Clave1", 10);
        mapas.put("Clave2", 20);
        mapas.put("Clave3", 30);

        System.out.println(mapas);

        mapas.replace("Clave3", 50);

        System.out.println(mapas);

        //Recorridos de mapas
        for(Map.Entry elemento: mapas.entrySet()){
            System.out.println("Esta es la clave: "+elemento.getKey());
            System.out.println("Este es el valor: "+elemento.getValue());
        }
    }

}
