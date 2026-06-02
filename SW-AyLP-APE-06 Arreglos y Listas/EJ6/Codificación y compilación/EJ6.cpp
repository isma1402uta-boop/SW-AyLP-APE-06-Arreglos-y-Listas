// C++ - Ejercicio 6
#include <iostream>
#include <vector> // 
#include <string>

using namespace std;

struct Producto {
    string nombre; int stock; double precio;
};

int main() {
    vector<Producto> inventario; // 
    int n;
    cout << "Cantidad de productos: "; cin >> n;
    
    for (int i = 0; i < n; ++i) {
        cin.ignore(); Producto p;
        cout << "Nombre del Producto: "; getline(cin, p.nombre);
        p.stock = -1; p.precio = -1;
        while(p.stock < 0) { cout << "Stock: "; cin >> p.stock; }
        while(p.precio < 0) { cout << "Precio: "; cin >> p.precio; }
        inventario.push_back(p); // 
    }
    
    double granTotal = 0;
    cout << "\n--- REPORTE DE VALORACION ---\n";
    for (const auto& prod : inventario) {
        double sub = prod.stock * prod.precio;
        cout << prod.nombre << " | Unidades: " << prod.stock << " | Subtotal: $" << sub << "\n";
        granTotal += sub;
    }
    cout << "Gran Total de Activos: $" << granTotal << "\n";
    return 0;
}
