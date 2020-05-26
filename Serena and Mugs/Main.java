#include<iostream>
using namespace std;
int printresult(int *p,int n,int s)
{
  int i,sum=0;
  for(i=0;i<n;i++)
    sum+=*(p+i);
  if(sum>s)
    return 1;
  else
    return 0;
}
int main()
{
  //Type your code here.
  int i,n,s;
  cin>>n>>s;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  if(printresult(a,n,s)==0)
    cout<<"YES";
  else
    cout<<"NO";
  return 0;
}