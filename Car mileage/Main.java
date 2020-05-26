#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mil;
  int pet, dist;
  cin>>mil>>pet>>dist;
  if(dist<=(pet*mil))
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  return 0;
}