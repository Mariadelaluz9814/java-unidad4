import javax.swing.*;
import java.awt.*;

public class PanelHilosFinal extends JPanel {
    Image imagenFondo;
    InterfazHilos interfazHilos;
    public PanelHilosFinal(InterfazHilos interfazHilos){
        this.setPreferredSize(new Dimension(500,500));
        this.interfazHilos=interfazHilos;
        imagenFondo=new ImageIcon("/Users/lulyhuerta/Desktop/Programación/java-unidad4/proyectoU3/src/fondo.png").getImage();
    }
    public void paintComponent(Graphics g){
        Graphics2D g2d=(Graphics2D) g;
        g2d.drawImage(imagenFondo,0,0,this);

    }
}
