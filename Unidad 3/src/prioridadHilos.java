public class prioridadHilos implements Runnable {
    public Thread hilo;
    String n_hilo;
    prioridadHilos (String nombreHilo){
        hilo= new Thread(this, nombreHilo);
        n_hilo=nombreHilo;
        hilo.start();
    }

    public void run(){
        System.out.println("Comienza "+hilo.getName()+" metodo run()");
        try {
            System.out.println("A dormir "+hilo.getName());
            Thread.sleep(5000);
        }catch (InterruptedException exc){
            System.out.println("Interrupción en hilo");
        }
        System.out.println("Terminando "+hilo.getName());
    }

    public static void main(String[] args) {
        prioridadHilos o1=new prioridadHilos("Sub_PROCESO_1");
        prioridadHilos o2=new prioridadHilos("Sub_PROCESO_2");
        prioridadHilos o3=new prioridadHilos("Sub_PROCESO_3");
        prioridadHilos o4=new prioridadHilos("Sub_PROCESO_4");

        o1.hilo.setPriority(Thread.NORM_PRIORITY);
        o2.hilo.setPriority(Thread.MIN_PRIORITY);
        o3.hilo.setPriority(Thread.NORM_PRIORITY);
        o4.hilo.setPriority(Thread.MAX_PRIORITY);
        try {
            o1.hilo.join();
            o2.hilo.join();
            o3.hilo.join();
            o4.hilo.join();
        }catch (InterruptedException e){
            System.out.println("Interrupción en el main");
        }
        System.out.println("Termina main");
    }
}
