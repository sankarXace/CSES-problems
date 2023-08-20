#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, in;
    cin >> n;
    unordered_set<int> seen;
    for (int i = 0; i < n - 1; i++)
    {
        cin >> in;
        seen.insert(in);
    }
    for (int i = 1; i <= n; i++)
    {
        if (seen.find(i) == seen.end())
        {
            cout << i;
            break;
        }
    }
    return 0;
}