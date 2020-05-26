#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int wt,adult,child,result;
  cin>>wt>>adult>>child;
  result = 75*adult + 30*child;
  if(result<=wt)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
  return 0;
}