#include <iostream>
#include <unordered_map>

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int N;
    cin >> N;
    unordered_map<int, int> dic;

    int num;
    for (int i = 0; i < N; i++)
    {
        cin >> num;
        if (dic.find(num) == dic.end())
        {
            dic[num] = 1;
        }
        else
        {
            dic[num] += 1;
        }
    }

    for (int i = 1; i <= 10000; i++)
    {
        if (dic.find(i) != dic.end())
        {
            for (int j = 0; j < dic[i]; j++)
            {
                cout << i << "\n";
            }
        }
    }
}