#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num;
  float heat;
  cin>>num>>heat;
  if(num==1)
    cout<<heat;
  else if(num==2)
    cout<<heat + heat*0.5;
  else if(num==3)
    cout<<2*heat;
  else
    cout<<"Number of items is more";
  return 0;
}