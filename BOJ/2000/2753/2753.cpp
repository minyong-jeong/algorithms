#include <iostream>

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int num;
    cin >> num;

    if (num % 4 == 0 && (num % 100 != 0 || num % 400 == 0))
    {
        cout << "1\n";
    }
    else
    {
        cout << "0\n";
    }
}