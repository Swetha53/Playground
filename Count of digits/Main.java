#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int num,count=0;
  cin>>num;
  do
  {
    count++;
    num = num/10;
  }while(num!=0);
  cout<<count;
  return 0;
}