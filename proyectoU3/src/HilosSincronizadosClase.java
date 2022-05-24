import javax.swing.*;

public class HilosSincronizadosClase {
    DefaultListModel modelo  = new DefaultListModel();
    DefaultListModel modelo2 = new DefaultListModel();
    DefaultListModel modelo3  = new DefaultListModel();
    DefaultListModel modelo4 = new DefaultListModel();
    synchronized void ciclo(String nombreHilo){
        System.out.println("Comienza hilo: "+nombreHilo);
        modelo.addElement("Comienza hilo: "+nombreHilo);
        modelo2.addElement("Comienza hilo: "+nombreHilo);
        for (int i=1;i<=5;i++){
            System.out.println(nombreHilo+": "+i);
            modelo.addElement(nombreHilo+": "+i);
            modelo2.addElement(nombreHilo+": "+i);
        }
        modelo.addElement("Termina hilo: "+nombreHilo);
        modelo2.addElement("Termina hilo: "+nombreHilo);
        System.out.println("Termina hilo: "+nombreHilo);
        switch (nombreHilo){
            case "SubProceso1":
                InterfazSincronizados.jList.setModel(modelo);
                break;
            case "SubProceso2":
                InterfazSincronizados.jList2.setModel(modelo2);
                break;
        }

    }
    synchronized void cicloLetras(String nombreHilo){
        System.out.println("Comienza hilo: "+nombreHilo);
        modelo3.addElement("Comienza hilo: "+nombreHilo);
        modelo4.addElement("Comienza hilo: "+nombreHilo);
        for (int i=1;i<=5;i++){
            System.out.println(nombreHilo+": "+(char)(i+96));
            modelo3.addElement(nombreHilo+": "+(char)(i+96));
            modelo4.addElement(nombreHilo+": "+(char)(i+96));

        }
        modelo3.addElement("Termina hilo: "+nombreHilo);
        modelo4.addElement("Termina hilo: "+nombreHilo);
        System.out.println("Termina hilo: "+nombreHilo);
        switch (nombreHilo){
            case "SubProceso3":
                InterfazSincronizados.jList3.setModel(modelo3);
                break;
            case "SubProceso4":
                InterfazSincronizados.jList4.setModel(modelo4);
                break;
        }
    }
}
