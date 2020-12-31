#include <iostream>

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int A, B, V;

    cin >> A >> B >> V;

    V = V - A;
    int move = A - B;
    int result = V / move;
    int remain = V % move;

    if (remain == 0)
    {
        cout << result + 1 << "\n";
    }
    else
    {
        cout << result + 2 << "\n";
    }
}
