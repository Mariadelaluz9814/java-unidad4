public class HiloLecturaArchivo implements Runnable{
    public Thread hilo;
    String nombreHilo;
    static LecturaArchivoMetodo objeto= new LecturaArchivoMetodo();
    HiloLecturaArchivo(String nombrehilo){
        hilo=new Thread(this,nombrehilo);
        nombreHilo=nombrehilo;
        System.out.println("Comienza el hilo de nombre: \t"+hilo.getName());
        hilo.start();
    }
    public void run(){
        synchronized (objeto){
            if (nombreHilo=="Nom_Hilo1"){
                objeto.LeerArchivo("ArchivoALeer.rtf");
            }
            if (nombreHilo=="Nom_Hilo2"){
                objeto.Captura();
            }
            if (nombreHilo=="Nom_Hilo3"){
                objeto.Ciclo();
            }
            if (nombreHilo=="Nom_Hilo4"){
                try {
                    Thread.sleep(1500);
                    if (hilo.isAlive()){
                        System.out.println("El Nom_hilo4 está vivo");
                        System.out.println("Anibal Saucedo Rosales");
                        System.out.println("El hilo tiene como prioridad: "+hilo.getPriority());
                        System.out.println("Termina (Hilo4)\n");
                    }
                }catch (InterruptedException exc){
                    System.out.println("Interrupción en hilo");
                }
            }
            if (nombreHilo=="Nom_Hilo5"){
                objeto.ImprimeArchivo();
            }
        }
    }

    public static void main(String[] args) {
        HiloLecturaArchivo objeto1=new HiloLecturaArchivo("Nom_Hilo1");
        HiloLecturaArchivo objeto2=new HiloLecturaArchivo("Nom_Hilo2");
        HiloLecturaArchivo objeto3=new HiloLecturaArchivo("Nom_Hilo3");
        HiloLecturaArchivo objeto4=new HiloLecturaArchivo("Nom_Hilo4");
        HiloLecturaArchivo objeto5=new HiloLecturaArchivo("Nom_Hilo5");

        objeto4.hilo.setPriority(Thread.MIN_PRIORITY);

        try {
            objeto1.hilo.join();
            objeto2.hilo.join();
            objeto3.hilo.join();
            objeto4.hilo.join();
            objeto5.hilo.join();
        }catch (InterruptedException e){
            System.out.println("Interrupción en el main");
        }
        System.out.println("Termina el proceso main");
    }
}
