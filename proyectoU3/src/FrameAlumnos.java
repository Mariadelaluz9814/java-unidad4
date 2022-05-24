import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrameAlumnos extends JFrame {
    JLabel    labelAlumno1;
    JLabel    labelAlumno2;
    JLabel    labelMaestro;
    JLabel    labelCharla;
    JLabel    labelAlumnosCharla;
    ImageIcon alumnosCharla;
    ImageIcon alumno1;
    ImageIcon maestro;
    ImageIcon charla;
    ImageIcon alumno2;
    HiloTareas hiloAlumno1, hiloAlumno2;
    JButton btnLlegomaestro;
    PanelAlumnos panelAlumnos;

    FrameAlumnos(){
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        configurarComponentes();
        ImagenActionListener();
        this.setContentPane(panelAlumnos);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void ImagenActionListener() {
        btnLlegomaestro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCharla.setVisible(false);
                labelAlumnosCharla.setVisible(false);
                labelAlumno1.setVisible(true);
                labelAlumno2.setVisible(true);
                labelMaestro.setVisible(true);
            }
        });
        labelAlumno1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                hiloAlumno1=new HiloTareas("AlumnoTablasMultiplicar");
            }
        });
        labelAlumno2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                hiloAlumno2=new HiloTareas("AlumnoNumerosImpares");
            }
        });
    }

    private void configurarComponentes() {
        panelAlumnos= new PanelAlumnos(this);
        labelAlumno1=new JLabel();
        labelAlumno2=new JLabel();
        labelCharla=new JLabel();
        labelMaestro=new JLabel();
        labelAlumnosCharla=new JLabel();
        btnLlegomaestro=new JButton("¡Llegó el maestro!");

        alumno1=new ImageIcon("/Users/lulyhuerta/Desktop/Programación/java-unidad4/proyectoU3/src/icons8-students-100 (1).png");
        alumnosCharla=new ImageIcon("/Users/lulyhuerta/Desktop/Programación/java-unidad4/proyectoU3/src/icons8-students-100 (2).png");
        alumno2=new ImageIcon("/Users/lulyhuerta/Desktop/Programación/java-unidad4/proyectoU3/src/icons8-students-100.png");
        maestro=new ImageIcon("/Users/lulyhuerta/Desktop/Programación/java-unidad4/proyectoU3/src/icons8-persona-femenina-100.png");
        charla=new ImageIcon("/Users/lulyhuerta/Desktop/Programación/java-unidad4/proyectoU3/src/icons8-charla.gif");

        labelAlumnosCharla.setIcon(alumnosCharla);
        labelMaestro.setIcon(maestro);
        labelCharla.setIcon(charla);
        labelAlumno1.setIcon(alumno1);
        labelAlumno2.setIcon(alumno2);

        panelAlumnos.setLayout(null);
        labelCharla.setBounds(170,0,200,200);
        labelAlumnosCharla.setBounds(200,200,100,100);
        labelAlumno1.setBounds(60,220,100,100);
        labelAlumno2.setBounds(330,220,100,100);
        labelMaestro.setBounds(200,400,100,100);
        btnLlegomaestro.setBounds(0,450,150,20);

        labelAlumno1.setVisible(false);
        labelAlumno2.setVisible(false);
        labelMaestro.setVisible(false);

        panelAlumnos.add(labelCharla);
        panelAlumnos.add(labelMaestro);
        panelAlumnos.add(labelAlumnosCharla);
        panelAlumnos.add(labelAlumno1);
        panelAlumnos.add(labelAlumno2);
        panelAlumnos.add(btnLlegomaestro);
        repaint();
    }

    public static void main(String[] args) {
        FrameAlumnos prueba=new FrameAlumnos();
    }
}
