// C++ - Ejercicio 2
#include <iostream>
#include <vector> // 
#include <iomanip>

using namespace std;

int main() {
    vector<double> listaNotas; // 
    double nota, suma = 0.0;
    
    for (int i = 1; i <= 6; i++) {
        while (true) {
            cout << "Ingrese la nota " << i << " (0.0 - 10.0): ";
            if (cin >> nota) {
                if (nota >= 0 && nota <= 10) {
                    break;
                }
                cout << "Error: La nota debe estar en el rango de 0 a 10.\n";
            } else {
                cout << "Error: Entrada no numerica.\n";
                cin.clear();
                cin.ignore(10000, '\n');
            }
        }
        listaNotas.push_back(nota); // 
        suma += nota;
    }
    
    cout << "\n--- Reporte de Notas ---\n" << fixed << setprecision(2);
    for (size_t i = 0; i < listaNotas.size(); i++) {
        cout << "Nota #" << (i + 1) << ": " << listaNotas[i] << "\n"; // 
    }
    cout << "Promedio Final: " << (suma / listaNotas.size()) << "\n";
    return 0;
}
