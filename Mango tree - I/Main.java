#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int row,col,num;
  cin>>row>>col>>num;
  if(num%col == 1 || num%col == 0)
    cout<<"Yes";
  else if(num<=col)
    cout<<"Yes";
  else 
    cout<<"No";
  return 0;
}