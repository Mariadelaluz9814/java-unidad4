public class unHilo implements Runnable{
    public void run(){
        System.out.println("Subproceso Hilo");
        int i=0;
        for (i=0;i<5;i++){
            System.out.println("Hilo "+i);
            try {
                Thread.sleep(3000);
            }catch (InterruptedException exc){
                System.out.println("Interrupción en Hilo");
            }
        }
        System.out.println("Termina subroceso Hilo");
    }

    public static void main(String a[]) {
        unHilo objeto=new unHilo();
        Thread hilo=new Thread(objeto);
        hilo.start();
        System.out.println("Se manda a llamar al subproceso Hilo");
        System.out.println("Proceso Main");
        for (int i=0;i<10;i++)
            System.out.println("Main "+i);
        System.out.println();
        System.out.println("Termina proceso Main");
    }
}