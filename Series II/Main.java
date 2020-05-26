#include<iostream>
using namespace std;
int main()
{
  int n,sum,flag=11;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cout<<flag*flag<<" ";
    flag += 4;
  }
  return 0;
}