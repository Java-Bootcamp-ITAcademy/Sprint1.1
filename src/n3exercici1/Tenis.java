/*** S1.1 Nivell 3 exercici 1 ***/
package n3exercici1;

public class Tenis extends Noticia {
    public String competicio;
    public String tenista;

    /* Constructor */
    public Tenis(String titol, String competicio, String tenista) {
        this.setTitol(titol);
        this.setCompeticio(competicio);
        this.setCompeticio(competicio);
    }

    /* Getters and setters */
    public String getCompeticio() {
        return competicio;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public String getTenista() {
        return tenista;
    }

    public void setTenista(String tenista) {
        this.tenista = tenista;
    }

    /* Overriding inherited methods */
    @Override
    public double calcularPreuNoticia() {
        double preu = 150;
        if (tenista.equals("Federer") || tenista.equals("Djokovic") || tenista.equals("Nadal")) preu += 100;
        return preu;
    }

    @Override
    public int calcularPuntuacioNoticia() {
        var puntuacio = 4;
        if (tenista.equals("Federer") || tenista.equals("Djokovic") || tenista.equals("Nadal")) puntuacio += 3;
        return puntuacio;
    }
}
