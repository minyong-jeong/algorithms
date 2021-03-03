#include <iostream>

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    string A, B;
    string ans = "";

    cin >> A >> B;

    int aLoc = A.size() - 1;
    int bLoc = B.size() - 1;
    int carry = 0;

    while (aLoc >= 0 || bLoc >= 0)
    {
        int n1 = 0;
        int n2 = 0;

        if (aLoc >= 0)
        {
            n1 = A[aLoc--] - '0';
        }

        if (bLoc >= 0)
        {
            n2 = B[bLoc--] - '0';
        }

        int r = n1 + n2 + carry;
        carry = r / 10;
        r = r % 10;
        char c = r + '0';
        ans = c + ans;
    }

    if (carry > 0)
    {
        char c = carry + '0';
        ans = c + ans;
    }

    cout << ans << "\n";
}
