#include<iostream>
using namespace std;
int main()
{
  int n,sum=6,count=5;
  cin>>n;
  cout<<6<<" ";
  for(int i=1;i<n;i++)
  {
    sum += count*i;
    cout<<sum<<" ";
  }
  return 0;
}