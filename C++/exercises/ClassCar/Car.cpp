// cpp secundar

#include<iostream>

#include "Car.h" //includem header-ul Car.h

using namespace std;

void Car::b_list()
{
	cout << "Car brand list" << endl;
	cout << "==============" << endl;

	cout << "1. BMW" << endl;
	cout << "2. Dacia" << endl;
	cout << "3. Cytroen" << endl << endl;
}

void Car::brand()
{
	int Bvalue;

	cout << "Select a value for the car brand > " << endl;

	cin >> Bvalue;

	cout << "You selected the value" << " " << Bvalue << "." << endl;

	cout << "The car brand is: " << flush;

	switch (Bvalue)
	{
	case 1:
		cout << "BMW" << endl;
		break;
	case 2: 
		cout << "Dacia" << endl;
		break;
	case 3:
		cout << "Cytroen" << endl;
		break;
	default:
		cout << "Please select a value from the menu." << endl;
		break;
	}
}

void Car::m_list()
{
	cout << "\n" << "Car model list" << endl;
	cout << "==============" << endl;

	cout << "- BMW models -" << endl;
	cout << "1. Seria 1" << endl;
	cout << "2. Seria 2" << endl;
	cout << "3. Seria 3" << endl;

	cout << "- Dacia models -" << endl;
	cout << "4. New Duster" << endl;
	cout << "5. Sandero" << endl;
	cout << "6. All new-jogger" << endl;

	cout << "- Cytroen models -" << endl;
	cout << "7. A" << endl;
	cout << "8. B2" << endl;
	cout << "9. B10" << endl;

}

void Car::model()
{
	int Mvalue;

	cout << endl;

	cout << "Select a value for the car model >" << endl;

	cin >> Mvalue;

	cout << "You selected the value " << Mvalue << "." << endl;

	cout << "Your car model is: " << flush;

	switch (Mvalue)
	{
	case 1:
		cout << "Seria 1" << endl;
		break;
	case 2:
		cout << "Seria 2" << endl;
		break;
	case 3:
		cout << "Seria 3" << endl;
		break;
	case 4:
		cout << "New Duster" << endl;
		break;
	case 5:
		cout << "Sandero" << endl;
		break;
	case 6:
		cout << "All new-jogger" << endl;
		break;
	case 7:
		cout << "A" << endl;
		break;
	case 8:
		cout << "B2" << endl;
		break;
	case 9:
		cout << "B10" << endl;
		break;
	default: 
		cout << "Please select a value from the menu." << endl;
		break;
	}
	
}

void Car::year()
{
	string Yvalue;

	cout << endl;
	cout << "Type the car year" << endl;

	cin >> Yvalue;

	cout << "The car year is: " << Yvalue << "." << endl;
}

void Car::reply()
{
	cout << endl;
	cout << "Nice choice!" << endl;
}

