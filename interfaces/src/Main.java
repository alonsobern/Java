public class Main {

    public static void main (String arg[]){

        CocheCRUDImpl coche = new CocheCRUDImpl();

        System.out.println(coche.save());
        System.out.println(coche.findAll());
        System.out.println(coche.delete());
    }
}
