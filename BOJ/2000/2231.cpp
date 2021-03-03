#include <iostream>

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int N;
    cin >> N;

    int result = 0;
    for (int i = 0; i < N; i++)
    {
        int K = i;
        int sum = 0;
        while (K != 0)
        {
            sum = sum + (K % 10);
            K = K / 10;
        }

        if (sum + i == N)
        {
            cout << i << "\n";
            return 0;
        }
    }

    cout << "0\n";
}
