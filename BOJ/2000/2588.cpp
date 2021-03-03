#include <iostream>
#include <string>

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int num1, num2;
    cin >> num1;
    cin >> num2;

    int one = num1 * (num2 % 10);
    int ten = num1 * (num2 % 100 / 10);
    int hundred = num1 * (num2 / 100);

    cout << one << '\n';
    cout << ten << '\n';
    cout << hundred << '\n';

    cout << one + ten * 10 + hundred * 100 << '\n';
}