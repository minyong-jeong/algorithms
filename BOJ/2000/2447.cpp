#include <iostream>
#include <vector>

using namespace std;

void createTree(vector<vector<char>> &ans, int x, int y, int n)
{
    if (n == 3)
    {
        ans[x][y] = ' ';
        return;
    }
    else
    {
        int d = n / 6;
        for (int i = x - d; i <= x + d; i++)
        {
            for (int j = y - d; j <= y + d; j++)
            {
                ans[i][j] = ' ';
            }
        }
    }

    int nextN = n / 3;
    for (int i = -1; i <= 1; i++)
    {
        for (int j = -1; j <= 1; j++)
        {
            createTree(ans, x + i * nextN, y + j * nextN, nextN);
        }
    }
}

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int n;
    cin >> n;

    vector<vector<char>> ans(n, vector<char>(n, '*'));

    int middle = n / 2;
    createTree(ans, middle, middle, n);

    for (int i = 0; i < ans.size(); i++)
    {
        for (int j = 0; j < ans[i].size(); j++)
        {
            cout << ans[i][j];
        }
        cout << "\n";
    }
}
