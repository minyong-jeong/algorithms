#include <iostream>

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int T;
    int num1, num2;

    cin >> T;
    for (int i = 0; i < T; i++)
    {
        cin >> num1 >> num2;
        cout << "Case #" << i + 1 << ": " << num1 << " + " << num2 << " = " << num1 + num2 << "\n";
    }
}