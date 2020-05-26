#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,temp,count=0,sum_o=0,sum_e=0;
  cin>>n;
  temp=n;
  while(temp!=0)
  {
    count++;
    if(count%2==1)
    sum_o += (temp%10);
    else
      sum_e += (temp%10);
    temp = temp/10;
  }
  if(sum_o == sum_e)
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}