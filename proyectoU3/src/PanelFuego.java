import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class PanelFuego extends JPanel {
    Image         imagen;
    //ImageIcon extintor;
    //Image         fuego;
    //JLabel        lbExtintor;
    //JLabel        lbfuego;
    FrameFuego frameFuego;
    public PanelFuego(FrameFuego frameFuego){
        this.setPreferredSize(new Dimension(500,500));
        this.frameFuego = frameFuego;
        //this.setLayout(null);
        imagen=new ImageIcon("/Users/lulyhuerta/Desktop/Programación/java-unidad4/proyectoU3/src/Chimenea.png").getImage();
        //extintor = new ImageIcon("/Users/lulyhuerta/Desktop/Programación/proyectoU3/src/icons8-extintor-de-incendios-100.png");
        //lbExtintor = new JLabel("caca");
        //lbExtintor.setIcon(extintor);
        //lbExtintor.setBounds(0, 300, 100, 100);
        //this.add(lbExtintor);
        //fuego=new ImageIcon("/Users/lulyhuerta/Desktop/Programación/proyectoU3/src/icons8-fire.gif").getImage();

    }

    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d=(Graphics2D) g;
        g2d.drawImage(imagen,0,0,this);

    }

}
