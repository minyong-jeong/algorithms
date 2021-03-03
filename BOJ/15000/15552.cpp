#include <iostream>
#include <string>

using namespace std;

int main()
{
    int T;
    int a, b;

    // Fast A + B
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    cin >> T;
    for (int i = 0; i < T; i++)
    {
        cin >> a >> b;
        cout << a + b << '\n';
    }
}