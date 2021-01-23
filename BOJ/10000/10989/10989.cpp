#include <iostream>

#define MAX_SIZE 10000

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int N;
    cin >> N;

    int dic[MAX_SIZE + 1];
    for (int i = 0; i < MAX_SIZE + 1; i++)
    {
        dic[i] = 0;
    }

    int num;
    for (int i = 0; i < N; i++)
    {
        cin >> num;
        dic[num] += 1;
    }

    for (int i = 1; i <= MAX_SIZE; i++)
    {
        if (dic[i] != 0)
        {
            for (int j = 0; j < dic[i]; j++)
            {
                cout << i << "\n";
            }
        }
    }
}