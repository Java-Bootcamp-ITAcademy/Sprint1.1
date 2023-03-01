/*** S1.1 Nivell 3 exercici 1 ***/
package n3exercici1;

import java.io.Console;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Redactor> redactors = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        Integer opcio;
        var jugar=true;
        while (jugar) {
            /* Choose and option */
            System.out.println("0-Sortir del programa\n1-Introduir redactor\n2-Eliminar redactor\n3-Introduir notícia redactor\n4-Eliminar notícia\n5-Mostrar notícies d'un redactor\n6-Calcular preu de la notícia\n7-Calcular puntuació de la notícia");
            opcio = Integer.parseInt(sc.nextLine());
            switch (opcio) {
                /* Adding Redactor */
                case 1: {
                    Redactor.afegirRedactor(redactors,sc);
                    break;
                }
                /* Deleting redactor */
                case 2: {
                    Redactor.eliminarRedactor(redactors,sc);
                    break;
                }
                /* Adding a new to a given redactor */
                case 3: {
                    Noticia.afegirNoticia(redactors,sc);
                    break;
                }
                /* Deleting news */
                case 4: {
                   Noticia.eliminarNoticia(redactors,sc);
                    break;
                }
                /* Printing news from a given redactor */
                case 5: {
                    Redactor.mostrarNoticies(redactors,sc);
                    break;
                }
                /* Calculating new price */
                case 6: {
                    Noticia.calcularPreuTotal(redactors,sc);
                    break;
                }
                /* Calculating new score */
                case 7: {
                    Noticia.calcularPuntuacioTotal(redactors,sc);
                    break;
                }
                /* End of program */
                case 0: {
                    jugar=false;
                    sc.close();
                }
            }
        }
    }
}