#include<iostream>
using namespace std;
void print(int n)
{
  if(n%2==0)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}
int main()
{
  //Type your code here.
  int n,m,res;
  cin>>n>>m;
  if(n<m)
    res = n;
  else
    res = m;
  print(res);
  return 0;
}