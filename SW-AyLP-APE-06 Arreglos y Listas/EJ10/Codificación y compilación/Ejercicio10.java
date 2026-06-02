// Java - Ejercicio 10
import java.util.LinkedList; // 

public class Ejercicio10 {
    public static void main(String[] args) {
        LinkedList<String> filaEspera = new LinkedList<>(); // 
        
        // Operación Encolar (Push back)
        filaEspera.add("Carlos"); // 
        filaEspera.add("Ana"); // 
        filaEspera.add("Mateo"); // 
        
        System.out.println("Fila inicial de atención: " + filaEspera);
        System.out.println("\n--- INICIO DE ATENCIÓN DE CLIENTES ---");
        
        // Operación Desencolar (FIFO)
        while (!filaEspera.isEmpty()) {
            String clienteAtendido = filaEspera.removeFirst(); // Remueve el elemento del frente
            System.out.println("-> Atendiendo a: " + clienteAtendido + " ... Operación Completada.");
        }
        
        System.out.println("\nEstado Final: Todos los usuarios de la fila han sido atendidos.");
    }
}
