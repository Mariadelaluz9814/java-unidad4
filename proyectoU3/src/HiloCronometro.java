public class HiloCronometro implements Runnable{
    public Thread hilo;
    InterfazCronometro interfazCronometro;
    int miliSeg, min, seg, hora;
    boolean parar=true;
    boolean correr=true;
    String tiempo;

    public HiloCronometro(InterfazCronometro interfazCronometro) {
       this.interfazCronometro=interfazCronometro;
       hilo = new Thread(this, "Crono");
       hilo.start();
    }
    public void ActualizarTiempo(){

            miliSeg+=1;

        if (miliSeg>=100){
            miliSeg=0;
            seg++;
        }
        if (seg>=60){
            seg=0;
            min++;
        }
        if (min>=60){
            min=0;
            hora++;
        }
        if (hora>=24){
            hora=0;
        }
        //tiempo=hora+":"+min+":"+seg+":"+miliSeg;
        //System.out.println(tiempo);
    }
    @Override
    public void run() {
        System.out.println("");
        while (correr){
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                System.out.println("Error: "+e);
            }
            if (!parar){
                ActualizarTiempo();
            interfazCronometro.ActualizarlbTiempo();}
        }
    }
    public void Pausar(){
        parar=true;
    }
    public void Reiniciar(){
        parar=true;
        miliSeg=0;
        seg=0;
        min=0;
        hora=0;
    }
    public void Reanudar(){
        parar=false;
    }
    public void pararHilo(){
        correr=false;
    }

}
