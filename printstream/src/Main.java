import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Main {

    public static void main(String[] arg){

        try {
            PrintStream info = new PrintStream("../prueba.txt");
            info.println("Hola Mundo");

        } catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }

        try {
            InputStream in = new FileInputStream("D:/Programmation Projects/Python/Practices/Files/camelot.txt");
            byte[] datos = in.readAllBytes();

            PrintStream out = new PrintStream("../copiaDatos.txt");
            out.write(datos);

            in.close();
            out.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
