#include <iostream>

using namespace std;

int main()
{
    /* 
    break

    for (int i = 0; i < 5; i++)
    {
        cout << "i is: " << i << endl;

        if (i == 3)
        {
            break;
        }

        cout << "Looping..." << endl;
    }

    */
    
    /* continue
 
    for (int i=0; i<5; i++)
    {
        cout << "i is: " << i << endl;

        if (i == 3)
        {
            cout << ""Hello";   
            continue;
        }

        cout << "Looping..." << endl;
    }
    
    */

        const string password = "hello"; // parola corecta

        string input;

        do
        {
            cout << "Enter your password > " << flush; // flush because we type on the same line
            cin >> input; // utilizatorul introduce parola

            if (input == password) // ca sa compari 2 variabile trebuie sa fie de acelasi tip 
            {
                break;
            }
            else
            {
                cout << "Access denied." << endl; // parolele nu sunt identice
            }

        } while (true);

        cout << "Password accepted!" << endl; // input = password

        cout << "Program quitting..." << endl;

    system("pause > 0");
}
