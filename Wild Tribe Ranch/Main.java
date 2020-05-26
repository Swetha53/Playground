#include<iostream>
using namespace std;
int main()
{
  int wt,max_wt;
  cin>>max_wt>>wt;
  if(wt<max_wt)
    cout<<"Yes, you can enter.";
  else if(wt==max_wt)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
    cout<<"Sorry, you can't enter";
  return 0;
}