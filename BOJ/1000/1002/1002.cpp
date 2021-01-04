#include <iostream>

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int T;
    int x1, y1, r1, x2, y2, r2;

    cin >> T;
    for (int i = 0; i < T; i++)
    {
        cin >> x1 >> y1 >> r1 >> x2 >> y2 >> r2;

        int distX = x1 - x2;
        int distY = y1 - y2;
        int squaredDist = distX * distX + distY * distY;
        int rDist = r1 + r2;
        int rDist2 = r1 - r2;
        int squaredRDist = rDist * rDist;
        int squaredRDist2 = rDist2 * rDist2;

        if (squaredDist == 0 && r1 == r2)
        {
            cout << "-1\n";
        }
        else if (squaredDist == 0 && r1 != r2)
        {
            cout << "0\n";
        }
        else if (squaredRDist2 < squaredDist && squaredDist < squaredRDist)
        {
            cout << "2\n";
        }
        else if (squaredDist == squaredRDist || squaredDist == squaredRDist2)
        {
            cout << "1\n";
        }
        else
        {
            cout << "0\n";
        }
    }
}
