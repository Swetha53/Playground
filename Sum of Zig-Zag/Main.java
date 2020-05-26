#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j,sum;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  int row1=0,rown=0,diag=0;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(i==0)
        row1+=a[i][j];
      else if(i==r-1)
        rown+=a[i][j];
      else if((i+j)==(r-1))
        diag+=a[i][j];
    }
  }
  cout<<"Sum of Zig-Zag pattern is "<<row1+rown+diag;
  return 0;
}