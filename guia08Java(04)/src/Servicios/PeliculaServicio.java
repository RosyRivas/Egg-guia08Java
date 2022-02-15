package Servicios;

import Modelo.Pelicula;
import Comparadores.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class PeliculaServicio {

    private ArrayList<Pelicula> listaPeliculas;

    public PeliculaServicio() {
        this.listaPeliculas = new ArrayList<>();
    }

    public Pelicula crearPelicula(String titulo, String director, LocalTime duracion) {
        Pelicula pelicula = new Pelicula(titulo, director, duracion);
        return pelicula;
    }

    public ArrayList<Pelicula> agregarPeliculaALista() {

        System.out.println("Ingrese una pelicula");
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        LocalTime duracion;
        String terminar = "";
        do {
            System.out.println("ingerse titulo");
            String titulo = leer.next();
            System.out.println("ingrese director");
            String director = leer.next();
            System.out.println("ingrese duracion");
            System.out.println("ingrese hora duracion");
            int horas = leer.nextInt();
            System.out.println("ingrese minutos de duracion");
            int minutos = leer.nextInt();
            duracion = LocalTime.of(horas, minutos);
            listaPeliculas.add(crearPelicula(titulo, director, duracion));
            System.out.println("quiere ingresar una pelicula?");
            terminar = leer.next();
        } while (terminar.equalsIgnoreCase("s"));
        return listaPeliculas;
    }

    public void verListaPeliculas() {
        for (Pelicula i : listaPeliculas) {
            System.out.println(i);
        }
    }

    public void verPeliculasMayor1Hora() {
        for (Pelicula i : listaPeliculas) {
            if (i.getDuracion().getHour() < 1) {
                System.out.println(i);
            }

        }
    }

    // metodo para traer funciones de los servicios
    public void ordenarPelicula() {
        System.out.println("Ingrese una opcion: ");
        System.out.println("1- ordenar pelicula por duracion ascendente");
        System.out.println("2- ordenar pelicula por duracion descendente");
        System.out.println("3- ordenar pelicula alfabeticamente por titulo");
        System.out.println("4- ordenar pelicula alfabeticamente por director");
        System.out.println("5- salir");
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String opcion = leer.next();

        switch (opcion) {
            case "1":
                Collections.sort(listaPeliculas, new ComparatorDuracionAsc());
                System.out.println(listaPeliculas);
            case "2":
                Collections.sort(listaPeliculas, new ComparatorDuracionDesc());
                 System.out.println(listaPeliculas);
            case "3":
                Collections.sort(listaPeliculas, new ComparatorTitulo());
                 System.out.println(listaPeliculas);
            case "4":
                Collections.sort(listaPeliculas, new ComparatorDirector());
                 System.out.println(listaPeliculas);
            case "5":
                break;

        }
    }

    /* public void ordenarPeliculaDuracionDesc(){
        
    }
    public void ordenarPeliculaDuracionAsc(){
        
    }
    
    public void ordenarPeliculaAlfaDirector(){}
    
    public void ordenarPeliculaAlfaTitulos(){
        
    }*/
}
