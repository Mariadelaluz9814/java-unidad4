import javax.swing.DefaultListModel;

public class UnHilo2 implements Runnable {
    public Thread hilo;
    String nombreHilo;

    UnHilo2(String nomHilo) {
        hilo = new Thread(this, nomHilo);
        nombreHilo = nomHilo;
        System.out.println("Comienza " + hilo.getName() + " Iniciando");
        hilo.start();
    }

    DefaultListModel modelo  = new DefaultListModel();
    DefaultListModel modelo2 = new DefaultListModel();

    @Override
    public void run() {
        System.out.println("Subproceso Hilo");

        switch (hilo.getName()) {
            case "SubHilo1":
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hilo 1 " + i);
                    modelo.addElement("Hilo 1 " + i);
                    Interfeaz.jList.setModel(modelo);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException exc) {
                        System.out.println("Interrupción en hilo");
                    }
                }
                System.out.println("Termina subproceso Hilo");
                break;
            case "SubHilo2":
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hilo 2 " + i);
                    modelo2.addElement("Hilo 2 " + i);
                    Interfeaz.jList2.setModel(modelo2);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException exc) {
                        System.out.println("Interrupción en hilo");
                    }
                }
                System.out.println("Termina subproceso Hilo");
                break;
        }
    }
}
