#include<iostream>
#include<limits.h>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,m,n,max=INT_MIN;
  cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
      if(max<a[i][j])
        max=a[i][j];
    }
  }
  cout<<"The maximum element is "<<max;
  return 0;
}