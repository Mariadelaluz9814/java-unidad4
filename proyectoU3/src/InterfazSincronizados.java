import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazSincronizados extends JFrame {
    public static JList<String>  jList;
    public static JList<String>  jList2;
    public static JList<String>  jList3;
    public static JList<String>  jList4;
    private       JScrollPane    scrollPaneList;
    private       JScrollPane    scrollPaneList2;
    private       JScrollPane    scrollPaneList3;
    private       JScrollPane    scrollPaneList4;
    private       JPanel         panelSincronizados;
    private       JButton        btnEmpezar;

    public InterfazSincronizados(){
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setSize(600, 500);
        this.setLocationRelativeTo(null);
        makeInternal();
        this.add(panelSincronizados);
        configurarComponentes();
        initActionListeners();
        this.setVisible(true);
    }

    private void initActionListeners() {
        btnEmpezar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HilosSincronizados objeto1=new HilosSincronizados("SubProceso1");
                HilosSincronizados objeto2=new HilosSincronizados("SubProceso2");
                HilosSincronizados objeto3=new HilosSincronizados("SubProceso3");
                HilosSincronizados objeto4=new HilosSincronizados("SubProceso4");

                try {
                    objeto1.hilo.join();
                    objeto2.hilo.join();
                    objeto3.hilo.join();
                    objeto4.hilo.join();
                }catch (InterruptedException ex){
                    System.out.println("Interrupción en el main");
                }
                System.out.println("Termina el proceso main");
            }
        });
    }

    private void configurarComponentes() {
    }

    public static void main(String[] args) {
        var objeto=new InterfazSincronizados();
    }
    private void makeInternal() {
        jList          = new JList<>();
        jList2          = new JList<>();
        jList3          = new JList<>();
        jList4          = new JList<>();
        scrollPaneList = new JScrollPane(jList);
        scrollPaneList2 = new JScrollPane(jList2);
        scrollPaneList3 = new JScrollPane(jList3);
        scrollPaneList4 = new JScrollPane(jList4);
        btnEmpezar = new JButton("Empezar");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelSincronizados=new JPanel();
        gbc.gridy = 1;
        panelSincronizados.add(scrollPaneList, gbc);
        gbc.gridx = 1;
        panelSincronizados.add(scrollPaneList2, gbc);
        gbc.gridy = 1;
        panelSincronizados.add(scrollPaneList3, gbc);
        gbc.gridx = 1;
        panelSincronizados.add(scrollPaneList4, gbc);
        gbc.gridy = 2;
        panelSincronizados.add(btnEmpezar, gbc);
    }
}
