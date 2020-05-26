#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int unit,cost;
  cin>>unit;
  if(unit<=200)
    cost = 0.5*unit;
  else if(unit<=400)
    cost = 0.65*unit + 100;
  else if(unit<=600)
    cost = 0.80*unit + 200;
  else
    cost = 1.25*unit + 425;
  cout<<"Rs."<<cost;
  return 0;
}