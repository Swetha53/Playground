#include<iostream>
using namespace std;
int main()
{
  int f,l,perf,i,j;
  cin>>f;
  cin>>l;
  for(i=f;i<=l;i++)
  {
    perf = 1;
    for(j=2;j<i;j++)
    {
      if(i%j == 0)
        perf += j;
    }
    if(perf == i && perf!=1)
      cout<<i<<" ";
  }
  return 0;
}