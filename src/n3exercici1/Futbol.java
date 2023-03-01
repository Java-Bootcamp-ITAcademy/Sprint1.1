/*** S1.1 Nivell 3 exercici 1 ***/
package n3exercici1;

public class Futbol extends Noticia {
    private String competicio;
    private String club;
    private String jugador;

    /*Constructor */
    public Futbol(String titol, String competicio, String club, String jugador) {
        this.setTitol(titol);
        this.setCompeticio(competicio);
        this.setClub(club);
        this.setJugador(jugador);    //Ferran Torres. LOL
    }

    /* Getters and setters */
    public String getCompeticio() {
        return competicio;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    /* Overriding inherited maethods */
    @Override
    public double calcularPreuNoticia() {
        var preu = 300.0;
        if (competicio.equals("Lliga de Campions")) preu += 100;
        if (club.equals("Barça") || club.equals("Madrid")) preu += 100;
        if (jugador.equals("Ferran Torres") || jugador.equals("Benzema")) preu += 50;
        return preu;
    }

    @Override
    public int calcularPuntuacioNoticia() {
        var puntuacio = 5;
        if (competicio.equals("Lliga de Campions")) puntuacio += 3;
        else if (competicio.equals("Lliga")) puntuacio += 2;
        if (club.equals("Barça") || club.equals("Madrid")) puntuacio += 1;
        if (jugador.equals("Ferran Torres") || jugador.equals("Benzema")) puntuacio += 1;
        return puntuacio;

    }
}
