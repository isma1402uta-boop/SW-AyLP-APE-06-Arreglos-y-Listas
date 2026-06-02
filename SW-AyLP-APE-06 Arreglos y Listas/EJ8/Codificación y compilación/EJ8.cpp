// C++ - Ejercicio 8
#include <iostream>
#include <vector> // 
#include <chrono>

using namespace std;
using namespace std::chrono;

int main() {
    const int LIMITE = 10000;
    vector<int> vDinamico; // 
    
    auto tInicio = high_resolution_clock::now();
    for (int i = 0; i < LIMITE; ++i) {
        vDinamico.push_back(i); // 
    }
    auto tFin = high_resolution_clock::now();
    
    duration<double, milli> tTotal = tFin - tInicio;
    cout << "Insercion de " << LIMITE << " enteros en vector C++: " << tTotal.count() << " ms\n";
    return 0;
}
