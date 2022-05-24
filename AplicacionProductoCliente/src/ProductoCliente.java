import LibreriaProductoCliente.LibreriaCliente;
import LibreriaProductoCliente .LibreriaProducto;
import javax.swing.JOptionPane;
public class ProductoCliente {

    public ProductoCliente(){
        int menuOpciones;
        String nombreProducto="", nombreCliente="",numeroSerie="", numeroCliente="", telefonoCliente="";
        float precio=0;
        String menu="¿Que desea realizar?\n1-Capturar datos del Cliente\n2-Capturar datos del Producto";
        menuOpciones=Integer.parseInt(JOptionPane.showInputDialog(null,menu));
        switch (menuOpciones){
            case 1:
                LibreriaCliente cliente=new LibreriaCliente(numeroCliente,nombreCliente,telefonoCliente);
                numeroCliente=JOptionPane.showInputDialog(null,"Introduzca el Número de Cliente");
                cliente.setNombreCliente(String.valueOf(numeroCliente));
                nombreCliente=JOptionPane.showInputDialog(null,"Introduzca el nombre del cliente");
                cliente.setNombreCliente(nombreCliente);
                telefonoCliente=JOptionPane.showInputDialog(null,"Introduzca el número de teléfono del cliente (Sin guiones)");
                cliente.setTelefono(telefonoCliente);
                JOptionPane.showMessageDialog(null,"Número de cliente: "+numeroCliente+"\nNombre del cliente: "+nombreCliente+"\nTeléfono del cliente: "+telefonoCliente);
                break;
            case 2:
                LibreriaProducto producto=new LibreriaProducto(numeroSerie,nombreProducto,precio);
                numeroSerie=JOptionPane.showInputDialog(null,"Introduce el Número de serie del Producto");
                producto.setNumeroSerie(numeroSerie);
                nombreProducto=JOptionPane.showInputDialog(null,"Introduce el nombre del producto");
                producto.setNombreProducto(nombreProducto);
                precio=Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce el precio del producto"));
                producto.setPrecio(precio);
                JOptionPane.showMessageDialog(null,"Número de serie: "+numeroSerie+"\nNombre del Producto: "+nombreProducto+"\nPrecio del producto: $ "+precio);
                break;
        }
    }
    public static void main (String args[]){
        ProductoCliente nuevo=new ProductoCliente();
    }
}