#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float time,val=13.30;
  cin>>age>>time;
  if(time==val)
  {
    if(age<=13)
      cout<<"$2.00";
    else
      cout<<"$5.00";
  }
  else
  {
    if(age>13)
      cout<<"$8.00";
    else
      cout<<"$4.00";
  }
  return 0;
}