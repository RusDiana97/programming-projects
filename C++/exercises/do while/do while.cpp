#include <iostream>
#include <string>

using namespace std;

void showMenu()
{
    cout << "Welcome!" << endl;
}

void showUser()
{
    const string password = "hello"; // parola corecta
    string input;

    do
    {
        cout << "Enter your password > " << flush; // flush because we type on the same line
        cin >> input; // utilizatorul introduce parola

        if (input != password) // ca sa compari 2 variabile trebuie sa fie de acelasi tip 
        {
            cout << "Access denied." << endl; // parolele nu sunt identice
        }

    } while (input != password);

    cout << "Password accepted!" << endl; // input = password
}

int main()
{
    showMenu();

    showUser();
   
    system ("pause > 0");
}