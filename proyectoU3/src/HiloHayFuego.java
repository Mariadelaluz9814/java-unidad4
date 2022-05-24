public class HiloHayFuego implements Runnable {
    public Thread hilo;
    boolean hayFuego=true;

    HiloHayFuego() {
        hilo = new Thread(this);
        System.out.println("Comienza " + hilo.getName() + " Iniciando");
        hilo.start();
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(2000);
            }catch (InterruptedException ex){
                System.out.println("Se interrumpio hilo infinito");
            }
            if (hayFuego){
                System.out.println("¡Hay fuego!");
            }else {
                System.out.println("Ya no hay fuego");
            }

        }
    }
    public void apagarFuego(){
        hayFuego=false;
    }
}
