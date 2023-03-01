/*** S1.1 Nivell 1 exercici 1 ***/
package n1exercici1;

public class Percussio extends Instrument {
    private static int percussio_creats;   //Generated percussion instruments

    public Percussio() {
        super("Percussió",640);
    }


    static {  //Must be executed once
        System.out.println("El primer instrument de percussio ha estat adquirit");
    }

    {
        setPercussio_creats();            //Initializing attributes through instance initialization block instead of constructor
        Instrument.setNum_instruments_creats();
        System.out.println("S'ha adquirit un instrument de " + this.getName() + " i el seu preu és de " + this.getPreu() + "€");
        System.out.println("En total hem adquirit " + percussio_creats + " instruments de percussio");
        System.out.println("S'han adquirit un total de " + Instrument.getNum_instruments_creats() + " instruments");
        System.out.println();
    }

    public static int getPercussio_creats() {
        return percussio_creats;
    }

    public void setPercussio_creats() {
        percussio_creats++;
    }

    /* Implementing inherited method */
    public void tocar() {
        System.out.println("Està sonant un instrument de percussió");
    }
}
