// C++ - Ejercicio 10
#include <iostream>
#include <list> // 
#include <string>

using namespace std;

int main() {
    list<string> filaEspera; // 
    
    // Operación Encolar
    filaEspera.push_back("Carlos"); // 
    filaEspera.push_back("Ana"); // 
    filaEspera.push_back("Mateo"); // 
    
    cout << "--- SIMULACION DE ATENCION DE CLIENTES (FIFO) ---\n\n";
    
    // Operación Desencolar
    while (!filaEspera.empty()) {
        string clienteAtendido = filaEspera.front(); // Obtiene el frente de la fila
        cout << "-> Atendiendo a: " << clienteAtendido << " ... Sesion Cerrada.\n";
        filaEspera.pop_front(); // Remueve el primer nodo de la lista 
    }
    
    cout << "\nEstado de Fila: Vacia. Todos los turnos del dia fueron despachados.\n";
    return 0;
}
