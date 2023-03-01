/*** S1.1 Nivell 3 exercici 1 ***/
package n3exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Redactor {
    private String nom;
    private final String DNI;
    private static double sou;

    static {
        sou = 1500;
    }

    private List<Noticia> noticies = new ArrayList<>();

    /* Constructor */
    public Redactor(String nom, String DNI) {
        this.setNom(nom);
        this.DNI=DNI;
    }

    /* Getters and setters */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDNI() {
        return DNI;
    }

    public List<Noticia> getNoticies() {
        return noticies;
    }

    public void setNoticies(List<Noticia> noticies) {
        this.noticies = noticies;
    }

    /* Overrding equals and hashcode */
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) {
            return true;
        }
        if(!(obj instanceof Redactor)) {
            return false;
        }
        Redactor redactor=(Redactor) obj;
        return this.getNom().equals(redactor.getNom()) && this.getDNI().equals(redactor.getDNI());
    }

    /* Declaring static methods */
    public static void afegirRedactor(Set<Redactor> redactors, Scanner sc) {  //Adding redactor
        System.out.println("Introdueix el nom del redactor");
        var nom = sc.nextLine();
        System.out.println("Introdueix el DNI del redactor");
        var DNI = sc.nextLine();
        var redactor = new Redactor(nom, DNI);
        redactors.add(redactor);
    }
    public static void eliminarRedactor(Set<Redactor> redactors, Scanner sc) {  //Deleting redactor
        System.out.println("Introdueix el nom del redactor");
        var nom = sc.nextLine();
        System.out.println("Introdueix el DNI del redactor");
        var DNI = sc.nextLine();
        var redactor = new Redactor(nom, DNI);
        redactors.remove(redactor);
    }
    public static void mostrarNoticies(Set<Redactor> redactors, Scanner sc) {  //Showing news by redactor
        System.out.println("Introdueix el nom redactor");
        var nom = sc.nextLine();
        System.out.println("Introdueix el DNI redactor");
        var DNI = sc.nextLine();
        var redactor = new Redactor(nom, DNI);
        for (Redactor redactor_aux : redactors) {
            if (redactor_aux.equals(redactor)) {
                for (Noticia noticia : redactor_aux.getNoticies()) {
                    System.out.println(noticia.getTitol());
                }
            }
        }
    }
}
