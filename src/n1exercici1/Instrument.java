/*** S1.1 Nivell 1 exercici 1 ***/

package n1exercici1;

public abstract class Instrument {
    private String name;  //Instrument name
    private int preu;  //Intrument price
    private static int num_instruments_creats;  //How many instruments have been created

    /* Constructor */
    public Instrument(String name, int preu) {
        setName(name);
        setPreu(preu);
    }

    public static void convoca_grup() {  //Band has been set
        System.out.println("\nEl grup ha estat convocat");
        System.out.println();
    }

    static {                // Static initialization block. Must be executed once and only once
        convoca_grup();
    }

    /* Getters and setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreu() {
        return preu;
    }

    public static int getNum_instruments_creats() {
        return num_instruments_creats;
    }

    public static void setNum_instruments_creats() {
        Instrument.num_instruments_creats++;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }
    /* Abstract method declaration */
    public abstract void tocar();

}
