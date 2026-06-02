// Java - Ejercicio 6
import java.util.ArrayList; // 
import java.util.Scanner;

class Producto {
    String nombre; int stock; double precio;
    public Producto(String n, int s, double p) {
        this.nombre = n; this.stock = s; this.precio = p;
    }
}

public class Ejercicio6 {
    public static void main(String[] args) {
        ArrayList<Producto> inventario = new ArrayList<>(); // 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cantidad de tipos de productos a ingresar: ");
        int n = sc.nextInt(); sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre del Producto: "); String nom = sc.nextLine();
            int stk = -1; double prc = -1;
            while(stk < 0) { System.out.print("Stock: "); stk = sc.nextInt(); }
            while(prc < 0) { System.out.print("Precio: "); prc = sc.nextDouble(); }
            sc.nextLine();
            inventario.add(new Producto(nom, stk, prc)); // 
        }
        
        double granTotal = 0;
        System.out.println("\n--- VALORACIÓN TOTAL ---");
        for (Producto p : inventario) {
            double sub = p.stock * p.precio;
            System.out.println(p.nombre + " -> Cantidad: " + p.stock + " | Total: $" + sub);
            granTotal += sub;
        }
        System.out.println("Inversión de Activos Totales: $" + granTotal);
    }
}
