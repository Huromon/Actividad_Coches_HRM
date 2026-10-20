
public class Pista {
    private final Boolean[] pista = new Boolean[2];

    public Pista(){
        pista[0]=false;
        pista[1]=false;
    }

    public synchronized  int acuparPista() throws InterruptedException {
        int pistaLibre = -1;
        while ((pistaLibre = obtPistasLibres())==-1){
            wait();
        }
        pista[pistaLibre] = true;
    return pistaLibre;
    }
    public synchronized void salir(int pist){
    pista[pist] = false;
    notifyAll();
    }

    private int obtPistasLibres() {
        if (!pista[0]) return 0;
        if (!pista[1]) return 1;
        return -1;
    }


}
