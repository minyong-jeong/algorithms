#include <iostream>
#include <vector>

using namespace std;

void hanoi(int n, int start, int to, int via, vector<string> &v)
{
    if (n == 1)
    {
        v.push_back(to_string(start) + " " + to_string(to));
    }
    else
    {
        hanoi(n - 1, start, via, to, v);
        v.push_back(to_string(start) + " " + to_string(to));
        hanoi(n - 1, via, to, start, v);
    }
}

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int N;
    cin >> N;

    vector<string> v;
    hanoi(N, 1, 3, 2, v);

    cout << v.size() << "\n";
    for (int i = 0; i < v.size(); i++)
    {
        cout << v[i] << "\n";
    }
}
