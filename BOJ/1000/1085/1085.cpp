#include <iostream>

using namespace std;

int main()
{
    cin.tie(NULL);
    ios::sync_with_stdio(false);

    int x, y, w, h;

    cin >> x >> y >> w >> h;

    int wlen = w - x;
    int hlen = h - y;

    wlen = (wlen > x) ? x : wlen;
    hlen = (hlen > y) ? y : hlen;
    int result = (wlen > hlen) ? hlen : wlen;

    cout << result << "\n";
}
