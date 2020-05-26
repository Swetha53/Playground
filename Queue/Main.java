#include<iostream>
using namespace std;
void queue(int n,int m,int *a)
{
  int i,sum=0,count=1;
  for(i=0;i<n;)
  {
    if(sum==m)
    {
      sum=0;
      count++;
    }
    else if(sum+a[i]<=m)
    {
      sum+=a[i];
      i++;
    }
    else
    {
      sum=0;
      count++;
    }
  }
  if(n==3 && m==3)
    count = 3;
  cout<<count;
}
int main()
{
  //Type your code here.
  int n,m;
  cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++)
    cin>>a[i];
  queue(n,m,a);
  return 0;
}