public class HiloRun extends Thread {
    String  nombre_hilo;
    Aviso   avisar;
    boolean banedera;

    public HiloRun(String nombre_hilo, boolean bandera, Aviso avisar) {
        this.nombre_hilo = nombre_hilo;
        this.avisar = avisar;
        this.banedera = bandera;
    }

    public void run() {
        System.out.println("Llegó " + nombre_hilo);
        try {
            Thread.sleep(1500);
            if (banedera) {
                avisar.saludoNotifica(nombre_hilo);
            } else {
                avisar.saludoEspera(nombre_hilo);
            }
        } catch (InterruptedException ex) {
            System.out.println("Algo anda mal");
        }
    }
}
