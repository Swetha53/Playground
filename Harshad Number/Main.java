#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,temp,sum=0;
  cin>>n;
  temp = n;
  while(temp!=0)
  {
    sum += (temp%10);
    temp = temp/10;
  }
  if(n%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  return 0;
}