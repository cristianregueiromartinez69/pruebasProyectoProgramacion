import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainMenu extends JFrame {

    public MainMenu() {
        MusicGame.music();
        setTitle("Panel con Imagen de Fondo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);


        Image backgroundImage = new ImageIcon("imagenPruebaFondo.jpg").getImage();

        BackgroundMainMenu backgroundPanel = new BackgroundMainMenu(backgroundImage);
        backgroundPanel.setLayout(new BorderLayout());


        JPanel contentPanel = makeContentPanel();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(500, 300, 300, 300);


        backgroundPanel.add(contentPanel, BorderLayout.CENTER);


        add(backgroundPanel);

        setVisible(true);

        gbc.gridx = 0;
        gbc.gridy = 0;


        ImageIcon icon = new ImageIcon("iconoBatalla.png");
        JButton battle = new ClassPlayBattleButton("Batalla", icon);
        contentPanel.add(ButtonBattlePanel(battle), gbc);


        gbc.gridx = 1;
        gbc.gridy = 0;

        ImageIcon icon2 = new ImageIcon("crearCuenta.png");
        JButton account = new ClassCreateAccountButton("Crear Cuenta", icon2);
        contentPanel.add(CreateDashboardAccount(account), gbc);


        battle.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                battle.setBackground(Color.WHITE);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                battle.setBackground(Color.RED);
            }
        });

        account.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                account.setBackground(Color.ORANGE.brighter());

            }

            @Override
            public void mouseExited(MouseEvent e) {
                account.setBackground(Color.ORANGE);
            }
        });


    }

    private JPanel ButtonBattlePanel(JButton battle) {
        JPanel playBattlePanel = new JPanel();
        playBattlePanel.setLayout(new GridBagLayout());
        playBattlePanel.add(battle);
        return playBattlePanel;
    }

    private JPanel CreateDashboardAccount(JButton cuenta) {
        JPanel createAccountPanel = new JPanel();
        createAccountPanel.setLayout(new GridBagLayout());
        createAccountPanel.add(cuenta);
        return createAccountPanel;
    }

    private JPanel makeContentPanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setOpaque(false);
        contentPanel.setLayout(new GridBagLayout());
        return contentPanel;
    }


}
