#include <iostream>

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int N, M;
    cin >> N >> M;

    char board[N][M];
    for (int i = 0; i < N; i++)
    {
        cin >> board[i];
    }

    int min = 64;
    for (int i = 0; i <= N - 8; i++)
    {
        for (int j = 0; j <= M - 8; j++)
        {
            int c1 = 0;
            int c2 = 0;

            for (int x = i; x < i + 8; x++)
            {
                for (int y = j; y < j + 8; y++)
                {
                    if ((x + y) % 2 == 0)
                    {
                        if (board[x][y] == 'W')
                        {
                            c1++;
                        }
                        else
                        {
                            c2++;
                        }
                    }
                    else
                    {
                        if (board[x][y] == 'W')
                        {
                            c2++;
                        }
                        else
                        {
                            c1++;
                        }
                    }
                }
            }

            if (min > c1)
            {
                min = c1;
            }

            if (min > c2)
            {
                min = c2;
            }
        }
    }

    cout << min << "\n";
}