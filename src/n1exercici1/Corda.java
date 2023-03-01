/*** S1.1 Nivell 1 exercici 1 ***/
package n1exercici1;

public class Corda extends Instrument {
    private static int corda_creats;   //Generated strings instruments

    public Corda() {
        super("Corda",320);
    }

    static { //Must be executed once
        System.out.println("El primer instrument de corda ha estat adquirit");
    }    //Must be executed once

    {                       //Initializing attributes through instance initialization block instead of constructor
        setNumCordaCreats();
        Instrument.setNum_instruments_creats();
        System.out.println("S'ha adquirit un instrument de " + this.getName() + " i el seu preu és de " + this.getPreu() + "€");
        System.out.println("En total hem adquirit " + corda_creats + " instruments de corda");
        System.out.println("S'han adquirit un total de " + Instrument.getNum_instruments_creats() + " instruments");
        System.out.println();
    }

    public static int getCorda_creats() {
        return corda_creats;
    }

    public static void setNumCordaCreats() {
        corda_creats++;
    }
    /* Implementing inherited method */
    public void tocar() {   //Abstract method "tocar" implementation
        System.out.println("Està sonant un instrument de corda");
    }
}
