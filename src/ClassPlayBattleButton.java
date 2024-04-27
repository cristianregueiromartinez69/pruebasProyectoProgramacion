import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ClassPlayBattleButton extends JButton {

    public ClassPlayBattleButton(String texto, Icon iconoBoton){
        super(texto);
        setIcon(iconoBoton);
        setBackground(Color.RED);
        setForeground(Color.BLACK);
        setPreferredSize(new Dimension(150,50));
        Border borderboton = BorderFactory.createLineBorder(Color.YELLOW, 2);
        setBorder(borderboton);


    }
}
