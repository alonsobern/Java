public class SmartDevice {

    String modelo;
    String fabricante;
    int memoria;
    int almacenamiento;
    boolean bluetooth;
    String conectividad;

    public SmartDevice(String modelo, String fabricante, int memoria, int almacenamiento, boolean bluetooth, String conectividad) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.memoria = memoria;
        this.almacenamiento = almacenamiento;
        this.bluetooth = bluetooth;
        this.conectividad = conectividad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getConectividad() {
        return conectividad;
    }

    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", memoria=" + memoria +
                ", almacenamiento=" + almacenamiento +
                ", bluetooth=" + bluetooth +
                ", conectividad='" + conectividad + '\'' +
                '}';
    }
}
