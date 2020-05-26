#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int i,j,r,c;
  cin>>r>>c;
  int a[r][c],b[c][r];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      b[j][i]=a[i][j];
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
      cout<<b[i][j]<<" ";
    cout<<endl;
  }
  return 0;
}