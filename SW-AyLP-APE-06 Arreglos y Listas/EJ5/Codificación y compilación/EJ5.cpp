// C++ - Ejercicio 5
#include <iostream>
#include <vector> // 
#include <string>

using namespace std;

int main() {
    vector<string> nombres; // 
    vector<double> notas; // 
    int n;
    
    cout << "Cantidad de estudiantes: ";
    cin >> n; cin.ignore();
    
    for (int i = 0; i < n; i++) {
        string nom; double nt = -1;
        cout << "Nombre del estudiante " << (i+1) << ": ";
        getline(cin, nom);
        nombres.push_back(nom); // 
        
        while (nt < 0 || nt > 10) {
            cout << "Calificacion: ";
            if (!(cin >> nt)) { cin.clear(); cin.ignore(10000, '\n'); }
        }
        cin.ignore();
        notas.push_back(nt); // 
    }
    
    cout << "\n--- BOLETIN ACADEMICO ---\n";
    for (size_t i = 0; i < nombres.size(); i++) {
        cout << "Alumno: " << nombres[i] << " \t| Nota: " << notas[i] << "\n"; // 
    }
    return 0;
}
