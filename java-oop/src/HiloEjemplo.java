public class HiloEjemplo extends Thread {
    int miIdent;

    HiloEjemplo(int ident) {
        this.miIdent = ident;
    }
    public void run(){
        int i;
        for (i = 1; i < 11; i++)
            System.out.println("Hilo "+ miIdent + ": "+i);
    }
}
