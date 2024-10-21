public class Main {
    public static void main(String[] args) {
        Cliente alonso = new Cliente(35,"Alonso Bernabe","+353831652742",1000);
        System.out.println("El cliente ingresado es: "+alonso.getNombre()+
                " con la edad de "+alonso.getEdad()+
                " años y número telefónico: "+alonso.getTelefono()+
                ". El cliente cuenta con un crédito de: $"+alonso.getCredito()+" "+ejecutarExperiencia(alonso,5));

        Trabajador manuel = new Trabajador(35,"Manuel Bernabe","+353831652748",500);
        System.out.println("El trabajador ingresado es: "+manuel.getNombre()+
                " con la edad de "+manuel.getEdad()+
                " años y número telefónico: "+manuel.getTelefono()+
                ". El trabajador cuenta con un salario de: $"+manuel.getSalario()+" "+ejecutarExperiencia(manuel,10));
    }

    //Implemento una función para ejecutar la interface donde recibe un parámetro tipo interface y el año correspondiente
    //Al estar implementada con las clases Cliente y Trabajador, ejecutará la función dependiendo del tipo de objeto recibido.
    public static String ejecutarExperiencia(Propiedades propiedad, int anios){
        return propiedad.experiencia(anios);
    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

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

class Cliente extends Persona implements Propiedades{
    private int credito;
    public Cliente(int edad, String nombre, String telefono, int credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    @Override
    public String experiencia(int anios) {
        return "Adicionalmente el cliente cuenta con "+anios+" de experiencia(s).";
    }
}
class Trabajador extends Persona implements Propiedades {
    private int salario;

    public Trabajador(int edad, String nombre, String telefono, int salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String experiencia(int anios) {
        return "Adicionalmente el trabajador cuenta con "+anios+" de experiencia(s).";
    }
}

interface Propiedades {
    String experiencia (int anios);
}