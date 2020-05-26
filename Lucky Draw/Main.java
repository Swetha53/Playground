#include<iostream>
using namespace std;
int main()
{
  int n,flag=0;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(n%i==0)
      flag++;
  }
  if(flag==2)
    cout<<"Eligible";
  else
    cout<<"Not eligible";
  return 0;
}