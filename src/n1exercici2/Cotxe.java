/*** S1.1 Nivell 1 exercici 2 ***/

package n1exercici2;

public class Cotxe {
    private static final String MARCA;   //Must be initialized since it's a final variable. We'll do in static block.
    private static String model;    //CAN be initialized in a static block initializer.
    private final double potencia;    //Must be initialized since it's a final attribute. We'll do it in the constructor

    static {
        MARCA = "Seat";      //Static attributes initialization.
        model = "Arona";
    }
    /* Constructor */
    public Cotxe(double potencia) {
        this.potencia = potencia;    // Attributes initialization

    }

    /* Getters and setters */

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Cotxe.model = model;
    }

    public double getPotencia() {
        return potencia;
    }

    /* Static methods declaration */
    public static void frenar() {
        System.out.println("El vehicle està frenant");
    }

    public void accelerar() {
        System.out.println("El vehicle està accelerant");
    }

}
