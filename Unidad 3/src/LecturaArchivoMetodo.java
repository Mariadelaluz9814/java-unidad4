import java.io.*;
public class LecturaArchivoMetodo {
    static String concatenado="";
    static String cadena="";
    void LeerArchivo(String Archivo){
        try {
            Thread.sleep(1000);
            try {
                String cadena;
                FileReader objeto1=new FileReader(Archivo);
                BufferedReader objeto2=new BufferedReader(objeto1);
                cadena=objeto2.readLine();
                objeto2.close();
                concatenado+=cadena+"\n";
            }catch (Exception e){
                System.out.println("Excepción "+e);
            }
        }catch (InterruptedException e2){
            System.out.println("Excepción "+e2);
        }
    }
    synchronized void ImprimeArchivo(){
        System.out.println("(Hilo1 e Hilo5)El archivo leido contiene:\n"+concatenado);
    }
    synchronized void Captura(){
        try {
            byte datos[]=new byte[15];
            System.out.println();
            System.out.println("Teclea alguna palabra: ");
            System.in.read(datos);
            for (int i=0;i<datos.length;i++){
                cadena+=(char)datos[i];
            }
            System.out.println("(Hilo2)La cadena que escribiste es: \t "+cadena);
        }catch (java.io.IOException exc){
            System.out.println("Excepción");
        }
    }
    synchronized void Ciclo(){
        for (int i=1; i<=4; i++){
            System.out.println("Hilo: "+i);
            System.out.println("Termina (Hilo3)");
            System.out.println();
        }
    }
}
