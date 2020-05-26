#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int P,R,T;
  float si,amount,disc,gift;
  std::cin>>P>>R>>T;
  si = P*R*T/100;
  amount = P+si;
  disc = si*0.02;
  gift = amount - disc;
  std::cout<<si<<"\n"<<amount<<"\n"<<disc<<"\n"<<gift<<"\n";
  return 0;
}