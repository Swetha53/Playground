#include<iostream>
#include<string>
#include<ctype.h>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  int vow=0,con=0,space=0,dig=0,sym=0;
  getline(cin,str);
  for(int i=0;i<str.length();i++)
  {
    if(isdigit(str[i]))
      dig++;
    else if(str[i]==' ')
      space++;
    else if(tolower(str[i])=='a' || tolower(str[i])=='e' || tolower(str[i])=='i' || tolower(str[i])=='o' || tolower(str[i])=='u')
      vow++;
    else if(isalpha(str[i]))
      con++;
    else
      sym++;
  }
  cout<<"Vowels:"<<vow<<endl;
  cout<<"Consonants:"<<con<<endl;
  cout<<"White Spaces:"<<space<<endl;
  cout<<"Digits:"<<dig<<endl;
  cout<<"Symbols:"<<sym<<endl;
  return 0;
}