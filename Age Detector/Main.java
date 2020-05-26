#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int curr,dob,age;
  cin>>dob>>curr;
  if(dob>curr)
    curr += 100;
  age = curr - dob;
  cout<<age;
  return 0;
}