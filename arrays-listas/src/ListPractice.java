import java.util.ArrayList;
import java.util.List;
public class ListPractice {
    public static void main(String arg[]){

       //Declaración de una lista dinámica de arrays.
       List<String> nombres = new ArrayList<>();

       nombres.add("Alonso");
       nombres.add("Manuel");
       nombres.add("Pukycita");

       //Una opción para imprimir los valores es llamar directamente a la lista.
       System.out.println(nombres);

       //Otra forma de obtener los valores es realizándolo con un FOREACH
       for(String nombre:nombres){
           System.out.println(nombre);
       }

       //Una lista de arrays dinámicos también pueden ser usuadas para manejar objetos de clases.
       List<Vehiculo> vehiculos = new ArrayList<>();

       //Los valores se los añade a partir del constructor de la clase
       vehiculos.add(new Vehiculo("Kia"));
       vehiculos.add(new Vehiculo("Renault"));
       vehiculos.add(new Vehiculo("Mazda"));

       //Al igual que los ejemplos anteriores, los valores pueden ser obtenidos directamente con un SOUT o realizando un FOREACH
       System.out.println(vehiculos.toString());

       for(Vehiculo coche:vehiculos){
           System.out.println(coche.toString());
       }
    }
}
