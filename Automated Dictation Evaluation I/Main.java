#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char a[50],b[50];
  cin>>a>>b;
  if(strcmp(a,b)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  return 0;
}