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
        ArrayList <Alumno> listaAlumno= new ArrayList();
        Integer unaNota;
        String nombre;
        String termina="";
        String alumnoBusqueda;
        boolean seEncontro=false;
        // do while para ingresar alumnos con sus notas
        do {
            ArrayList nota= new ArrayList();
            Alumno alumno= new Alumno();
            int notas;
            System.out.println("ingrese el nombre del alumno");
            nombre=leer.next();
            alumno.setNombre(nombre);
            for (int i = 0; i < 3; i++) {
                System.out.println("ingrese una nota"+(i+1));
                notas=leer.nextInt();
                unaNota=notas;
                nota.add(unaNota);
                
            }
            
            alumno.setNota(nota);
            listaAlumno.add(alumno);
            System.out.println("quiere ingresar otro alumno?");
            termina= leer.next();
         
            
 
        } while (termina.equalsIgnoreCase("s"));
        
        // muestro en pantalla los alumnos ingresados
        for (Alumno alumno: listaAlumno) {
            System.out.println(alumno.getNombre());
            System.out.println(alumno.getNota());
        }
        
        System.out.println("Ingrese el nombre del alumno para calcular su nota final");
        alumnoBusqueda=leer.next();
        Iterator <Alumno> iterador= listaAlumno.iterator();
        while(iterador.hasNext()){
            Alumno unAlumno=iterador.next();
            if (unAlumno.getNombre().equals(alumnoBusqueda)) {
                System.out.println("el promedio es: "+ unAlumno.notaFinal() );
                seEncontro=true;
            }
            
        }
        if (!seEncontro) {
            System.out.println("No se encontro en la lista a el alumno buscado");
        }
        
    }
    
}
