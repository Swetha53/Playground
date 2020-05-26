#include<iostream>
using namespace std;
int check(string str,string name[40],int n,int pos)
{
  int i;
  for(i=0;i<n-1;i++)
  {
    //cout<<name[i]<<str<<endl;
    if(str==name[i] && i!=pos)
    {
      //out<<name[i]<<endl;
      return 0;
    }
  }
  return 1;
}
int main()
{
  //Type your code here.
  int j,i=0;
  string str[20];
  do{
    cin>>str[i];
    i++;
  }while(str[i-1]!="####");
  cout<<str[0]<<endl;
  for(j=1;j<i-1;j++)
  {
    if(check(str[j],str,i,j)==1)
    {
      if(str[j-1].at(str[j-1].length()-1)==str[j].at(0))
        cout<<str[j]<<endl;
      else
        break;
    }
    else
      break;
  }
  return 0;
}