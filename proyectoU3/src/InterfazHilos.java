import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InterfazHilos extends JFrame {
    private JLabel lbCronometro;
    private JLabel lbSincronizados;
    private JLabel lbTareas;
    private JLabel lbFuego;
    ImageIcon botonFuego;
    ImageIcon botonSincronizados;
    ImageIcon botonTareas;
    ImageIcon botonCrononometro;
    PanelHilosFinal panelFinalHilos;
    InterfazHilos(){
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        configurarComponentes();
        ImagenActionListener();
        this.setContentPane(panelFinalHilos);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void ImagenActionListener() {
        lbCronometro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                InterfazCronometro objeto=new InterfazCronometro();
            }
        });
        lbFuego.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                FrameFuego objeto=new FrameFuego();
            }
        });
        lbSincronizados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                InterfazSincronizados objeto=new InterfazSincronizados();
            }
        });
        lbTareas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                FrameAlumnos objeto=new FrameAlumnos();
            }
        });
    }

    private void configurarComponentes() {
        panelFinalHilos=new PanelHilosFinal(this);
        lbCronometro=new JLabel();
        lbFuego=new JLabel();
        lbSincronizados=new JLabel();
        lbTareas=new JLabel();

        botonFuego=new ImageIcon("/Users/lulyhuerta/Desktop/Programación/java-unidad4/proyectoU3/src/botonFuego.png");
        botonCrononometro=new ImageIcon("/Users/lulyhuerta/Desktop/Programación/java-unidad4/proyectoU3/src/botonCrono.png");
        botonSincronizados=new ImageIcon("/Users/lulyhuerta/Desktop/Programación/java-unidad4/proyectoU3/src/botonSincronizados.png");
        botonTareas=new ImageIcon("/Users/lulyhuerta/Desktop/Programación/java-unidad4/proyectoU3/src/botonTareas.png");

        lbTareas.setIcon(botonTareas);
        lbSincronizados.setIcon(botonSincronizados);
        lbCronometro.setIcon(botonCrononometro);
        lbFuego.setIcon(botonFuego);

        panelFinalHilos.setLayout(null);

        lbCronometro.setBounds(50,300,100,100);
        lbFuego.setBounds(150,300,100,100);
        lbSincronizados.setBounds(250,300,100,100);
        lbTareas.setBounds(350,300,100,100);

        panelFinalHilos.add(lbTareas);
        panelFinalHilos.add(lbCronometro);
        panelFinalHilos.add(lbSincronizados);
        panelFinalHilos.add(lbFuego);

        repaint();
    }

    public static void main(String[] args) {
        InterfazHilos objeto=new InterfazHilos();
    }
}
