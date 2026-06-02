// C++ - Ejercicio 1
#include <iostream>
#include <vector> // 
#include <string>

using namespace std;

int main() {
    vector<string> listaEstudiantes; // 
    string nombre;
    
    for (int i = 1; i <= 5; i++) {
        do {
            cout << "Ingrese el nombre del estudiante " << i << ": ";
            getline(cin, nombre);
            if (nombre.empty() || nombre.find_first_not_of(' ') == string::npos) {
                cout << "Error: El nombre no puede estar vacio.\n";
                nombre = "";
            }
        } while (nombre.empty());
        listaEstudiantes.push_back(nombre); // 
    }
    
    cout << "\n--- Lista de Estudiantes ---\n";
    for (size_t i = 0; i < listaEstudiantes.size(); i++) {
        cout << (i + 1) << ". " << listaEstudiantes[i] << "\n"; // 
    }
    return 0;
}
