#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=11;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    cout<<sum*sum<<" ";
    sum += 4;
  }
  return 0;
}