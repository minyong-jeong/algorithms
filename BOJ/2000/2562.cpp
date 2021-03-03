#include <iostream>

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int num;
    int loc = 0;
    int max = 0;
    for (int i = 1; i <= 9; i++)
    {
        cin >> num;
        if (num > max)
        {
            loc = i;
            max = num;
        }
    }

    cout << max << "\n";
    cout << loc << "\n";
}