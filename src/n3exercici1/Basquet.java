/*** S1.1 Nivell 3 exercici 1 ***/
package n3exercici1;

public class Basquet extends Noticia {
    private String competicio;
    private String club;

    /* Constructor */
    public Basquet(String titol, String competicio, String club) {
        this.setTitol(titol);
        this.setCompeticio(competicio);
        this.setClub(club);
    }
    /* Getters and setters */
    public String getCompeticio() {
        return competicio;
    }  //Getters and setters

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
    /* Overriding inherited methods */
    @Override
    public double calcularPreuNoticia() {
        var preu = 250.0;
        if (competicio.equals("Eurolliga")) preu += 75;
        if (club.equals("Barça") || club.equals("Madrid")) preu += 75;
        return preu;
    }

    @Override
    public int calcularPuntuacioNoticia() {
        var puntuacio = 4;
        if (competicio.equals("Eurolliga")) puntuacio += 3;
        else if (competicio.equals("ACB")) puntuacio += 2;
        if (club.equals("Barça") || club.equals("Madrid")) puntuacio += 1;
        return puntuacio;
    }
}
