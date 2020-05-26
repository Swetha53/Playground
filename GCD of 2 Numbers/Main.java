#include<iostream>
using namespace std;
int gcd(int a,int b)
{
  if(a==0 || b==0)
    return 0;
  else if(a==b)
    return a;
  else if(a>b)
    return gcd(a-b,b);
  else
    return gcd(a,b-a);
}
int main()
{
  //Type your code here.
  int b,a,res;
  cin>>b>>a;
  cout<<"G.C.D of "<<b<<" and "<<a<<" = "<<gcd(a,b);
  return 0;
}