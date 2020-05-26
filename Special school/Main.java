#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  string rev,str;
  cin>>str>>rev;
  int j=0,flag=0;
  for(string::reverse_iterator i=rev.rbegin();i<rev.rend();i++)
  {
    if(str.at(j)!=*i)
    {
      flag=1;
      break;
    }
    j++;
  }
  if(flag==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  return 0;
}