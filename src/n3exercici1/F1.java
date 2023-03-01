/*** S1.1 Nivell 3 exercici 1 ***/
package n3exercici1;

public class F1 extends Noticia {
    private String escuderia;

    /*Constructor */
    public F1(String titol, String escuderia) {
        this.setTitol(titol);
        this.setEscuderia(escuderia);
    }

    /* Getters and setters */
    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    /*Overriding inherited methods */
    @Override
    public double calcularPreuNoticia() {
        double preu = 100;
        if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) preu += 50;
        return preu;
    }

    @Override
    public int calcularPuntuacioNoticia() {
        var puntuacio = 4;
        if (escuderia.equals("Ferrari") || escuderia.equals("Mercedes")) puntuacio += 2;
        return puntuacio;
    }
}
