package guia0java.pkg03;

import java.util.ArrayList;
import java.util.Iterator;

public class Alumno {

    private String nombre;
    private ArrayList<Integer> nota;

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    public double notaFinal() {
      
        double contador=0;
        
        Iterator <Integer> iterador= this.nota.iterator();
        while(iterador.hasNext()){
            double notaFinal= iterador.next();
            contador+=notaFinal;
            
        }
        return contador/3;
    }

    @Override
    public String toString() {
        return "{" + "" + nombre + ", nota=" + nota + '}';
    }

}
