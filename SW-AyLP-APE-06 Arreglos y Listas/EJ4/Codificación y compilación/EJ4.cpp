// C++ - Ejercicio 4
#include <iostream>
#include <vector> // 
#include <string>

using namespace std;

int main() {
    vector<string> crudList; // 
    int opcion = 0;
    
    while (opcion != 5) {
        cout << "\n--- MODULO CRUD (C++) ---\n1. Registrar\n2. Listar\n3. Actualizar\n4. Eliminar\n5. Salir\nOpcion: ";
        if (!(cin >> opcion)) {
            cout << "Entrada invalida.\n";
            cin.clear(); cin.ignore(10000, '\n');
            continue;
        }
        cin.ignore();
        
        if (opcion == 1) {
            string val; cout << "Contenido: "; getline(cin, val);
            crudList.push_back(val); // 
        } else if (opcion == 2) {
            if (crudList.empty()) cout << "Vacio.\n";
            for (size_t i = 0; i < crudList.size(); ++i) cout << "[" << i << "] " << crudList[i] << "\n"; // 
        } else if (opcion == 3) {
            int idx; cout << "Indice: "; cin >> idx; cin.ignore();
            if (idx >= 0 && idx < (int)crudList.size()) {
                cout << "Nuevo valor: "; getline(cin, crudList[idx]);
            } else cout << "Fuera de rango.\n";
        } else if (opcion == 4) {
            int idx; cout << "Indice a eliminar: "; cin >> idx; cin.ignore();
            if (idx >= 0 && idx < (int)crudList.size()) {
                crudList.erase(crudList.begin() + idx); // 
                cout << "Eliminado.\n";
            } else cout << "Fuera de rango.\n";
        }
    }
    return 0;
}