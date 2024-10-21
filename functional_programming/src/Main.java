import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] arg){
        Lambda funciones = new Lambda();
        funciones.pruebas();


        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manuel");
        lista.add("Alonso");
        lista.add("Bernabe");
        lista.add("Baldano");

        System.out.println("Recorrido de lista clásico:");
        for(String nombre:lista){
            System.out.println(nombre);
        }

        //Método stream y foreach
        System.out.println("\nRecorrido de lista con función de alto nivel:");
        lista.stream().forEach(System.out::println);

        //La función map aplica una función y devuelve resultado tipo Stream<String>
        System.out.println("\nAplicación de funciones de alto nivel con stream y map:");
        Stream<String> valores = lista.stream()
                .map(x -> x.toUpperCase()) //Convierto a mayusculas
                .filter(x -> x.startsWith("B")); //Filtro los datos que empiezan con B
        valores.forEach(System.out::println);

        //IntStream
        System.out.println("Uso de Stream con enteros: ");
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        IntStream stNumeros = Arrays.stream(numeros);
        IntStream resultado = stNumeros
                .filter(x -> x%2==0); //Filtra solo los números pares
        resultado.forEach(System.out::println);

        System.out.println("\nSuma de números pares: ");
        int resultadoSuma = stNumeros
                .map(x -> x*2)
                .filter(x -> x%2==0)
                .reduce(0,(x,y) -> x + y); //Función reduce implementa otra función
        System.out.println("El resultado de la suma de pares es: "+resultadoSuma);
    }
}
