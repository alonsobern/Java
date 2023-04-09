import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg){

        boolean flag = true;
        int a = 0;
        int b = 0;


            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingresa dos número: ");
                try {

                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    flag = false;

                } catch(InputMismatchException e){
                    System.out.println("Números inválidos: " + e.getMessage());
                }

            }while(flag);

        System.out.println("Los números ingresados son: " + a + " " + b);
    }
}
