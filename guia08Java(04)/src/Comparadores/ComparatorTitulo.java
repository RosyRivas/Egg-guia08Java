
package Comparadores;

import Modelo.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Rosi-PC
 */
public class ComparatorTitulo implements Comparator<Pelicula>{

    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        return p1.getTitulo().compareTo(p2.getTitulo());
    }
    
}
