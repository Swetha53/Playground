#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int target,num,sum=0,count=0;
  cin>>target;
  while(sum<target)
  {
    cin>>num;
    sum+=num;
    count++;
  }
  cout<<"The number of turns is "<<count;
  return 0;
}