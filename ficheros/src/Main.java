import java.io.*;

public class Main {

    public static void main (String[] arg){

        try {

            InputStream fichero = new FileInputStream("D:/Programmation Projects/Python/Practices/Files/camelot.txt");

            try {
                byte[] datos = fichero.readAllBytes();

                for(byte dato:datos){

                    //Para leer el fichero debo realizar obligatoriamente el cast
                    System.out.print((char)dato);
                }

                //Another way to read a file
                int dato = fichero.read();

                System.out.println("This is another way to read a file:");

                while (dato!=-1){ //EOF
                    System.out.print((char)dato);
                    dato = fichero.read();
                }

            } catch (IOException e){
                System.out.println("Cannot read the file: "+e.getLocalizedMessage());
            }

        }catch (FileNotFoundException e){
            System.out.println("Fichero not found: "+e.getLocalizedMessage());
        }
    }
}
