package LibreriaProductoCliente;

public class LibreriaCliente {
    private String nombreCliente,nuemroCliente,telefono;

    public LibreriaCliente(String nombreCliente, String nuemroCliente, String telefono) {
        this.nombreCliente = nombreCliente;
        this.nuemroCliente = nuemroCliente;
        this.telefono = telefono;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNuemroCliente() {
        return nuemroCliente;
    }

    public void setNuemroCliente(String nuemroCliente) {
        this.nuemroCliente = nuemroCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}