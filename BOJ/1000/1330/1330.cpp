#include <iostream>

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int num1, num2;
    cin >> num1;
    cin >> num2;

    if (num1 < num2)
    {
        cout << "<\n";
    }
    else if (num1 > num2)
    {
        cout << ">\n";
    }
    else
    {
        cout << "==\n";
    }
}