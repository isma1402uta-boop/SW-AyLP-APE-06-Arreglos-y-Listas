// Java - Ejercicio 8
import java.util.ArrayList; // 

public class Ejercicio8 {
    public static void main(String[] args) {
        final int LIMITE = 10000;
        ArrayList<Integer> vDinamico = new ArrayList<>(); // 
        
        long tInicio = System.nanoTime();
        for (int i = 0; i < LIMITE; i++) {
            vDinamico.add(i); // 
        }
        long tFin = System.nanoTime();
        
        double milisegundos = (tFin - tInicio) / 1000000.0;
        System.out.println("Insercion de " + LIMITE + " enteros en ArrayList: " + milisegundos + " ms");
    }
}
