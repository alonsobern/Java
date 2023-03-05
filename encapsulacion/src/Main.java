public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona(35,"Alonso Bernabe","+353831652742");
        System.out.println("La persona ingresada es: "+persona1.getNombre()+
                " con "+persona1.getEdad()+" años de edad y número de teléfono: "+
                persona1.getTelefono());

    }

    static class Persona{
        private int edad;
        private String nombre;
        private String telefono;

        //Constructor - Se utiliza para inicializar variales
        public Persona(int edad, String nombre, String telefono) {
            this.edad = edad;
            this.nombre = nombre;
            this.telefono = telefono;
        }

        //Concepto de encapsulación - Programación orientada a objetos
        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }
}