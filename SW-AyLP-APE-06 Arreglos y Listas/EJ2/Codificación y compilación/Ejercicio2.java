// Java - Ejercicio 2
import java.util.ArrayList; // 
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Double> listaNotas = new ArrayList<>(); // 
        Scanner scanner = new Scanner(System.in);
        double suma = 0.0;
        
        for (int i = 1; i <= 6; i++) {
            double nota = -1;
            while (nota < 0 || nota > 10) {
                System.out.print("Ingrese la nota " + i + " (0.0 - 10.0): ");
                if (scanner.hasNextDouble()) {
                    nota = scanner.nextDouble();
                    if (nota < 0 || nota > 10) {
                        System.out.println("Error: Rango inválido.");
                    }
                } else {
                    System.out.println("Error: Ingrese un valor numérico válido.");
                    scanner.next(); // Limpiar token inválido
                }
            }
            listaNotas.add(nota); // 
            suma += nota;
        }
        
        System.out.println("\n--- Reporte de Notas ---");
        for (int i = 0; i < listaNotas.size(); i++) {
            System.out.println("Nota #" + (i + 1) + ": " + listaNotas.get(i)); // 
        }
        System.out.printf("Promedio Final: %.2f\n", (suma / listaNotas.size()));
    }
}
