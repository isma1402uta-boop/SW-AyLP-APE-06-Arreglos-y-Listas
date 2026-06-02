// C++ - Ejercicio 3
#include <iostream>
#include <vector> // 
#include <string>
#include <algorithm>

using namespace std;

int main() {
    vector<string> inventario; // 
    string prod, opcion, prodBuscar;
    
    do {
        cout << "Ingrese el nombre del producto a registrar: ";
        getline(cin, prod);
        if(!prod.empty()) {
            inventario.push_back(prod); // 
        }
        cout << "¿Desea registrar otro? (s/n): ";
        getline(cin, opcion);
    } while(opcion == "s" || opcion == "S");
    
    cout << "\nIngrese el producto a buscar: ";
    getline(cin, prodBuscar);
    
    auto it = find(inventario.begin(), inventario.end(), prodBuscar);
    if(it != inventario.end()) {
        cout << "¡Producto encontrado! En la posicion: " << distance(inventario.begin(), it) << "\n";
    } else {
        cout << "El producto '" << prodBuscar << "' no existe en el registro.\n";
    }
    return 0;
}
