#include<iostream>
using namespace std;
int main()
{
  int message,read,decode,temp=1,i=2;
  cin>>message;
  cin>>read;
  decode = message + read;
  while(i<decode)
  {
    if(decode%i==0)
      temp += i;
    i++;
  }
  if(decode == temp)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
  return 0;
}