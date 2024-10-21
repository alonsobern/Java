public class Arrays {

    public static void main(String arg[]){
        int[] notas = new int[5]; //Declaración de un array sin valores.

        String[] alumnos = {"Manuel","Maria","Alonso","Auxiliadora","Lucy"}; //Declaración de un array con valores

        //Recorrido de un array mediante FOR
        for(int i=0; i<alumnos.length;i++){
            System.out.println(alumnos[i]);
        }

        //Recorrido de un array mediante FOREACH
        for (String item:alumnos) {
            System.out.println(item);
        }

        for(int i=0; i<notas.length; i++){
            notas[i]=i*2;
        }

        for(int item:notas){
            System.out.println(item);
        }
    }
}
