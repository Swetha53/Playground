#include<iostream>
using namespace std;
int main()
{
  int n,i,j;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<i;j++)
      cout<<i<<"*";
    cout<<i<<endl;
  }
  for(i=n;i>=1;i--)
  {
    for(j=1;j<i;j++)
      cout<<i<<"*";
    cout<<i<<endl;
  }
  return 0;
}