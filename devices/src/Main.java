public class Main {
    public static void main(String arg[]){

        SmartWatch reloj = new SmartWatch("SE","Apple",2,16,true,"4G",
                "cuero",true,false,true);

        SmartPhone telefono = new SmartPhone("13 Pro Max","Apple",32,128,true,
                "5G","rojo",12,128);

        System.out.println("Datos del teléfono"+
                "\nModelo: "+telefono.getModelo()+
                "\nFabricante: "+telefono.getFabricante()+
                "\nMemoria RAM: "+telefono.getMemoria()+"GB"+
                "\nAlmacenamiento: "+telefono.getAlmacenamiento()+"GB"+
                "\nBluetooth: "+telefono.isBluetooth()+
                "\nConectividad: "+telefono.getConectividad()+
                "\nColor: "+telefono.getColorTrasero()+
                "\nCámara Frontal: "+telefono.getPixelesCamaraFrontal()+"px"+
                "\nCámara Trasera: "+telefono.getPixelesCamaraTrasera()+"px");

        System.out.println("\nDatos del reloj"+
                "\nModelo: "+reloj.getModelo()+
                "\nFabricante: "+reloj.getFabricante()+
                "\nMemoria RAM: "+reloj.getMemoria()+"GB"+
                "\nAlmacenamiento: "+reloj.getAlmacenamiento()+"GB"+
                "\nBluetooth: "+reloj.isBluetooth()+
                "\nConectividad: "+reloj.getConectividad()+
                "\nTipo de banda: "+reloj.getTipoBanda()+
                "\nCasual: "+reloj.isCasual()+
                "\nDeportivo: "+reloj.isDeportivo()+
                "\nWalkie Talkie: "+reloj.isWalkieTalkie());

    }
}
