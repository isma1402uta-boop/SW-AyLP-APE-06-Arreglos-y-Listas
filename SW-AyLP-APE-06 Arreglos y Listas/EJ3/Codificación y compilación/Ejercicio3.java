// Java - Ejercicio 3
import java.util.ArrayList; // 
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> inventario = new ArrayList<>(); // 
        Scanner scanner = new Scanner(System.in);
        String opcion;
        
        do {
            System.out.print("Ingrese el nombre del producto a registrar: ");
            String prod = scanner.nextLine().trim();
            if (!prod.isEmpty()) {
                inventario.add(prod); // 
            }
            System.out.print("¿Desea registrar otro? (s/n): ");
            opcion = scanner.nextLine();
        } while (opcion.equalsIgnoreCase("s"));
        
        System.out.print("\nIngrese el producto a buscar: ");
        String prodBuscar = scanner.nextLine().trim();
        
        int pos = inventario.indexOf(prodBuscar);
        if (pos != -1) {
            System.out.println("¡Producto encontrado! Registrado en el índice: " + pos);
        } else {
            System.out.println("El producto '" + prodBuscar + "' no existe en el registro.");
        }
    }
}
