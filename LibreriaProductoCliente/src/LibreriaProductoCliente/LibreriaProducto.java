package LibreriaProductoCliente;

public class LibreriaProducto {
    private String nombreProducto,numeroSerie;
    private float precio;

    public LibreriaProducto(String nombreProducto, String numeroSerie, float precio) {
        this.nombreProducto = nombreProducto;
        this.numeroSerie = numeroSerie;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
