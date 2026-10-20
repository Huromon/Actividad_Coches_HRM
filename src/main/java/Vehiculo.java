import java.util.Random;


public class Vehiculo implements Runnable {
    private String nombre;
    private final  Pista pista;
    private final Random random = new Random();
    static int ntest =0;
    Vehiculo(String nombre, Pista pista){
        this.nombre = nombre;
        this.pista = pista;
    }

    @Override
    public void run(){
        while (ntest < 50) {
            try {
                int pistOcup = pista.acuparPista();
                System.out.println(nombre+" ha entrado en la pista: "+ pistOcup);
                int te = (random.nextInt(3) + 4) * 1000;
                Thread.sleep(te);
                System.out.println(nombre+" ha salido de las"+pistOcup+" tras "+te/1000 + " segundos");
                pista.salir(pistOcup);
                Thread.sleep(500);
                ntest++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
