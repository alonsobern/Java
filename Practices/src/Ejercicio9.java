import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio9 {

    public static void main(String[] arg){
        HashMap<Integer, String> base = new HashMap<>();
        String[] nombres = {"Manuel","Alonso","Maria","Auxiliadora"};

        for(int i=0; i<4;i++){
            base.put(i,nombres[i]);
        }

        System.out.println(base);
    }
}
