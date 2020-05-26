#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int row,column,num;
  cin>>row>>column>>num;
  if(num>row&&num<=2*row || num>(column-2)*row&&num<=(column-1)*row)
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
  return 0;
}