#include <iostream>

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int num1, num2, num3;
    int max, sum;

    while (cin >> num1 >> num2 >> num3)
    {
        if (num1 + num2 + num3 == 0)
            break;

        max = num1 = num1 * num1;
        num2 = num2 * num2;
        num3 = num3 * num3;
        sum = num1 + num2 + num3;

        if (max < num2)
            max = num2;

        if (max < num3)
            max = num3;

        if (sum - max == max)
        {
            cout << "right\n";
        }
        else
        {
            cout << "wrong\n";
        }
    }
}
