// C++ - Ejercicio 9
#include <iostream>
#include <list> // 
#include <string>

using namespace std;

int main() {
    list<string> colaTurnos; // 
    string t;
    
    cout << "--- REGISTRO DE TURNOS (C++ LIST) ---\n";
    for (int i = 1; i <= 3; i++) {
        cout << "Nombre para el turno #" << i << ": ";
        getline(cin, t);
        if(!t.empty()) {
            colaTurnos.push_back(t); // 
        } else {
            cout << "Entrada invalida.\n";
            i--;
        }
    }
    
    cout << "\n--- PANTALLA DE TURNOS ACTUALES ---\n";
    int index = 1;
    for (const string& turno : colaTurnos) {
        cout << "Codigo: T-" << index << " | Nombre: " << turno << "\n";
        index++;
    }
    return 0;
}
