#include <iostream>

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int N, M;
    cin >> N >> M;

    int num[N];
    for (int i = 0; i < N; i++)
    {
        cin >> num[i];
    }

    int max = -1;
    for (int i = 0; i < N; i++)
    {
        for (int j = i + 1; j < N; j++)
        {
            for (int z = j + 1; z < N; z++)
            {
                int sum = num[i] + num[j] + num[z];
                if (sum <= M && sum > max)
                {
                    max = sum;
                }
            }
        }
    }

    cout << max << "\n";
}
