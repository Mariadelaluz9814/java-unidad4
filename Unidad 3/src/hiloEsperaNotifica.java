public class hiloEsperaNotifica {
    public static void main(String[] args) {
        Aviso avisar = new Aviso();

        HiloRun HiloEspera1  = new HiloRun("HiloEspera1", false, avisar);
        HiloRun HiloEspera2  = new HiloRun("HiloEspera2", false, avisar);
        HiloRun HiloEspera3  = new HiloRun("HiloEspera3", false, avisar);
        HiloRun HiloNotifica = new HiloRun("HiloNotifica", true, avisar);

        HiloEspera1.start();
        HiloEspera2.start();
        HiloEspera3.start();
        HiloNotifica.start();
    }
}
