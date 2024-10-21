public class Vehiculo {
    private String nombre = "Nombre del vehículo";

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
