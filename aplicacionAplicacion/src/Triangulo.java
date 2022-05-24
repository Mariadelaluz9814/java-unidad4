import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

import static LibreriaMatematicas.Matematicas.*;

public class Triangulo extends JFrame {
    private JPanel      panelTriangulo;
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;
    private JTextField  txtLadox;
    private JTextField  txtLadoy;
    private JLabel      resultadoHipotenusa;
    private JButton     calcularHipotenusaButton;
    private JTextField  txtHipotenusa;
    private JTextField  txtLado;
    private JButton     calcularLadoButton2;
    private JPanel      panelResultado;
    private JTextField  textoLadoX;
    private JTextField  txtLadoY;
    private JTextField  textHipotenusa;
    private JButton     calcularButton;
    private JLabel      lbRespuestaSeno;
    private JLabel      lbRespuestaCoseno;
    private JLabel      lbRespuestaTangente;
    private JLabel      lbRespuestaSecante;
    private JLabel      lbRespuestaCosecante;
    private JLabel      lbRespuestaCotangente;
    private JLabel      lbRespuestaSeno2;
    private JLabel      lbRespuestaCoseno2;
    private JLabel      lbRespuestaTangente2;
    private JLabel      lbRespuestaSecante2;
    private JLabel      lbRespuestaCosecante2;
    private JLabel      lbRespuestaCotangente2;
    private JButton     regresarInicioButton;
    private JLabel      lbResultadoLado;

    public Triangulo() {
        $$$setupUI$$$();
        $$$getRootComponent$$$();
        metodo3ActionListener();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(panelTriangulo);
        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Triangulo ventana = new Triangulo();
        ventana.setVisible(true);
    }

    double ladoY                      = 0;
    double ladoX                      = 0;
    double hipotenusa                 = 0;
    double resultado                  = 0;
    double resultadoSeno              = 0;
    double resultadoCoseno            = 0;
    double resultadoTangente          = 0;
    double resultadoSecante           = 0;
    double resultadoCosecante         = 0;
    double resultadoCotangente        = 0;
    double resultadoSeno2             = 0;
    double resultadoCoseno2           = 0;
    double resultadoTangente2         = 0;
    double resultadoSecante2          = 0;
    double resultadoCosecante2        = 0;
    double resultadoCotangente2       = 0;
    String resultadoString            = "";
    String resultadoSenoString        = "";
    String resultadoCosenoString      = "";
    String resultadoTangenteString    = "";
    String resultadoSecanteString     = "";
    String resultadoCosecanteString   = "";
    String resultadoCotangenteString  = "";
    String resultadoSenoString2       = "";
    String resultadoCosenoString2     = "";
    String resultadoTangenteString2   = "";
    String resultadoSecanteString2    = "";
    String resultadoCosecanteString2  = "";
    String resultadoCotangenteString2 = "";
    double catetoOpuesto              = 0;
    double catetoAdyacente            = 0;

    private void metodo3ActionListener() {
        calcularHipotenusaButton.addActionListener(e -> {
            try {
                ladoX = Double.parseDouble(txtLadox.getText());
                ladoY = Double.parseDouble(txtLadoy.getText());
                resultado = teoremaPitagorasHipotenusa(ladoX, ladoY);
                resultadoString = resultadoString + resultado;
                resultadoHipotenusa.setText(resultadoString);
            } catch (NullPointerException exc) {
                JOptionPane.showMessageDialog(null, "Falta un valor");
            }
        });
        regresarInicioButton.addActionListener(e -> dispose());
        calcularLadoButton2.addActionListener(e -> {
            try {
                hipotenusa = Double.parseDouble(txtHipotenusa.getText());
                ladoX = Double.parseDouble(txtLado.getText());
                resultado = teoremaPitagorasLado(hipotenusa, ladoX);
                resultadoString = resultadoString + resultado;
                lbResultadoLado.setText(resultadoString);
            } catch (NullPointerException excp) {
                JOptionPane.showMessageDialog(null, "Falta un valor");
            }
        });
        calcularButton.addActionListener(e -> {
            try {
                ladoX = Double.parseDouble(textoLadoX.getText());
                ladoY = Double.parseDouble(txtLadoY.getText());
                hipotenusa = Double.parseDouble(textHipotenusa.getText());
                //Angulo Alfa
                catetoOpuesto = ladoY;
                catetoAdyacente = ladoX;

                resultadoSeno = seno(catetoOpuesto, hipotenusa);
                resultadoSenoString = resultadoSenoString + resultadoSeno;
                lbRespuestaSeno.setText(resultadoSenoString);

                resultadoCoseno = coseno(catetoAdyacente, hipotenusa);
                resultadoCosenoString = resultadoCosenoString + resultadoCoseno;
                lbRespuestaCoseno.setText(resultadoCosenoString);

                resultadoTangente = tangente(catetoOpuesto, catetoAdyacente);
                resultadoTangenteString = resultadoTangenteString + resultadoTangente;
                lbRespuestaTangente.setText(resultadoTangenteString);

                resultadoSecante = secante(catetoAdyacente, hipotenusa);
                resultadoSecanteString = resultadoSecanteString + resultadoSecante;
                lbRespuestaSecante.setText(resultadoSecanteString);

                resultadoCosecante = cosecante(catetoOpuesto, hipotenusa);
                resultadoCosecanteString = resultadoCosecanteString + resultadoCosecante;
                lbRespuestaCosecante.setText(resultadoCosecanteString);

                resultadoCotangente = cotangente(catetoOpuesto, catetoAdyacente);
                resultadoCotangenteString = resultadoCotangenteString + resultadoCotangente;
                lbRespuestaCotangente.setText(resultadoCotangenteString);

                //Angulo Beta
                catetoOpuesto = ladoX;
                catetoAdyacente = ladoY;

                resultadoSeno2 = seno(catetoOpuesto, hipotenusa);
                resultadoSenoString2 = resultadoSenoString2 + resultadoSeno2;
                lbRespuestaSeno2.setText(resultadoSenoString2);

                resultadoCoseno2 = coseno(catetoAdyacente, hipotenusa);
                resultadoCosenoString2 = resultadoCosenoString2 + resultadoCoseno2;
                lbRespuestaCoseno2.setText(resultadoCosenoString2);

                resultadoTangente2 = tangente(catetoOpuesto, catetoAdyacente);
                resultadoTangenteString2 = resultadoTangenteString2 + resultadoTangente2;
                lbRespuestaTangente2.setText(resultadoTangenteString2);

                resultadoSecante2 = secante(catetoAdyacente, hipotenusa);
                resultadoSecanteString2 = resultadoSecanteString2 + resultadoSecante2;
                lbRespuestaSecante2.setText(resultadoSecanteString2);

                resultadoCosecante2 = cosecante(catetoOpuesto, hipotenusa);
                resultadoCosecanteString2 = resultadoCosecanteString2 + resultadoCosecante2;
                lbRespuestaCosecante2.setText(resultadoCosecanteString2);

                resultadoCotangente2 = cotangente(catetoOpuesto, catetoAdyacente);
                resultadoCotangenteString2 = resultadoCotangenteString2 + resultadoCotangente2;
                lbRespuestaCotangente2.setText(resultadoCotangenteString2);

            } catch (NullPointerException excep) {
                JOptionPane.showMessageDialog(null, "Falta un valor");
            }
        });
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panelTriangulo = new JPanel();
        panelTriangulo.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        panelTriangulo.setBackground(new Color(-533585));
        tabbedPane1 = new JTabbedPane();
        tabbedPane1.setBackground(new Color(-16138561));
        panelTriangulo.add(tabbedPane1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-533585));
        tabbedPane1.addTab("Teorema de Pitágoras", panel1);
        tabbedPane2 = new JTabbedPane();
        tabbedPane2.setBackground(new Color(-8559681));
        panel1.add(tabbedPane2, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(3, 3, new Insets(0, 0, 0, 0), -1, -1));
        panel2.setBackground(new Color(-533585));
        tabbedPane2.addTab("Obtener Hipotenusa", panel2);
        final JLabel label1 = new JLabel();
        label1.setForeground(new Color(-16777216));
        label1.setText("Lado x:");
        panel2.add(label1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setForeground(new Color(-16777216));
        label2.setText("Lado y:");
        panel2.add(label2, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setIcon(new ImageIcon(getClass().getResource("/mega-creator.png")));
        label3.setText("");
        panel2.add(label3, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        txtLadox = new JTextField();
        panel2.add(txtLadox, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        txtLadoy = new JTextField();
        panel2.add(txtLadoy, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setForeground(new Color(-16777216));
        label4.setText("Resultado de Hipotenusa (Lado z):");
        panel2.add(label4, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        resultadoHipotenusa = new JLabel();
        resultadoHipotenusa.setForeground(new Color(-16777216));
        resultadoHipotenusa.setText("");
        panel2.add(resultadoHipotenusa, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        calcularHipotenusaButton = new JButton();
        calcularHipotenusaButton.setBackground(new Color(-4251074));
        calcularHipotenusaButton.setText("Calcular Hipotenusa");
        panel2.add(calcularHipotenusaButton, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(3, 3, new Insets(0, 0, 0, 0), -1, -1));
        panel3.setBackground(new Color(-533585));
        tabbedPane2.addTab("Obtener Lado", panel3);
        final JLabel label5 = new JLabel();
        label5.setForeground(new Color(-16777216));
        label5.setText("Hipotenusa (Lado z):");
        panel3.add(label5, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label6 = new JLabel();
        label6.setForeground(new Color(-16777216));
        label6.setText("Lado x o y:");
        panel3.add(label6, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label7 = new JLabel();
        label7.setForeground(new Color(-16777216));
        label7.setText("Resultado:");
        panel3.add(label7, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label8 = new JLabel();
        label8.setIcon(new ImageIcon(getClass().getResource("/mega-creator.png")));
        label8.setText("");
        panel3.add(label8, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        txtHipotenusa = new JTextField();
        panel3.add(txtHipotenusa, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        txtLado = new JTextField();
        panel3.add(txtLado, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        lbResultadoLado = new JLabel();
        lbResultadoLado.setForeground(new Color(-16777216));
        lbResultadoLado.setText("");
        panel3.add(lbResultadoLado, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        calcularLadoButton2 = new JButton();
        calcularLadoButton2.setBackground(new Color(-4251074));
        calcularLadoButton2.setText("Calcular Lado");
        panel3.add(calcularLadoButton2, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayoutManager(4, 3, new Insets(0, 0, 0, 0), -1, -1));
        panel4.setBackground(new Color(-533585));
        tabbedPane1.addTab("Funciones trigonométricas", panel4);
        final JLabel label9 = new JLabel();
        label9.setForeground(new Color(-16777216));
        label9.setText("Lado x:");
        panel4.add(label9, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label10 = new JLabel();
        label10.setForeground(new Color(-16777216));
        label10.setText("Lado y:");
        panel4.add(label10, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label11 = new JLabel();
        label11.setForeground(new Color(-16777216));
        label11.setText("Hipotenusa (lado z):");
        panel4.add(label11, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label12 = new JLabel();
        label12.setIcon(new ImageIcon(getClass().getResource("/mega-creator.png")));
        label12.setText("");
        panel4.add(label12, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textoLadoX = new JTextField();
        panel4.add(textoLadoX, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        txtLadoY = new JTextField();
        panel4.add(txtLadoY, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        textHipotenusa = new JTextField();
        panel4.add(textHipotenusa, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        calcularButton = new JButton();
        calcularButton.setBackground(new Color(-4251074));
        calcularButton.setText("Calcular");
        panel4.add(calcularButton, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panelResultado = new JPanel();
        panelResultado.setLayout(new GridLayoutManager(9, 4, new Insets(0, 0, 0, 0), -1, -1));
        panelResultado.setBackground(new Color(-533585));
        panel4.add(panelResultado, new GridConstraints(3, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label13     = new JLabel();
        Font         label13Font = this.$$$getFont$$$("DecoType Naskh", Font.BOLD | Font.ITALIC, 18, label13.getFont());
        if (label13Font != null) label13.setFont(label13Font);
        label13.setForeground(new Color(-16777216));
        label13.setText("Ángulo alfa");
        panelResultado.add(label13, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label14 = new JLabel();
        label14.setForeground(new Color(-16777216));
        label14.setText("Seno:");
        panelResultado.add(label14, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label15 = new JLabel();
        label15.setForeground(new Color(-16777216));
        label15.setText("Cateto Opuesto = Lado y");
        panelResultado.add(label15, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbRespuestaSeno = new JLabel();
        lbRespuestaSeno.setForeground(new Color(-16777216));
        lbRespuestaSeno.setText("");
        panelResultado.add(lbRespuestaSeno, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label16 = new JLabel();
        label16.setForeground(new Color(-16777216));
        label16.setText("Coseno:");
        panelResultado.add(label16, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label17 = new JLabel();
        label17.setForeground(new Color(-16777216));
        label17.setText("Tangente:");
        panelResultado.add(label17, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label18 = new JLabel();
        label18.setForeground(new Color(-16777216));
        label18.setText("Cosecante:");
        panelResultado.add(label18, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label19 = new JLabel();
        label19.setForeground(new Color(-16777216));
        label19.setText("Cotangente:");
        panelResultado.add(label19, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label20 = new JLabel();
        label20.setForeground(new Color(-16777216));
        label20.setText("Secante:");
        panelResultado.add(label20, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbRespuestaCoseno = new JLabel();
        lbRespuestaCoseno.setForeground(new Color(-16777216));
        lbRespuestaCoseno.setText("");
        panelResultado.add(lbRespuestaCoseno, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbRespuestaTangente = new JLabel();
        lbRespuestaTangente.setForeground(new Color(-16777216));
        lbRespuestaTangente.setText("");
        panelResultado.add(lbRespuestaTangente, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbRespuestaSecante = new JLabel();
        lbRespuestaSecante.setForeground(new Color(-16777216));
        lbRespuestaSecante.setText("");
        panelResultado.add(lbRespuestaSecante, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbRespuestaCosecante = new JLabel();
        lbRespuestaCosecante.setForeground(new Color(-16777216));
        lbRespuestaCosecante.setText("");
        panelResultado.add(lbRespuestaCosecante, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbRespuestaCotangente = new JLabel();
        lbRespuestaCotangente.setForeground(new Color(-16777216));
        lbRespuestaCotangente.setText("");
        panelResultado.add(lbRespuestaCotangente, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label21     = new JLabel();
        Font         label21Font = this.$$$getFont$$$("DecoType Naskh", Font.BOLD | Font.ITALIC, 18, label21.getFont());
        if (label21Font != null) label21.setFont(label21Font);
        label21.setForeground(new Color(-16777216));
        label21.setText("Ángulo Beta");
        panelResultado.add(label21, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label22 = new JLabel();
        label22.setForeground(new Color(-16777216));
        label22.setText("Cateto Opuesto = Lado x");
        panelResultado.add(label22, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label23 = new JLabel();
        label23.setForeground(new Color(-16777216));
        label23.setText("Cateto Adyacente = Lado y");
        panelResultado.add(label23, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label24 = new JLabel();
        label24.setForeground(new Color(-16777216));
        label24.setText("Seno:");
        panelResultado.add(label24, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label25 = new JLabel();
        label25.setForeground(new Color(-16777216));
        label25.setText("Coseno:");
        panelResultado.add(label25, new GridConstraints(4, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label26 = new JLabel();
        label26.setForeground(new Color(-16777216));
        label26.setText("Tangente:");
        panelResultado.add(label26, new GridConstraints(5, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label27 = new JLabel();
        label27.setForeground(new Color(-16777216));
        label27.setText("Secante:");
        panelResultado.add(label27, new GridConstraints(6, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label28 = new JLabel();
        label28.setForeground(new Color(-16777216));
        label28.setText("Cosecante:");
        panelResultado.add(label28, new GridConstraints(7, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label29 = new JLabel();
        label29.setForeground(new Color(-16777216));
        label29.setText("Cotangente:");
        panelResultado.add(label29, new GridConstraints(8, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbRespuestaSeno2 = new JLabel();
        lbRespuestaSeno2.setForeground(new Color(-16777216));
        lbRespuestaSeno2.setText("");
        panelResultado.add(lbRespuestaSeno2, new GridConstraints(3, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbRespuestaCoseno2 = new JLabel();
        lbRespuestaCoseno2.setForeground(new Color(-16777216));
        lbRespuestaCoseno2.setText("");
        panelResultado.add(lbRespuestaCoseno2, new GridConstraints(4, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbRespuestaTangente2 = new JLabel();
        lbRespuestaTangente2.setForeground(new Color(-16777216));
        lbRespuestaTangente2.setText("");
        panelResultado.add(lbRespuestaTangente2, new GridConstraints(5, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbRespuestaSecante2 = new JLabel();
        lbRespuestaSecante2.setForeground(new Color(-16777216));
        lbRespuestaSecante2.setText("");
        panelResultado.add(lbRespuestaSecante2, new GridConstraints(6, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbRespuestaCosecante2 = new JLabel();
        lbRespuestaCosecante2.setForeground(new Color(-16777216));
        lbRespuestaCosecante2.setText("");
        panelResultado.add(lbRespuestaCosecante2, new GridConstraints(7, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lbRespuestaCotangente2 = new JLabel();
        lbRespuestaCotangente2.setForeground(new Color(-16777216));
        lbRespuestaCotangente2.setText("");
        panelResultado.add(lbRespuestaCotangente2, new GridConstraints(8, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JLabel label30 = new JLabel();
        label30.setForeground(new Color(-16777216));
        label30.setText("Cateto Adyacente = Lado x");
        panelResultado.add(label30, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        regresarInicioButton = new JButton();
        regresarInicioButton.setBackground(new Color(-13686337));
        regresarInicioButton.setText("Regresar Inicio");
        panelTriangulo.add(regresarInicioButton, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font    font             = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac            = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font    fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panelTriangulo;
    }

}
