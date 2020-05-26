#include<iostream>
#include<string>
#include<ctype.h>
using namespace std;
int main()
{
  //Type your code here.
  string str,temp;
  cin>>str;
  if(!isalpha(str[0]))
  {
    str.assign(str,1,str.length()-1);
  }
  for(int i=1;i<str.length();i++)
  {
    if(!isalpha(str[i]))
    {
      temp.assign(str,0,i);
      temp.append(str,i+1,str.length()-1);
      str.assign(temp);
      i--;
    }
  }
  cout<<str;
  return 0;
}