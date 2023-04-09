import java.util.function.Function;

public class Lambda {

    //Funciones Lambda, son funciones con estructuras definididas que cuentan con un parámetro de entrada y una de salida
    private Function<String, String> toMayus = (x) -> x.toUpperCase();
    private Function<Integer, Integer> sumador = (x) -> x.sum(x,x);

    public void pruebas(){
        System.out.println(toMayus.apply("alonso")); //La función se implementa con el método apply
        System.out.println(sumador.apply(2));
    }
}
