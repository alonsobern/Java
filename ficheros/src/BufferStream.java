import java.io.*;

public class BufferStream {

    public static void main(String[] arg){
        try {
            InputStream fichero = new FileInputStream("D:/Programmation Projects/Python/Practices/Files/camelot.txt");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);

            try {
                int dato = ficheroBuffer.read();
                System.out.println("Another way to read a file for portion with the class BufferInputStream:");
                while(dato != -1){ //EOF
                    System.out.print((char) dato);
                    dato = ficheroBuffer.read();
                }

            } catch (IOException e){
                System.out.println("File cannot read: "+e.getLocalizedMessage());
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found: "+e.getLocalizedMessage());
        }
    }

}
