﻿// Cerința
// Se dau două numere naturale x și y.Calculați ultima cifră a sumei lor.

// Date de intrare
// Programul citește de la tastatură numerele x și y.

// Date de ieșire
// Programul va afișa pe ecran ultima cifră a sumei x + y.

// Restricții și precizări
// 1 ≤ x, y < 1.000.000

 //   Exemplu
//    Intrare

 //   25 78
//   Ieșire

 //   3

 // pentru ca 25 + 78 = 103



#include <iostream>
using namespace std;

int main()
{

    int x, y;

    cout << "x = ";
    cin >> x;
    cout << "y = ";
    cin >> y;

    cout << "(x + y) % 10 = " << (x + y) % 10;

    system("pause>0");
}

