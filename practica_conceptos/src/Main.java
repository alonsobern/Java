import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

    public static void main (String[] arg){

        String texto = "hola mundo";
        String[] arreglo = {"a","b","c","d"};
        int[][] matriz = new int[2][2];
        Vector<Integer> cola = new Vector<>();
        ArrayList<String> animales = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();
        LinkedList<String> animalesClone = new LinkedList<>();

        //Ejercicio de cadena
        System.out.println("Cadena al reves:");
        String reves = reverse(texto);
        System.out.print(reves);

        //Ejercicio de arreglo unidimensional
        System.out.println("\n\nRecorrido de array de strings");
        for(String valor:arreglo){
            System.out.print(valor);
        }

        //Ejercicio de arreglo bidimensional
        //Genero valores randoms para llenar la matriz, vector
        for(int i=0; i< matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j]=(int)(Math.random()*20+1);
            }
        }

        System.out.println("\n\nRecorrido de arreglo bidimensional: ");
        for (int i=0; i< matriz.length;i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.println("El valor para la posición "+i+"."+j+" es: "+matriz[i][j]);
            }
        }

        //Ejercicio de Vector
        //Rellenar valores del vector
        for (int i=0;i<5;i++){
            cola.add((int)(Math.random()*50+5));
        }

        cola.remove(2);
        cola.remove(3);

        System.out.println("\n\nRecorrido del vector:");
        for(int valor:cola){
            System.out.println("La posición del valor es: "+cola.indexOf(valor)+" y el valor es: "+valor);
        }

        //Ejercicio de ArrayList
        animales.add("Perro");
        animales.add("Gato");
        animales.add("Conejo");
        animales.add("Ciervo");

        //Clonar lista de elementos
        animalesClone.addAll(animales);

        System.out.println("\n\nArrayList original:");
        System.out.println(animales);
        System.out.println("LinkedList clonada: ");
        System.out.println(animalesClone);

        //Ejercicio ArrayList numérico
        //Ingreso de valores del 1-10
        for(int i=1;i<=10;i++){
            numeros.add(i);
        }

        for(int i=0;i<numeros.size();i++){
            if((numeros.get(i)%2)==0){
                numeros.remove(i);
            }
        }
        System.out.println("\n\nArrayList Impares:");
        System.out.println(numeros);

        //Ejercicio de throws Exceptions
        try{
            float result = DivideCero(1,4);
            System.out.println("Resultado: "+result);
        } catch (ArithmeticException e){
            e.printStackTrace();
        }

        //Ejercicio ficheros
        try {

            String fileIn = "D:/Programmation Projects/Python/Practices/Files/camelot.txt";
            String fileOut = "D:/Programmation Projects/Java/PrintStream/copiaDatos.txt";

            System.out.println("Ejercicio de ficheros: ");
            if(copiaArchivo(fileIn,fileOut)){
                System.out.println("\n\nArchivo copiado!!");
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        //Ejercicio 9
        try {
            HashMap<Integer, String> base = new HashMap<>();
            String[] nombres = {"Manuel", "Alonso", "Maria", "Auxiliadora"};

            for (int i = 0; i < 4; i++) {
                base.put(i, nombres[i]);
            }

            String fileOut ="D:/Programmation Projects/Java/PrintStream/copiaBase.txt";
            if(copiaBase(fileOut,base)){
                System.out.println("\n\nBase de nombres copiada");
            }
        }catch (IOException e){
            e.printStackTrace();
        }



    }

    //Función Reverse
    public static String reverse(String texto){
        String  reves = "";
        for(int i=texto.length()-1; i>=0; i--){
             reves = reves+texto.charAt(i);
        }
        return reves;
    }

    public static float DivideCero(float a, float b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Esto no puede hacerse");
        }
        return (a/b);
    }

    public static boolean copiaArchivo(String fileIn, String fileOut) throws IOException{

        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);

            in.close();
            out.close();

        } catch (IOException e){
            throw new IOException("Fichero no existe");
        }

        return true;
    }

    public static boolean copiaBase(String fileOut, HashMap<Integer,String> base) throws IOException{

        try{

            PrintStream copia = new PrintStream(fileOut);
            for(int i=0;i<base.size();i++){
                copia.println(base.get(i));
            }
            copia.close();

        }catch (IOException e){
            throw new IOException("La base no se puede copiar");
        }
        return true;
    }
}