import javax.swing.JOptionPane;
public class HiloTareas implements Runnable{
    public Thread hilo;
    String nombreHilo;

    HiloTareas(String nomHilo) {
        hilo = new Thread(this, nomHilo);
        nombreHilo = nomHilo;
        //System.out.println("Comienza " + hilo.getName() + " Iniciando");
        hilo.start();
    }

    @Override
    public void run() {
        switch (hilo.getName()){
            case "AlumnoTablasMultiplicar":
                String mensaje="Soy el alumno 1 y dire la tabla del ";
                int resultado;
                int tabla=Integer.parseInt(JOptionPane.showInputDialog("¿Que tabla de multiplicar deseas que el alumno 1 diga?"));
                mensaje=mensaje+tabla+":\n";
                for (int i=0; i<=10;i++){
                    resultado=i*tabla;
                    mensaje=mensaje+i+" * "+tabla+" = "+resultado+"\n";
                }
                JOptionPane.showMessageDialog(null,mensaje);
                break;
            case "AlumnoNumerosImpares":
                String mensaje2="Soy el alumno 2 y dire si los primeros ";
                int resultado2;
                int numeros=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos numeros impares deseas que el alumno 2 diga?"));
                mensaje2=mensaje2+numeros+" numeros son impares:\n";
                for (int i=1; i<=numeros;i++){
                    resultado2=i%2;
                    if (resultado2!=0){
                    mensaje2=mensaje2+"El número "+i+" es impar\n";
                    }else {
                        mensaje2=mensaje2+"El número "+i+" NO es impar\n";
                    }
                }
                JOptionPane.showMessageDialog(null,mensaje2);
                break;
        }
    }

    public static void main(String[] args) {
        HiloTareas objeto1=new HiloTareas("AlumnoTablasMultiplicar");
        HiloTareas objeto2=new HiloTareas("AlumnoNumerosImpares");


        try {
            objeto1.hilo.join();
            objeto2.hilo.join();
        }catch (InterruptedException e){
            System.out.println("Interrupción en el main");
        }
        System.out.println("Termina el proceso main");
    }
}
