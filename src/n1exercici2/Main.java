/*** S1.1 Nivell 1 exercici 2 ***/
package n1exercici2;

public class Main {
    public static void main(String[] args) {
        Cotxe.frenar();    //Calling static method. Not Cotxe instance is required
        Cotxe cotxe = new Cotxe(138.21);    //New Cotxe class instance is created
        cotxe.accelerar();    //Calling instance method

    }
}
