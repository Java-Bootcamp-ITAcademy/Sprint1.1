/*** S1.1 Nivell 1 exercici 1 ***/

package n1exercici1;

public class Main {
    public static void main(String[] args) {
        Instrument.getNum_instruments_creats();  //Loading Instrument class by accessing static attributes

        Corda c1 = new Corda();      //Loading classes by instantiation
        Percussio p1 = new Percussio();
        Vent v1 = new Vent();
        Vent v2 = new Vent();
        Corda c2 = new Corda();

        c1.tocar();
        p1.tocar();
        v1.tocar();
    }
}
