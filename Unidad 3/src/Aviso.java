public class Aviso {
    boolean bandera = false;

    public Aviso() {
    }

    public synchronized void saludoEspera(String nombre_hilo) {
        try {
            if (bandera == false) {
                wait();
            }
            System.out.println("\n Trabajando: " + nombre_hilo);
        } catch (InterruptedException ex) {
            System.out.println("Algo anda mal");
        }
    }

    public synchronized void saludoNotifica(String nombre_hilo) {
        bandera = true;
        System.out.println("\n A trabajar: " + nombre_hilo);
        notifyAll();
    }
}

