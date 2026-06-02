// C++ - Ejercicio 7
#include <iostream>
#include <vector> // 

using namespace std;

int main() {
    // Estructura Estática
    int arregloEstatico[3] = {10, 20, 30};
    
    // Estructura Dinámica
    vector<int> listaDinamica; // 
    listaDinamica.push_back(10); // 
    listaDinamica.push_back(20); // 
    listaDinamica.push_back(30); // 
    listaDinamica.push_back(40); // Se expande de forma automatica en memoria 
    
    cout << "Dimension del arreglo nativo fijo: " << 3 << "\n";
    cout << "Dimension actual de la lista dinamica: " << listaDinamica.size() << "\n";
    return 0;
}
