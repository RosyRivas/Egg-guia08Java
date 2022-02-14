package guia8java.pkg01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Guia8java01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<String> razasPerro = new ArrayList();
        boolean encontro = false;
        String termina = "";

        //Ingreso razas
        String raza;

        do {
            System.out.println("Ingrese una raza :");
            raza = leer.next();
            System.out.println("Quiere ingresar otra raza? :");
            razasPerro.add(raza);

            termina = leer.next();
        } while (termina.equalsIgnoreCase("s"));
        // Mostramos las razas
        for (String razas : razasPerro) {
            System.out.println(razas);

        }

        //buscador de raza
        System.out.println("Ingrese raaza a eliminar");
        String eliminar = leer.next();
        Iterator<String> iterador = razasPerro.iterator();
        while (iterador.hasNext()) {
            String elemento = iterador.next();
            if (elemento.equals(eliminar)) {
                iterador.remove();
                encontro = true;

            }
            
        }
        if (!encontro) {
            System.out.println("La raza de perro no esta en la lista");
        }
       

    }

}
