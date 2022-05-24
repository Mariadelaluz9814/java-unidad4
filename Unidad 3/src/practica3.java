import javax.swing.*;

public class practica3 implements Runnable{
    public Thread hilo;
    String nombreHilo;
    practica3 (String nomHilo){
        hilo = new Thread (this, nomHilo);
        nombreHilo = nomHilo;
        System.out.println ("Comienza " + hilo.getName () + " Iniciando");
        hilo.start ();
    }
    public void run(){
        System.out.println ("Comienza hilo:" + hilo.getName());
        switch (hilo.getName()){
            case "Sub_1":
                try {
                    System.out.println(hilo.getName()+" A dormir");
                    for (int i=1;i<=15;i++){
                        System.out.println("Iteración "+i+" de "+hilo.getName());
                        Thread.sleep(500);
                    }
                } catch (InterruptedException exception){
                    System.out.println ("Interrupcion en hilo " + hilo.getName ());
                }
                System.out.println("Termina Hilo"+hilo.getName());
                break;
            case "Sub_2":
                if (hilo.isAlive()){
                    System.out.println("El hilo "+hilo.getName()+" esta activo");
                }else{
                    System.out.println("El hilo "+hilo.getName()+" no está activo");
                }
                break;
            case "Sub_3":
                String palabra=JOptionPane.showInputDialog(null,"Introduce una palabra");
                JOptionPane.showMessageDialog(null,palabra);
                break;
            case "Sub_4":
                JFrame frame=new JFrame();
                frame.setSize(200,200);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                break;
            default:
                System.out.println("No se encontró hilo");
        }

    }

    public static void main(String[] args) {
        practica3 objeto1=new practica3("Sub_1");
        practica3 objeto2=new practica3("Sub_2");
        practica3 objeto3=new practica3("Sub_3");
        practica3 objeto4=new practica3("Sub_4");
        try
        {
            objeto1.hilo.join ();
            objeto2.hilo.join ();
            objeto3.hilo.join ();
            objeto4.hilo.join ();

        }
        catch (InterruptedException e)
        {
            System.out.println ("Interrupcion en el main");
        }
        System.out.println ("Termina main");
    }
    }

