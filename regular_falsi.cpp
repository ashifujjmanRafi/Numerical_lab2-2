#include <bits/stdc++.h>
using namespace std;
#define MAX_ITER 1000000

double func(double x)
{
    return x * x * x - x - 1;
}
void falsi(double a, double b)
{
    if (func(a) * func(b) > 0)
    {
        cout << "assumed wrong bound";
        return;
    }
    double c = a;
    for (int i = 0; i < MAX_ITER; i++)
    {
        c = (a * func(b) - b * func(a)) / (func(b) - func(a));
        if (func(c) == 0)
            break;
        else if (func(a) * func(c) > 0)
        {
            a = c;
        }
        else b=c;
    }
    cout << "The value of root is : " << c; 
    
}
int main()
{
    falsi(-200,300);
    return 0;

} 