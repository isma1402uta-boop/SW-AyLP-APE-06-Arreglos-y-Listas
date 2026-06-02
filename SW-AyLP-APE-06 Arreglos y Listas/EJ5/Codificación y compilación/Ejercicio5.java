// Java - Ejercicio 5
import java.util.ArrayList; // 
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(); // 
        ArrayList<Double> BlacklistNotas = new ArrayList<>(); // 
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos estudiantes registrará?: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre completo: ");
            nombres.add(scanner.nextLine()); // 
            
            double nt = -1;
            while (nt < 0 || nt > 10) {
                System.out.print("Nota (0.0 - 10.0): ");
                if (scanner.hasNextDouble()) {
                    nt = scanner.nextDouble();
                } else scanner.next();
            }
            scanner.nextLine();
            BlacklistNotas.add(nt); // 
        }
        
        System.out.println("\n--- BOLETÍN ACADÉMICO ---");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Alumno: " + nombres.get(i) + " | Calificación: " + BlacklistNotas.get(i)); // 
        }
    }
}
