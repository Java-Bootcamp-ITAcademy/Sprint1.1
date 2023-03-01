/*** S1.1 Nivell 3 exercici 1 ***/
package n3exercici1;

import java.util.*;

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

    public static Redactor obtenirRedactor(Set<Redactor> redactors, Redactor redactor) {
        boolean notTrobat=true;
        Iterator<Redactor> it=redactors.iterator();
        Redactor redactor_aux=null;
        while(notTrobat&&it.hasNext()) {
            redactor_aux=it.next();
            if(redactor_aux.equals(redactor)) {
                notTrobat=false;
            }
        }
        return redactor_aux;
    }

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
        if(redactors.contains(redactor)) {
            redactors.remove(redactor);
        }
        else {
            System.out.println("Aquest redactor no existeix");
        }
    }
    public static void mostrarNoticies(Set<Redactor> redactors, Scanner sc) {  //Showing news by redactor
        System.out.println("Introdueix el nom redactor");
        var nom = sc.nextLine();
        System.out.println("Introdueix el DNI redactor");
        var DNI = sc.nextLine();
        var redactor = new Redactor(nom, DNI);
        Redactor redactor_aux;
        if((redactor_aux=obtenirRedactor(redactors,redactor))!=null) {
            for(Noticia noticia:redactor_aux.getNoticies()) {
                System.out.println(noticia.getTitol());
            }
        }
        else {
            System.out.println("Aquest redactor no existeix");
        }
    }
}
