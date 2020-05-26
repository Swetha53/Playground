#include<iostream>
using namespace std;
int gcd(int x,int y)
{
  int small;
  if(x<y)
    small = x;
  else
    small = y;
  while(small>1)
  {
    if(x%small == 0 && y%small == 0)
      return small;
    small--;
  }
  return 1;
}
int main()
{
  int x1,x2,a,b,c,res;
  cin>>a>>b>>c>>res;
  x1=gcd(a,b);
  x2=gcd(b,c);
  if(gcd(x1,x2)==res)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
  return 0;
}