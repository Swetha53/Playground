#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
  char cap[100];
  int i,count=0;
  cin.getline(cap,100);
  for(i=0;cap[i]!='\0';i++)
  {
    if(cap[i]==' ')
      count++;
  }
  if(count>10)
    cout<<"Caption not eligible for the contest"<<endl;
  else
    cout<<"Caption eligible for the contest"<<endl;
   return 0;
}