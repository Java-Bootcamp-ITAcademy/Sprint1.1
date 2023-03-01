/*** S1.1 Nivell 3 exercici 1 ***/
package n3exercici1;

public class Motociclisme extends Noticia {
    private String equip;

    /*Constructor */
    public Motociclisme(String titol, String equip) {
        this.setTitol(titol);
        this.setEquip(equip);
    }

    /* Getters and setters */
    public String getEquip() {
        return equip;
    }

    public void setEquip(String equip) {
        this.equip = equip;
    }

    /* Overriding inherited methods */
    @Override
    public double calcularPreuNoticia() {
        double preu = 100;
        if (equip.equals("Honda") || equip.equals("Yamaha")) preu += 50;
        return preu;
    }

    @Override
    public int calcularPuntuacioNoticia() {
        var puntuacio = 3;
        if (equip.equals("Honda") || equip.equals("Yamaha")) puntuacio += 3;
        return puntuacio;
    }
}
