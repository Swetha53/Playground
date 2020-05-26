#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int dol1,dol2,cent1,cent2,dollar,cent;
  cin>>dol1>>cent1>>dol2>>cent2;
  dollar = dol1+dol2;
  cent = cent1+cent2;
  if(cent>100)
  {
    dollar += (cent/100);
    cent = cent%100;
  }
  cout<<dollar<<"\n"<<cent;
  return 0;
}