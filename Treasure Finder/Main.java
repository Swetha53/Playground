#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,a,b,c,min,sec_max;
  cin>>a>>b>>c;
  if(a<b && a<c)
  {
    min = a;
    sec_max = b<c?b:c;
  }
  else if(b<c)
  {
    min = b;
    sec_max = a<c?a:c;
  }
  else
  {
    min = c;
    sec_max = a<b?a:b;
  }
  for(i=min;i>0;i--)
  {
    if(a%i==0 && b%i==0 && c%i==0)
      break;
  }
  cout<<"The treasure is in box which has number "<<sec_max;
  cout<<"\nThe code to open the box is "<<i;
}