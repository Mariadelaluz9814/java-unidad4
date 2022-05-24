public class hilosPruebaAtributos implements Runnable{
    Thread nombreHilo;
    hilosPruebaAtributos(String name){
        nombreHilo=new Thread(this,name);
        nombreHilo.start();
        System.out.println("Se manda a llamar Subproceso");
    }
    public void run(){
        int i=0;
        System.out.println("Subproceso: "+nombreHilo.getName()+". Antes del ciclo. Prioridad: "+nombreHilo.getPriority());
        for (i=0;i<5;i++){
            System.out.println("Hilo "+i);
            try {
              Thread.sleep(1000);
              System.out.println("Subproceso: "+nombreHilo.getName()+" Ya despertó, Prioridad: "+nombreHilo.getPriority());
            }catch (InterruptedException exc){
                System.out.println("Interrupción en Hilo");
            }
        }
        System.out.println("Termina Hilo");
    }

    public static void main(String[] args) {
        hilosPruebaAtributos objeto=new hilosPruebaAtributos("Hijo");
        System.out.println("Inicia proceso Main");
        for (int i = 0; i < 10; i++) {
            System.out.println("Main "+i);
            if (objeto.nombreHilo.isAlive()){
                System.out.println("El proceso HIJO todavia tiene vida");
            }
        }
        System.out.println();
        System.out.println("Termina proceso Main");
    }
}
