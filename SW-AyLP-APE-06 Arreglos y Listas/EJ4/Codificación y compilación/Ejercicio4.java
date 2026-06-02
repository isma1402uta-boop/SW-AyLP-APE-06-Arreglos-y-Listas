// Java - Ejercicio 4
import java.util.ArrayList; // 
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> crudList = new ArrayList<>(); // 
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 5) {
            System.out.println("\n--- MODULO CRUD (SISTEMA DE CONTROL) ---");
            System.out.println("1. Registrar Elemento\n2. Listar Elementos\n3. Actualizar Elemento\n4. Eliminar Elemento\n5. Salir");
            System.out.print("Seleccione opcion: ");
            
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine(); // Limpiar buffer
            } else {
                System.out.println("Opcion incorrecta.");
                sc.nextLine();
                continue;
            }
            
            switch (opcion) {
                case 1 -> {
                    System.out.print("Contenido: ");
                    crudList.add(sc.nextLine()); // 
                }
                case 2 -> {
                    if (crudList.isEmpty()) System.out.println("Coleccion vacia.");
                    else {
                        for (int i = 0; i < crudList.size(); i++) {
                            System.out.println("[" + i + "] " + crudList.get(i)); // 
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Indice a modificar: ");
                    int idx = sc.nextInt(); sc.nextLine();
                    if (idx >= 0 && idx < crudList.size()) {
                        System.out.print("Nuevo valor: ");
                        crudList.set(idx, sc.nextLine());
                    } else System.out.println("Indice fuera de rango.");
                }
                case 4 -> {
                    System.out.print("Indice a eliminar: ");
                    int delIdx = sc.nextInt(); sc.nextLine();
                    if (delIdx >= 0 && delIdx < crudList.size()) {
                        crudList.remove(delIdx); // 
                        System.out.println("Eliminado correctamente.");
                    } else System.out.println("Indice fuera de rango.");
                }
            }
        }
    }
}
