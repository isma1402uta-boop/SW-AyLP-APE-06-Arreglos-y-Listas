// Java - Ejercicio 1
import java.util.ArrayList; // 
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> listaEstudiantes = new ArrayList<>(); // 
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            String nombre = "";
            while (nombre.trim().isEmpty()) {
                System.out.print("Ingrese el nombre del estudiante " + i + ": ");
                nombre = scanner.nextLine();
                if (nombre.trim().isEmpty()) {
                    System.out.println("Error: El nombre no puede estar vacío.");
                }
            }
            listaEstudiantes.add(nombre); // 
        }
        
        System.out.println("\n--- Lista de Estudiantes ---");
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + listaEstudiantes.get(i)); // 
        }
    }
}
