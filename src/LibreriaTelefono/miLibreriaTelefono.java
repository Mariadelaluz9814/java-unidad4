package LibreriaTelefono;
import javax.swing.JOptionPane;
public class miLibreriaTelefono {
    private String numserie, marca, memoria, pantalla;

    public miLibreriaTelefono(String numserie, String marca, String memoria, String pantalla) {
        this.numserie = numserie;
        this.marca = marca;
        this.memoria = memoria;
        this.pantalla = pantalla;
    }

    public String getNumserie() {
        return numserie;
    }

    public void setNumserie(String numserie) {
        this.numserie = numserie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }
}
