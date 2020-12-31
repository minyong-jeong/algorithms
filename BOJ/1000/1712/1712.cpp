#include <iostream>

using namespace std;

int main()
{
    int A, B, C;

    cin.tie(NULL);
    ios::sync_with_stdio(false);

    cin >> A >> B >> C;

    int profit = C - B;
    if (profit <= 0)
    {
        cout << "-1\n";
    }
    else
    {
        cout << A / profit + 1 << "\n";
    }
}
