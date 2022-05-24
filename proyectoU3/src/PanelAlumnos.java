import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class PanelAlumnos extends JPanel {
    Image imagenAlumnos;
    FrameAlumnos frameAlumnos;
    public PanelAlumnos(FrameAlumnos frameAlumnos){
        this.setPreferredSize(new Dimension(500,500));
        this.frameAlumnos=frameAlumnos;
        imagenAlumnos=new ImageIcon("/Users/lulyhuerta/Desktop/Programación/java-unidad4/proyectoU3/src/Salon.png").getImage();
    }
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d=(Graphics2D) g;
        g2d.drawImage(imagenAlumnos,0,0,this);

    }
}
