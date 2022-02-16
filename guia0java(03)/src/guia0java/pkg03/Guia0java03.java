/*

Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.

 */
package guia0java.pkg03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Guia0java03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        AlumnoServicio listaAlumno = new AlumnoServicio();
        Integer nota1;
        String nombre;
        Integer nota2;
        Integer nota3; 
        String termina = "";
    
        System.out.println("Lista de alumnos");
        listaAlumno.unAlumno("Ariel", 10, 3, 8);
        listaAlumno.unAlumno("Marina", 7, 3, 8);
        listaAlumno.unAlumno("Fatima", 6, 7, 8);
        listaAlumno.unAlumno("Ricardo", 10, 7, 8);
        listaAlumno.unAlumno("Martin", 5, 5, 9);
        listaAlumno.unAlumno("Betiana", 5, 7, 8);
        do {
        
           
           
            System.out.println("ingrese Nombre");
            nombre = leer.next();
            System.out.println("Ingrese primer nota");
            nota1=leer.nextInt();
            System.out.println("Ingrese segunda nota");
            nota2=leer.nextInt();
            System.out.println("ingrese tercer nota");
            nota3=leer.nextInt();
            
            System.out.println("quiere ingresar otro alumno?");
            termina= leer.next();
            listaAlumno.unAlumno(nombre, nota1, nota2, nota3);
            
 
        } while (termina.equalsIgnoreCase("s"));
        
        listaAlumno.verListado();
        System.out.println("Ingrese el nombre de alumno para calcular su promedio");
        listaAlumno.buscarAlumnoNota();
        
       
    }

}
