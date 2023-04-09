import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    private JTextPane PrecioPane;
    private JTextPane ImpuestoPane;
    private JTextPane TotalPane;
    private JLabel Precio;
    private JLabel Impuesto;
    private JLabel Total;
    private JButton Calcular;
    private JPanel STaxPane;

    public Form() {
        Calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double precio = Double.parseDouble(PrecioPane.getText()); //Cast String a Double
                double tax = 0.12;
                double total = (precio*tax)+precio;
                TotalPane.setText(Double.toString(total)); //Cast Double to String
            }
        });
    }

    public static void main(String[] arg){

        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new Form().STaxPane); //Se instancia a la propia clase para llamar al panel
        frame.setVisible(true); //Lo hago visible
    }
}
