
public class prectica1 implements Runnable {
    public Thread hilo;
    String nombreHilo;
    int tiempoSleep;

    prectica1 (String nomHilo){
        hilo = new Thread (this, nomHilo);
        nombreHilo = nomHilo;
        System.out.println ("Comienza " + hilo.getName () + " Iniciando");
        hilo.start ();
    }
    public void run(){
        System.out.println ("Comienza hilo:" + hilo.getName());
        try {
                for (int i=1;i<=10;i++){
                    tiempoSleep= (int) (Math.random() * 5000)+1000;
                    System.out.println(hilo.getName()+" A dormir por: "+tiempoSleep+" milisegundos");
                    Thread.sleep(tiempoSleep);
                }

        } catch (InterruptedException exception){
            System.out.println ("Interrupcion en hilo " + hilo.getName ());
        }
    }

    public static void main(String[] args) {
        prectica1 objeto1=new prectica1("Primer Hilo");
        prectica1 objeto2=new prectica1("Segundo Hilo");

        objeto1.hilo.setPriority(Thread.MAX_PRIORITY);
        objeto2.hilo.setPriority(Thread.MIN_PRIORITY);
        try
        {
            objeto1.hilo.join ();
            objeto2.hilo.join ();

        }
        catch (InterruptedException e)
        {
            System.out.println ("Interrupcion en el main");
        }
        System.out.println ("Termina main");
    }
}
