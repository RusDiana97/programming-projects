/* Let's consider 3 real values. 
Create a program that test all the cases 
for the values if they can represent a triangle. 

If they can represent a triangle, specify its type:
isosceles, equilateral, rectangular or any. */

#include <iostream>
using namespace std;

float a, b, c;

void main()
{
    // insert the values for the variables a, b, c
    cout << "a = ";
    cin >> a;
 
    cout << "b = ";
    cin >> b;

    cout << "c = ";
    cin >> c;

    if (a < 0 || b < 0 || c < 0) {
        cout << "These values can't represent a triangle. The values must be positive.\n"; // a = -2.4, b = 9, c = -7
    }
    else if (a >= b + c || b >= a + c || c >= a + b) {
        cout << "The sum of any two values must be greater than the third value for representing a triangle.\n"; // a = 7, b = 2, c = 3
    }
    else if (a == b && a == c && b == c) {
        cout << "Your values represent an equilateral triangle.\n"; // a = 8, b = 8, c = 8
    }
    else if (a == b || b == c || a == c) {
        cout << "Your values represent an isosceles triangle.\n"; // a = 6, b = 6, c = 3
    }
    else if ((c * c == a * a + b * b) || (a * a == b * b + c * c) || (b * b == a * a + c * c)) {
        cout << "Your values represent a rectangular triangle.\n"; // a = 3, b = 4, c = 5
    }
    else {
        cout << "Your values represent an any triangle."; // a = 12, b = 15, c = 8.4
    }
    
    system("pause>0");
}

