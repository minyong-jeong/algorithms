#include <iostream>

using namespace std;

int fibonnaci(int n)
{
    if (n == 1)
    {
        return 1;
    }

    if (n == 0)
    {
        return 0;
    }

    int ret = 0;
    ret += fibonnaci(n - 1);
    ret += fibonnaci(n - 2);

    return ret;
}

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int n;
    cin >> n;

    cout << fibonnaci(n) << "\n";
}
