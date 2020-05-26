#include<iostream>
using namespace std;
int main()
{
  int n;
  float sum=0.5;
  cin>>n;
  if(n>=1)
    cout<<"0.5 ";
  for(int i=2;i<=n;i++)
  {
    sum = sum*3;
    cout<<sum<<" ";
  }
  return 0;
}