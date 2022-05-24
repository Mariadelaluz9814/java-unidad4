import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrameFuego extends JFrame {

    JLabel labelExtintor;
    JLabel labelFuego;
    ImageIcon extintor;
    ImageIcon fuego;
    HiloHayFuego hilo;

    PanelFuego panel;
    FrameFuego(){
        hilo=new HiloHayFuego();
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        configurarComponentes();
        ImagenActionListener();
        this.setContentPane(panel);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void configurarComponentes(){
        panel = new PanelFuego(this);
        labelExtintor = new JLabel();
        labelFuego= new JLabel();
        extintor = new ImageIcon("/Users/lulyhuerta/Desktop/Programación/java-unidad4/proyectoU3/src/icons8-extintor-de-incendios-100.png");
        fuego = new ImageIcon("/Users/lulyhuerta/Desktop/Programación/java-unidad4/proyectoU3/src/icons8-fire.gif");
        labelExtintor.setIcon(extintor);
        labelFuego.setIcon(fuego);

        panel.setLayout(null);
        labelExtintor.setBounds(0, 300, 100, 100);
        labelFuego.setBounds(170, 320, 200, 200);
        panel.add(labelExtintor);
        panel.add(labelFuego);
        repaint();
    }
    public void ImagenActionListener(){
        labelExtintor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                hilo.hayFuego = !hilo.hayFuego;

                if(hilo.hayFuego){
                    labelFuego.setVisible(true);
                } else {
                    labelFuego.setVisible(false);
                }
            }
        });
    }
    public static void main(String[] args) {
        FrameFuego prueba=new FrameFuego();
    }
}
