#include <iostream>

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int x[4];
    int y[4];

    cin >> x[0] >> y[0];
    cin >> x[1] >> y[1];
    cin >> x[2] >> y[2];

    x[3] = (x[2] == x[1]) ? (x[0]) : ((x[2] == x[0]) ? x[1] : x[2]);
    y[3] = (y[2] == y[1]) ? (y[0]) : ((y[2] == y[0]) ? y[1] : y[2]);

    cout << x[3] << " " << y[3] << "\n";
}
