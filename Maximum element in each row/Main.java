#include<iostream>
#include<limits.h>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,m,n;
  cin>>m>>n;
  int a[m][n],max[m];
  for(i=0;i<m;i++)
  {
    max[i]=INT_MIN;
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
      if(a[i][j]>max[i])
        max[i]=a[i][j];
    }
  }
  for(i=0;i<m;i++)
    cout<<max[i]<<endl;
  return 0;
}