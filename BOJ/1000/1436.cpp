#include <iostream>

using namespace std;

int check(int num)
{
    int cnt = 0;
    for (int i = num; i > 0; i /= 10)
    {
        if (num % 10 == 6)
            cnt++;
        else
            cnt = 0;

        if (cnt == 3)
            break;
        num /= 10;
    }

    return cnt == 3;
}

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int N;
    cin >> N;

    int num = 666;
    int count = 0;
    while (true)
    {
        if (check(num))
            count++;

        if (count == N)
            break;
        num++;
    }
    cout << num << "\n";
    return 0;
}