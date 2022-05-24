import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InterfazCronometro extends JFrame {
    private JPanel PanelCronometro;
    public JLabel  lbTiempo;
    public JButton btnReanudar;
    public JButton btnPausa;
    public JButton btnReiniciar;
    public boolean inicioHilo;
    private HiloCronometro crono;

    InterfazCronometro(){
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setSize(600,600);
        botonesActionListener();
        configuarComponentes();
        EmpezarHilo();
        this.setContentPane(PanelCronometro);
        this.setVisible(true);
    }
    public  void EmpezarHilo() {
        crono = new HiloCronometro(this);
    }
    private void botonesActionListener() {
        btnReanudar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crono.Reanudar();
            }
        });
        btnPausa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crono.Pausar();
            }
        });
        btnReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crono.Reiniciar();
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                crono.pararHilo();
            }
        });
    }

    private void configuarComponentes(){}
    public void ActualizarlbTiempo(){
        String tiempo="";
        if (crono.hora>0){
            if (crono.hora<10){
                tiempo+="0"+crono.hora+":";
            }else {
                tiempo+=crono.hora+":";
            }
        }
        if (crono.min<10){
            tiempo+="0"+crono.min+":";
        }else {
            tiempo+=crono.min+":";
        }
        if (crono.seg<10){
            tiempo+="0"+crono.seg+":";
        }else {
            tiempo+=crono.seg+":";
        }
        if (crono.miliSeg<10){
            tiempo+="0"+crono.miliSeg;
        }else {
            tiempo+=crono.miliSeg;
        }
        lbTiempo.setText(tiempo);
    }
    public static void main(String[] args) {
        var objeto=new InterfazCronometro();
    }
}
