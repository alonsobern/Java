public class SmartPhone extends SmartDevice {
    String colorTrasero;
    int pixelesCamaraFrontal;
    int pixelesCamaraTrasera;

    public SmartPhone(String modelo, String fabricante, int memoria, int almacenamiento, boolean bluetooth, String conectividad, String colorTrasero, int pixelesCamaraFrontal, int pixelesCamaraTrasera) {
        super(modelo, fabricante, memoria, almacenamiento, bluetooth, conectividad);
        this.colorTrasero = colorTrasero;
        this.pixelesCamaraFrontal = pixelesCamaraFrontal;
        this.pixelesCamaraTrasera = pixelesCamaraTrasera;
    }

    public String getColorTrasero() {
        return colorTrasero;
    }

    public void setColorTrasero(String colorTrasero) {
        this.colorTrasero = colorTrasero;
    }

    public int getPixelesCamaraFrontal() {
        return pixelesCamaraFrontal;
    }

    public void setPixelesCamaraFrontal(int pixelesCamaraFrontal) {
        this.pixelesCamaraFrontal = pixelesCamaraFrontal;
    }

    public int getPixelesCamaraTrasera() {
        return pixelesCamaraTrasera;
    }

    public void setPixelesCamaraTrasera(int pixelesCamaraTrasera) {
        this.pixelesCamaraTrasera = pixelesCamaraTrasera;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "colorTrasero='" + colorTrasero + '\'' +
                ", pixelesCamaraFrontal=" + pixelesCamaraFrontal +
                ", pixelesCamaraTrasera=" + pixelesCamaraTrasera +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", memoria=" + memoria +
                ", almacenamiento=" + almacenamiento +
                ", bluetooth=" + bluetooth +
                ", conectividad='" + conectividad + '\'' +
                '}';
    }
}
