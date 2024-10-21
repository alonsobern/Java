public class SmartWatch extends SmartDevice{
    protected String tipoBanda;
    protected boolean casual;
    protected boolean deportivo;
    protected boolean walkieTalkie;

    public SmartWatch(String modelo, String fabricante, int memoria, int almacenamiento, boolean bluetooth, String conectividad, String tipoBanda, boolean casual, boolean deportivo, boolean walkieTalkie) {
        super(modelo, fabricante, memoria, almacenamiento, bluetooth, conectividad);
        this.tipoBanda = tipoBanda;
        this.casual = casual;
        this.deportivo = deportivo;
        this.walkieTalkie = walkieTalkie;
    }

    public String getTipoBanda() {
        return tipoBanda;
    }

    public void setTipoBanda(String tipoBanda) {
        this.tipoBanda = tipoBanda;
    }

    public boolean isCasual() {
        return casual;
    }

    public void setCasual(boolean casual) {
        this.casual = casual;
    }

    public boolean isDeportivo() {
        return deportivo;
    }

    public void setDeportivo(boolean deportivo) {
        this.deportivo = deportivo;
    }

    public boolean isWalkieTalkie() {
        return walkieTalkie;
    }

    public void setWalkieTalkie(boolean walkieTalkie) {
        this.walkieTalkie = walkieTalkie;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "tipoBanda='" + tipoBanda + '\'' +
                ", casual=" + casual +
                ", deportivo=" + deportivo +
                ", walkieTalkie=" + walkieTalkie +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", memoria=" + memoria +
                ", almacenamiento=" + almacenamiento +
                ", bluetooth=" + bluetooth +
                ", conectividad='" + conectividad + '\'' +
                '}';
    }
}
