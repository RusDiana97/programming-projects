// ===============
// ATM APPLICATION
// ===============
//  
// Functionalites:
// - show menu
// - the menu contain:
//       -> check balance
//       -> deposit money
//       -> withdraw money
// - exit from application

#include <iostream>
using namespace std;

void welcome() {

    cout << "====================================\n";
    cout << "              WELCOME!\n";
    cout << "====================================";
}

void menu() {
    cout << endl << endl << endl;
    cout << "************* MENU ATM **************\n";
    cout << " Choose one of the following options:\n\n";
    cout << " 1. Check balance\n";
    cout << " 2. Deposit money\n";
    cout << " 3. Withdraw money\n";
    cout << " 4. Exit from your account\n";
    cout << "*************************************\n";
    cout << endl << endl;
}

int main()
{
    int option;
    double balance = 100;

    welcome();

    do {
        menu();

        cout << " Enter your option's number: ";
        cin >> option;

        system("cls");

        switch (option) {
        case 1: 
            cout << "************" << endl;
            cout << "* OPTION 1 *" << endl;
            cout << "************" << endl;

            cout << " Your balance amount is: " << balance << " RON" << endl;
            break;
        case 2: 
            cout << "************" << endl;
            cout << "* OPTION 2 *" << endl;
            cout << "************" << endl;

            cout << " Enter your deposit amount: ";
            double deposit;
            cin >> deposit;

            balance += deposit;
            cout << " Your balance amount now is: " << balance << " RON" << endl;
            break;
        case 3: 
            cout << "************" << endl;
            cout << "* OPTION 3 *" << endl;
            cout << "************" << endl;
            
            cout << " Enter your withdraw amount: ";
            double withdraw;
            cin >> withdraw;

            if (withdraw > balance) {
                cout << " Unavailable amount. Please check your balance." << endl;
            }
            else {
                cout << " You have withdrawn this amount of money: " << withdraw << " RON" << endl;

                balance -= withdraw;
                cout << " Your balance amount now is: " << balance << " RON" << endl;
            }
            break;
        }
    } while (option != 4);

    system("pause>0");
}
