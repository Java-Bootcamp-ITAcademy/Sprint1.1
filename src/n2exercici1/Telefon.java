/*** S1.1 Nivell 2 exercici 1 ***/
package n2exercici1;

public class Telefon {
    String marca;    //Attributes decalaration
    String model;

    /* Constructor */
    public Telefon(String marca, String model) {
        this.setMarca(marca);
        this.setModel(model);

    }
    /* Getters and setters */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getMarca() {
        return marca;
    }
    public void trucar(String num_telefon) {    //trucar method declaration
        System.out.println(num_telefon);
    }    //Trucar method decalaration

}
