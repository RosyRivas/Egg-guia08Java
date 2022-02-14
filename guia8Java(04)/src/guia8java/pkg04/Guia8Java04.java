package guia8java.pkg04;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class Guia8Java04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<Pelicula> listaPeliculas = new ArrayList();
        String unDirector;
        String unTitulo;
        int hora;
        int minutos;
        LocalTime duracion;
        LocalTime peliculaDeHora = LocalTime.of(1, 00);
        String termina = "";

        do {
            System.out.println("Ingrese el titulo de la pelicula");
            unTitulo = leer.next();
            System.out.println("Ingrese el director de la pelicula");
            unDirector = leer.next();
            System.out.println("Ingrese duracion en formato HH:MM,"
                    + "Ingrese una hora: ");

            hora = leer.nextInt();

            while (hora < 0 || hora > 23);
            {
                System.out.println("ingrese una hora valida");
                hora = leer.nextInt();
            }

            System.out.println("Ingrese minutos de duracion ");
            minutos = leer.nextInt();
            while (minutos < 0 || minutos > 60) {
                System.out.println("Ingrese minutos validos");
                minutos = leer.nextInt();
            }
            duracion = LocalTime.of(hora, minutos);
            Pelicula pelicula = new Pelicula(unTitulo, unDirector, duracion);
            listaPeliculas.add(pelicula);
            System.out.println("Quiere ingresar otra pelicula?");
            termina = leer.next();

        } while (termina.equalsIgnoreCase("s"));
        System.out.println("Lista de las peliculas ingresadas");

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);

        }
        System.out.println("Peliculas con duracion menor a una hora");
        for (Pelicula pelicula : listaPeliculas) {
            if (pelicula.getDuracion().isBefore(peliculaDeHora)) {
                System.out.println(pelicula);

            }
        }
        System.out.println("Peliculas ordenada por duracion Dec");
        listaPeliculas.sort(Pelicula.ordenarPorDuracionDesc);
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }
        System.out.println("Peliculas ordenada por duracion Asc");
        listaPeliculas.sort(Pelicula.ordenarPorDuracionAscc);
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }

        System.out.println("Peliculas ordenada por titulo");
        listaPeliculas.sort(Pelicula.ordenarPorTitulo);
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }
        System.out.println("Peliculas ordenada por director");
        listaPeliculas.sort(Pelicula.ordenarPorDirector);
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }

    }

}
