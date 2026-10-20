public class Main {
    static void main() {
        Pista  pista = new Pista();
        Thread v1 = new Thread(new Vehiculo("V1",pista));
        Thread v2 = new Thread(new Vehiculo("V2",pista));
        Thread v3 = new Thread(new Vehiculo("V3",pista));
        Thread v4 = new Thread(new Vehiculo("V4",pista));
        v1.start();
        v2.start();
        v3.start();
        v4.start();

    }
}
