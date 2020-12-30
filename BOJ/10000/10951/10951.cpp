#include <iostream>

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int num1, num2;
    while (true)
    {
        cin >> num1 >> num2;
        if (cin.eof())
        {
            break;
        }
        cout << num1 + num2 << "\n";
    }
}