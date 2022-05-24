import javax.swing.*;

public class HilosSincronizados implements Runnable{
    public Thread hilo;
    String           nombreHilo;
    DefaultListModel modelo  = new DefaultListModel();
    DefaultListModel modelo2 = new DefaultListModel();
    DefaultListModel modelo3  = new DefaultListModel();
    DefaultListModel modelo4 = new DefaultListModel();
    static HilosSincronizadosClase objeto= new HilosSincronizadosClase();
    HilosSincronizados(String nombrehilo){
        hilo=new Thread(this,nombrehilo);
        nombreHilo=nombrehilo;
        hilo.start();
    }
    public void run(){
        synchronized (objeto){
            switch (nombreHilo){
                case "SubProceso1":
                    objeto.ciclo(nombreHilo);
                    break;
                case "SubProceso2":
                    objeto.ciclo(nombreHilo);
                    break;
                case "SubProceso3":
                    objeto.cicloLetras(nombreHilo);
                    break;
                case "SubProceso4":
                    objeto.cicloLetras(nombreHilo);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        HilosSincronizados objeto1=new HilosSincronizados("SubProceso1");
        HilosSincronizados objeto2=new HilosSincronizados("SubProceso2");
        HilosSincronizados objeto3=new HilosSincronizados("SubProceso3");
        HilosSincronizados objeto4=new HilosSincronizados("SubProceso4");

        try {
            objeto1.hilo.join();
            objeto2.hilo.join();
            objeto3.hilo.join();
            objeto4.hilo.join();
        }catch (InterruptedException e){
            System.out.println("Interrupción en el main");
        }
        System.out.println("Termina el proceso main");
    }
}
