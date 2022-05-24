public class secuencia {
    public static void main(String[] args) {
        secuencia objeto = new secuencia();
        objeto.ciclo(10);
        objeto.dormir();
        objeto.ciclo(20);
        objeto.dormir();
        System.out.println("He terminado.");
    }

    public void ciclo(int valor) {
        int n = valor;
        System.out.println("Inicia ciclo de 1 hasta " + n);
        for (int i = 1; i <= n; i++) {
            System.out.println("Valor de i: " + i);
        }
    }

    public void dormir() {
        System.out.println("A dormir");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException exc) {
            System.out.println("Algo anda mal");
        }
        System.out.println("Desperté.");
    }
}
