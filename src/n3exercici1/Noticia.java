/*** S1.1 Nivell 3 exercici 1 ***/
package n3exercici1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public abstract class Noticia {
    private String titol;
    private String text;

    /* Getters and setters */
    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /* Overriding haschcode and equals */
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) {
            return true;
        }
        if(!(obj instanceof Noticia)) {
            return false;
        }
        Noticia noticia=(Noticia) obj;
        return this.getTitol().equals(noticia.getTitol());
    }

    public static void afegirNoticia(Set<Redactor> redactors, Scanner sc) {
        Noticia noticia = null;
        System.out.println("Introdueix titular");
        var titular = sc.nextLine();
        System.out.println("Introdueix esport: F-Futbol, B-Bàsquet, T-Tennis, F1-Fórmula 1, M-Motociclisme");
        var tipus = sc.nextLine();
        switch (tipus) {
            /* Football new */
            case "F": {
                System.out.println("Introdueix competició");
                var competicio = sc.nextLine();
                System.out.println("Introdueix club");
                var club = sc.nextLine();
                System.out.println("Introdueix jugador");
                var jugador = sc.nextLine();
                noticia = new Futbol(titular, competicio, club, jugador);
                break;
            }
            /* Basketball new */
            case "B": {
                System.out.println("Introdueix competició");
                var competicio = sc.nextLine();
                System.out.println("Introdueix club");
                var club = sc.nextLine();
                noticia = new Basquet(titular, competicio, club);
                break;
            }
            /* Tennis new */
            case "T": {
                System.out.println("Introdueix competició");
                var competicio = sc.nextLine();
                System.out.println("Introdueix tenista");
                var tenista = sc.nextLine();
                noticia = new Tenis(titular, competicio, tenista);
                break;
            }
            /* F1 new */
            case "F1": {
                System.out.println("Introdueix escuderia");
                var escuderia = sc.nextLine();
                noticia = new F1(titular, escuderia);
                break;
            }
            /* Motorbike new */
            case "M": {
                System.out.println("Introdueix equip");
                var equip = sc.nextLine();
                noticia = new Motociclisme(titular, equip);
                break;
            }
        }
        /* Choosing redactor and adding new to his news set*/
        System.out.println("Introdueix el nom redactor");
        var nom = sc.nextLine();
        System.out.println("Introdueix el DNI redactor");
        var DNI = sc.nextLine();
        var redactor = new Redactor(nom, DNI);
        for (Redactor redactor_aux : redactors) {
            if (redactor_aux.equals(redactor)) redactor_aux.getNoticies().add(noticia);
        }
    }

    public static void eliminarNoticia(Set<Redactor> redactors, Scanner sc) {
        System.out.println("Introdueix el nom redactor");
        var nom = sc.nextLine();
        System.out.println("Introdueix el DNI redactor");
        var DNI = sc.nextLine();
        var redactor = new Redactor(nom, DNI);
        System.out.println("Introdueix titular");
        var titular = sc.nextLine();
        var notFound=true;
        for (Redactor redactor_aux : redactors) {
            if (redactor.equals(redactor_aux)) {
                Iterator<Noticia> it=redactor_aux.getNoticies().iterator();
                while(it.hasNext()&&notFound) {
                    Noticia noticia=it.next();
                    String titol=noticia.getTitol();
                    if(titol.equals(titular)) {
                        it.remove();
                        notFound=false;
                    }
                }
            }
        }
    }
    public static void calcularPreuTotal(Set<Redactor> redactors,Scanner sc) {
        System.out.println("Introdueix el nom redactor");
        var nom = sc.nextLine();
        System.out.println("Introdueix el DNI redactor");
        var DNI = sc.nextLine();
        var redactor = new Redactor(nom, DNI);
        System.out.println("Introdueix el titular");
        var titular = sc.nextLine();
        for (Redactor redactor_aux : redactors) {
            if (redactor_aux.equals(redactor)) {
                for (Noticia noticia : redactor_aux.getNoticies()) {
                    if (noticia.getTitol().equals(titular))
                        System.out.printf("El preu de la notícia és de %.2f\n", noticia.calcularPreuNoticia());
                }
            }
        }
    }

    public static void calcularPuntuacioTotal(Set<Redactor> redactors,Scanner sc) {
        System.out.println("Introdueix el nom redactor");
        var nom = sc.nextLine();
        System.out.println("Introdueix el DNI redactor");
        var DNI = sc.nextLine();
        var redactor = new Redactor(nom, DNI);
        System.out.println("Introdueix el titular");
        var titular = sc.nextLine();
        for (Redactor redactor_aux : redactors) {
            if (redactor_aux.equals(redactor)) {
                for (Noticia noticia : redactor_aux.getNoticies()) {
                    if (noticia.getTitol().equals(titular))
                        System.out.printf("La puntuació de la notícia és de %d\n", noticia.calcularPuntuacioNoticia());
                }
            }
        }
    }
    /* Declaring abstract methods */
    public abstract double calcularPreuNoticia();

    public abstract int calcularPuntuacioNoticia();

}
