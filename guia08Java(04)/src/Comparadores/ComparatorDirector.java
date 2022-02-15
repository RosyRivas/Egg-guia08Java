
package Comparadores;

import Modelo.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Rosi-PC
 */
public class ComparatorDirector implements Comparator<Pelicula> {

    @Override
    public int compare(Pelicula p1, Pelicula p2) {
         return p1.getDirector().compareTo(p2.getDirector());
    }
    
}
