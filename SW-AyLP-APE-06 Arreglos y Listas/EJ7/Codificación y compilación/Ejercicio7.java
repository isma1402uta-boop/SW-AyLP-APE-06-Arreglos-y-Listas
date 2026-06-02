// Java - Ejercicio 7
import java.util.ArrayList; // 

public class Ejercicio7 {
    public static void main(String[] args) {
        // Estructura Estática (Tamaño Fijo)
        int[] arregloEstatico = new int[3];
        arregloEstatico[0] = 100;
        arregloEstatico[1] = 200;
        arregloEstatico[2] = 300;
        // arregloEstatico[3] = 400; // Provocaría un ArrayIndexOutOfBoundsException
        
        // Estructura Dinámica (Redimensionable)
        ArrayList<Integer> listaDinamica = new ArrayList<>(); // 
        listaDinamica.add(100); // 
        listaDinamica.add(200); // 
        listaDinamica.add(300); // 
        listaDinamica.add(400); // Supera el tamaño inicial sin errores 
        
        System.out.println("Longitud inmutable del arreglo fijo: " + arregloEstatico.length);
        System.out.println("Tamaño adaptado de la lista dinámica: " + listaDinamica.size());
    }
}
