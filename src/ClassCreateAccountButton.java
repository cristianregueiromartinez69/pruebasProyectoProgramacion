import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ClassCreateAccountButton extends JButton {

    public ClassCreateAccountButton(String texto, Icon iconoBoton){

        super(texto);
        setIcon(iconoBoton);
        setBackground(Color.ORANGE);
        setForeground(Color.BLACK);
        setPreferredSize(new Dimension(150,50));
        Border borderboton = BorderFactory.createLineBorder(Color.YELLOW, 2);
        setBorder(borderboton);
    }

}
