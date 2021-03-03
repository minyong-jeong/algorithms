#include <iostream>

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int H, M;
    cin >> H >> M;

    if (M >= 45)
    {
        M = M - 45;
    }
    else
    {
        H = H - 1;
        M = M + 15;

        if (H < 0)
        {
            H = 24 + H;
        }
    }

    cout << H << " " << M << "\n";
}