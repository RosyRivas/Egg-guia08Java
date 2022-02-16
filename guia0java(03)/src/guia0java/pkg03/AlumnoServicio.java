package guia0java.pkg03;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class AlumnoServicio {

    private ArrayList<Alumno> listaAlumnos;

    public AlumnoServicio() {
        this.listaAlumnos = new ArrayList();
    }

    public AlumnoServicio(ArrayList<Alumno> alumnos) {
        this.listaAlumnos = alumnos;
    }

    public void unAlumno(String nombre, Integer nota1, Integer nota2, Integer nota3) {
        Alumno alumno = new Alumno();
        ArrayList<Integer> notas = new ArrayList();
        alumno.setNombre(nombre);
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        alumno.setNota(notas);
        añadirAlumno(alumno);

    }

    public void añadirAlumno(Alumno alumno) {
        this.listaAlumnos.add(alumno);
    }
    
    public void verListado(){
         for (Alumno alumno : listaAlumnos) {
             System.out.println(alumno.toString());

        }
    
    }

    public Alumno buscarAlumno(String nombre) {
        Alumno alumnoBuscado = null;
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                alumnoBuscado = alumno;

            }

        }
        return alumnoBuscado;
    }

    public void buscarAlumnoNota() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String nombre = leer.next();
        Alumno alumno = buscarAlumno(nombre);
      
        if (alumno != null) {
            System.out.println("Su promedio es:");
            System.out.println(obtenerNotaFinal(alumno));

        } else {
            System.out.println("no existe el alumno con el nombre ");
        }

    }

    public double obtenerNotaFinal(Alumno alumno) {
        int contador = 0;
        for (Integer nota : alumno.getNota()) {
            contador += nota;

        }
        return (double) contador / 3;

    }

}
