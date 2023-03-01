/*** S1.1 Nivell 1 exercici 1 ***/
package n1exercici1;

public class Vent extends Instrument {

    private static int vent_creats;    //Generated wind instrumemnts

    public Vent() {
        super("Vent",180);
    }

    static {
        System.out.println("El primer instrument de vent ha estat adquirit");
    }    //Must be executed once

    {
        setVent_creats();       //Initializing attributes through instance initialization block instead of constructor
        Instrument.setNum_instruments_creats();
        System.out.println("S'ha adquirit un instrument de " + this.getName() + " i el seu preu és de " + this.getPreu() + "€");
        System.out.println("En total hem adquirit " + getVent_creats() + " instruments de vent");
        System.out.println("S'han adquirit un total de " + Instrument.getNum_instruments_creats() + " instruments");
        System.out.println();
    }

    public static int getVent_creats() {
        return vent_creats;
    }

    public void setVent_creats() {
        vent_creats++;
    }

    /* Implementing inherited method */
    public void tocar() {    //Abstract method "tocar" implementation
        System.out.println("Està sonant un instrument de vent");
    }
}
