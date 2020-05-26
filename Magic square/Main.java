#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,n,diag=0,other=0;
  cin>>n;
  int a[n][n];
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      if(i==j)
        diag+=a[i][j];
      if(i+j==n-1)
        other+=a[i][j];
    }
  }
  if(diag==other)
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}