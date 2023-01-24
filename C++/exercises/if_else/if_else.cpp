// if, if-else, if-else-if

#include <iostream>

using namespace std;

int main()
{
	cout << "MENU" << endl << endl;

	cout << "1.\tAdd new record. " << endl;
	cout << "2.\tDelete record. " << endl;
	cout << "3.\tView record. " << endl;
	cout << "4.\tSearch record. " << endl;
	cout << "5.\tQuit. \n\n";

	cout << "Enter your selection > "<< flush;

	int value;
	cin >> value;

	if (value == 1) 
	{
		cout << "Adding new record..." << endl;
	}
	else if (value == 2) 
		{
			cout << "Deleting record..." << endl;
		}
		else if (value == 3) 
			{
				cout << " Viewing record... " << endl;
			}
			else if (value == 4) 
				{
					cout << "Searching record... > " << endl;
				}
				else if (value == 5) 
					{
						cout << "Quitting apllication..." << endl;
					}
					else
					{
						cout << "Invalid option. " << endl;
					}

	system("pause > 0");
}