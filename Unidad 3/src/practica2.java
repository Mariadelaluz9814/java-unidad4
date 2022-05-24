public class practica2 implements Runnable{
    public Thread hilo;
    String nombreHilo;


    practica2 (String nomHilo){
        hilo = new Thread (this, nomHilo);
        nombreHilo = nomHilo;
        System.out.println ("Comienza " + hilo.getName () + " Iniciando");
        hilo.start ();
    }
    public void run(){
        System.out.println ("Comienza hilo:" + hilo.getName());
        try {
            System.out.println(hilo.getName()+" A dormir");
            for (int i=1;i<=9;i++){
                System.out.println("Iteración "+i+" de "+hilo.getName());
                Thread.sleep(500);
            }
        } catch (InterruptedException exception){
            System.out.println ("Interrupcion en hilo " + hilo.getName ());
        }
        System.out.println("Termina Hilo"+hilo.getName());
    }

    public static void main(String[] args) {
        practica2 objeto1=new practica2("Hilo_I");
        practica2 objeto2=new practica2("Hilo_II");
        practica2 objeto3=new practica2("Hilo_III");
        practica2 objeto4=new practica2("Hilo_VI");

        objeto1.hilo.setPriority(Thread.MIN_PRIORITY);
        objeto2.hilo.setPriority(1);
        objeto3.hilo.setPriority(2);
        objeto4.hilo.setPriority(Thread.MAX_PRIORITY);
        try
        {
            objeto4.hilo.join ();
            objeto1.hilo.join ();
            objeto3.hilo.join ();
            objeto2.hilo.join ();

        }
        catch (InterruptedException e)
        {
            System.out.println ("Interrupcion en el main");
        }
        System.out.println ("Termina main");
    }
}
