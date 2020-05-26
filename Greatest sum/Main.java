#include<iostream>
#include<limits.h>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,i,j,max=INT_MIN,pos=0;
  cin>>m>>n;
  int a[m][n],row[m],col[n];
  for(i=0;i<m;i++)
  {
    row[i]=0;
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
      row[i]+=a[i][j];
    }
    if(row[i]>max)
    {
      max=row[i];
      pos = i;
    }
  }
  cout<<"Sum of rows is ";
  for(i=0;i<m;i++)
    cout<<row[i]<<" ";
  cout<<"\nRow "<<pos+1<<" has maximum sum\n";
  max=INT_MIN;
  pos=0;
  for(j=0;j<n;j++)
  {
    col[j]=0;
    for(i=0;i<m;i++)
    {
      col[j]+=a[i][j];
    }
    if(col[j]>max)
    {
      max=col[j];
      pos = j;
    }
  }
  cout<<"Sum of columns is ";
  for(j=0;j<n;j++)
    cout<<col[j]<<" ";
  cout<<"\nColumn "<<pos+1<<" has maximum sum";
  return 0;
}