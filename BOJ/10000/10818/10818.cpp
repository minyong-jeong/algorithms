#include <iostream>

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int T;
    cin >> T;

    int num;
    int min = 1000001;
    int max = -1000001;
    for (int i = 0; i < T; i++)
    {
        cin >> num;
        if (min > num)
        {
            min = num;
        }

        if (max < num)
        {
            max = num;
        }
    }

    cout << min << " " << max << "\n";
}