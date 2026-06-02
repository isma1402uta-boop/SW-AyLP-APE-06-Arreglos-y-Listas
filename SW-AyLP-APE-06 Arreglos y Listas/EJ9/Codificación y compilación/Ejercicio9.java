// Java - Ejercicio 9
import java.util.LinkedList; // 
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        LinkedList<String> colaTurnos = new LinkedList<>(); // 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- REGISTRO DE TURNOS (LINKEDLIST) ---");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Nombre para el turno #" + i + ": ");
            String t = scanner.nextLine().trim();
            if(!t.isEmpty()) {
                colaTurnos.add(t); // 
            } else {
                System.out.println("Entrada inválida. Intente de nuevo.");
                i--;
            }
        }
        
        System.out.println("\n--- PANTALLA DE TURNOS ACTUALES ---");
        int index = 1;
        for (String turno : colaTurnos) {
            System.out.println("Código: T-" + index + " | Nombre: " + turno);
            index++;
        }
    }
}
