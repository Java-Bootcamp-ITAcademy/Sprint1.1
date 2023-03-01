/*** S1.1 Nivell 2 exercici 1 ***/
package n2exercici1;

public class Smartphone extends Telefon implements Camera, Rellotge {

    /* Constructor */
    public Smartphone(String marca, String model) {    //Smartphone class constructor
        super(marca, model);    //Calling parent class constructor
        System.out.println("The Smartphone is a " + this.getMarca() + " " + this.getModel());    //Printing brand and model
    }

    /* Implementing inherited methods */
    public void fotografiar() {    //Implementing method from Camera interface
        System.out.println("S'està fent una foto");
    }

    public void alarma() {    //Implementing method from Rellotge interface
        System.out.println("Està sonant l'alarma");
    }

}
