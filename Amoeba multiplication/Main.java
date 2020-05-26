#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum,prev=0,next=1;
  cin>>n;
  if(n==1)
    cout<<"0";
  else
  {
    for(int i=2;i<n;i++)
    {
      sum = prev+next;
      prev = next;
      next = sum;
    }
    cout<<sum;
  }
  return 0;
}