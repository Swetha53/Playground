#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  int rail;
  char side[100];
  cin>>side>>rail;
  if(!strcmp(side,"front"))
  {
    if(rail == 1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else
  {
    if(rail == 1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
  return 0;
}