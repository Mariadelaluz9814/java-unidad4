

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class Interfeaz extends JFrame {

    private       JMenuBar       jMenuBar;
    private       JMenuItem      menuVentana1;
    private       JMenuItem      menuVentana2;
    private       JDesktopPane   desktopPane;
    private       JInternalFrame internalFrame;
    private       JInternalFrame internalFrame2;
    private       JButton        botonHilo;
    private       JButton        botonHilo2;
    public static JList<String>  jList;
    public static JList<String>  jList2;
    private       JScrollPane    scrollPaneList;
    private       JScrollPane    scrollPaneList2;

    public static void main(String[] args) {
        var interfaz = new Interfeaz();
    }

    public Interfeaz() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(640, 480);
        this.setLocationRelativeTo(null);
        makeDesktop();
        makeInternal();
        makeInternal2();
        this.getContentPane().add(desktopPane);
        desktopPane.add(internalFrame);
        desktopPane.add(internalFrame2);
        configurarComponentes();
        initActionListeners();
        this.setJMenuBar(jMenuBar);
        this.setVisible(true);
    }

    public void configurarComponentes() {
        jMenuBar = new JMenuBar();
        JMenu jMenu = new JMenu("Menú");
        menuVentana1 = new JMenuItem("Ventana 1");
        menuVentana2  = new JMenuItem("Ventana 2");
        JMenuItem menuItemSalir = new JMenuItem("Salir");

        jMenu.add(menuVentana1);
        jMenu.add(menuVentana2);
        jMenu.addSeparator();
        jMenu.add(menuItemSalir);

        jMenuBar.add(jMenu);
    }

    public void initActionListeners() {
        menuVentana1.addActionListener(e -> internalFrame.setVisible(true));
        menuVentana2.addActionListener(e -> internalFrame2.setVisible(true));
        botonHilo.addActionListener(e -> {
            var    unHilo = new UnHilo2("SubHilo1");

        });
        botonHilo2.addActionListener(e -> {
            var    unHilo = new UnHilo2("SubHilo1");
            var    unHilo2 = new UnHilo2("SubHilo2");

        });
    }

    public void makeDesktop() {
        desktopPane = new JDesktopPane();
    }

    public void makeInternal() {
        JLabel labelInternalFrame = new JLabel("Estoy en la ventana 1");
        jList          = new JList<>();
        scrollPaneList = new JScrollPane(jList);
        botonHilo      = new JButton("Hilo");
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

        internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setTitle("Ventana 1");
        internalFrame.setBounds(100, 100, 550, 300);
        internalFrame.setLayout(new GridBagLayout());

        internalFrame.add(labelInternalFrame, gbc);
        gbc.gridy = 1;
        internalFrame.add(scrollPaneList, gbc);
        gbc.gridy = 2;
        internalFrame.add(botonHilo, gbc);
    }
    public void makeInternal2() {
        JLabel labelInternalFrame = new JLabel("Estoy en la ventana 2");
        jList          = new JList<>();
        jList2          = new JList<>();
        scrollPaneList = new JScrollPane(jList);
        scrollPaneList2 = new JScrollPane(jList2);
        botonHilo2      = new JButton("Hilo");
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

        internalFrame2 = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame2.setTitle("Ventana 2");
        internalFrame2.setBounds(100, 100, 550, 300);
        internalFrame2.setLayout(new GridBagLayout());

        internalFrame2.add(labelInternalFrame, gbc);
        gbc.gridy = 1;
        internalFrame2.add(scrollPaneList, gbc);
        gbc.gridx = 1;
        internalFrame2.add(scrollPaneList2, gbc);
        gbc.gridy = 2;
        internalFrame2.add(botonHilo2, gbc);
    }

}